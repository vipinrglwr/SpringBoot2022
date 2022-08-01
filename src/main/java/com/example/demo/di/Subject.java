package com.example.demo.di;

import org.springframework.stereotype.Component;

@Component
public class Subject {

    Integer number ;
    Double marks;
//
//    public Subject(Integer number, Double marks) {
//        this.number = number;
//        this.marks = marks;
//    }

    public void getSubject(){
        System.out.println("Getting Subject");
    }

}
