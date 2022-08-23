package com.example.demo.crmapplication.controller;

import com.example.demo.crmapplication.entity.Registration;
import com.example.demo.crmapplication.repository.RegistrationRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class RegistrationCont {

    @Autowired
    private RegistrationRepository registrationRepository;

    @PostMapping("/checkLogin")
    public Map<String,Object> checkLogin(@RequestBody LoginDto loginDto){

       Optional<Registration>  registration = registrationRepository.findByUserNameAndPassword
                (loginDto.getUserName(), loginDto.getPassword());
        Map<String,Object> map =new HashMap<>();
        System.out.println(registration);

        //user found
        if (registration !=null){
            map.put("message","Success");
            map.put("status",200);
            return map;
        }
        //user not found
        map.put("message","Failed");

        return map;
    }

    @PostMapping("/saveUser")
    public String saveUser(@RequestBody Registration registration){
        registrationRepository.save(registration);
        return "User saved!!!";
    }

//    @GetMapping("/getallusers")
//    public List<Registration> findAllUsers(){
//        return registrationRepository.findAll();
//    }
}

