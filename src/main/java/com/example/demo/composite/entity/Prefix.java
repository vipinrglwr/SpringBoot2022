package com.example.demo.composite.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Prefix {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Transient
    private Long gender;
}
