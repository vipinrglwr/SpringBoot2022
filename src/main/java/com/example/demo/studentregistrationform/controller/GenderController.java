package com.example.demo.studentregistrationform.controller;

import com.example.demo.studentregistrationform.entity.Gender;
import com.example.demo.studentregistrationform.repository.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class GenderController<UserParams> {

    @Autowired
    private GenderRepository genderRepository;

    @PostMapping("saveGender")
    public String saveGender(@RequestBody Gender gender){
        genderRepository.save(gender);

        return "save Gender";
    }

 @GetMapping("getGender")
    public List<Gender> getGender(){
        return genderRepository.findAll();
    }

}
