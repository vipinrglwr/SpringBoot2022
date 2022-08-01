package com.example.demo.prspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee{

    @Autowired
    private Deollite deollite;

   public void id(){

       deollite.company();

        System.out.println("Emplloyee ID");


    }

}
