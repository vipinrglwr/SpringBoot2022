package com.example.demo.aop;

import org.springframework.stereotype.Component;

@Component
public class  BoysStudent {
    public int studyBoy(int i){
        System.out.println("Boys Study");

        return 100;
    }
}
