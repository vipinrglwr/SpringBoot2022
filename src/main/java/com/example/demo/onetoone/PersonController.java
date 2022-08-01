package com.example.demo.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonRepo personRepo;

    @Autowired
    private AadharRepo aadharRepo;

    @PostMapping("/savePerson")
    public  String savePerson(@RequestBody Person person){
        personRepo.save(person);
        return "Person Saved";
    }




}
