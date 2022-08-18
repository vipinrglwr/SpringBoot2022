package com.example.demo.storeproedure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class SPController {

    @Autowired
    private SPRepository spRepository;

    @GetMapping("getData")
    public List<Map<String,String>> getData(){
        return spRepository.getVehicle();
    }


}
