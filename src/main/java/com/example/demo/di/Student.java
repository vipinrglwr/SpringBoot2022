package com.example.demo.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Student {

//    Integer id ;
//
//    String name ;
//
//    String address;
//
//
//
//
    Student(){
        System.out.println("In Constructer");
    }
    @Autowired
    private Subject subject;

    public void callSubject(){
        subject.getSubject();
    }

//    public Student(Integer id, String name, String address) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//    }






}
