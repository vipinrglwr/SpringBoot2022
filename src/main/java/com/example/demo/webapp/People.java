package com.example.demo.webapp;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    private String user_firstName;
    private String user_lastName;
    private String user_gender;
    private String user_dob;
    private String user_address;
    private String user_email;
    private String mobile;
    private String user_password;

}
