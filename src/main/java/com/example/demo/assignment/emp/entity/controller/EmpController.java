package com.example.demo.assignment.emp.entity.controller;

import com.example.demo.assignment.emp.entity.repository.BankRepository;
import com.example.demo.assignment.emp.entity.repository.EmpRepository;
import com.example.demo.assignment.emp.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

    @Autowired
    private EmpRepository empRepository;

    @Autowired
    private BankRepository bankRepository;

    @PostMapping("saveEmp")
    public String saveEmp(@RequestBody Emp emp){
        Emp emp1 = empRepository.save(emp);

        emp.getBank().forEach(s ->{
            s.setEmp(emp1);
            s.setIfscCode(s.getIfscCode());
            s.setAccountNumber(s.getAccountNumber());
            bankRepository.save(s);



        });
        return "saved Emp" ;
    }


}
