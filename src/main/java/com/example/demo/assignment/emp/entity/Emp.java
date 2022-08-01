package com.example.demo.assignment.emp.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class Emp {

    @Id
    @GeneratedValue

    private Long id ;

    private String name ;

    private  String address ;
    @OneToMany(mappedBy = "emp",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Bank> bank;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Bank> getBank() {
        return bank;
    }

    public void setBank(List<Bank> bank) {
        this.bank = bank;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
