package com.example.demo.jpa.student;

import com.example.demo.prspring.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired

    private StudentRepo studentRepo;

    @PostMapping("StudentDatabase/save")

    public String saveStudent(@RequestBody StudentDatabase studentDatabase){
        studentRepo.save(studentDatabase);

        return "Student Database Connection Successful";
    }




}
