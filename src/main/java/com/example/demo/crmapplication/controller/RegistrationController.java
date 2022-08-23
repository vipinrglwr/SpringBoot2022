//package com.example.demo.crmapplication.controller;
//
//import com.example.demo.crmapplication.entity.Registration;
//import com.example.demo.crmapplication.repository.RegistrationRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/v1/auth/")
//@CrossOrigin(origins="*")
//public class RegistrationController {
//
//    @Autowired
//    private RegistrationRepository registrationRepository;
//
//
//    @PostMapping("register")
//    public String register(@Valid @RequestBody Registration registration){
//        registrationRepository.save(registration);
//        return "Registered Successfully";
//    }
//
//    @GetMapping("login")
//    public String login(@RequestBody LoginDto loginDto){
//
//        Optional<Registration> registration=registrationRepository.findByUserNameAndPassword(loginDto.getUserName(),loginDto.getPassword());
//        if (registration.isPresent()){
//            return "Login Successfully";
//        }else{
//            return "Login Failed";
//        }
//
//    }
//
//}
