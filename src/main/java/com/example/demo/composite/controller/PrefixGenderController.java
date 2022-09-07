package com.example.demo.composite.controller;

import com.example.demo.composite.entity.Gender;
import com.example.demo.composite.entity.Prefix;
import com.example.demo.composite.entity.PrefixGenderMapping;
import com.example.demo.composite.entity.PrefixGenderMappingId;
import com.example.demo.composite.repository.GenderRepository;
import com.example.demo.composite.repository.PrefixGenderMappingRepository;
import com.example.demo.composite.repository.PrefixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrefixGenderController {

    @Autowired
    private GenderRepository genderRepository;

    @Autowired
    private PrefixRepository prefixRepository;

    @Autowired
    private PrefixGenderMappingRepository prefixGenderMappingRepository;

    @PostMapping("saveGender")
    private Gender saveGender(@RequestBody Gender gender){
        return genderRepository.save(gender);
    }

    @PostMapping("savePrefix")
    private String  savePrefix(@RequestBody Prefix prefix){
        Prefix prefix1 =  prefixRepository.save(prefix);

        PrefixGenderMappingId prefixGenderMappingId = new PrefixGenderMappingId();
        prefixGenderMappingId.setGenderId(prefix.getGender());
        prefixGenderMappingId.setPrefixId(prefix1.getId());

        PrefixGenderMapping prefixGenderMapping = new PrefixGenderMapping();
        prefixGenderMapping.setPrefixGenderMappingId(prefixGenderMappingId);

        prefixGenderMappingRepository.save(prefixGenderMapping);
        return "prefix saved";
    }
}