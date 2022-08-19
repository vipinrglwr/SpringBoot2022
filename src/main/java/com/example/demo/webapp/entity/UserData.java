package com.example.demo.webapp.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Getter
@Setter
@Entity
public class UserData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    private String user_firstName;
    private String user_lastName;
    private String user_gender;
    private String user_dob;
    private String user_address;
    private String user_email;
    private String user_mobile;
    private String user_password;

}
