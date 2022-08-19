package com.example.demo.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {

    @Autowired
    private PeopleRepository peopleRepository;


    @PostMapping("savePeople")
    public String savePeoples(@RequestBody People people){
        peopleRepository.save(people);
        return "Save People";
    }


}
