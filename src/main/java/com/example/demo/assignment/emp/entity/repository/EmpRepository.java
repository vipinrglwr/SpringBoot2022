package com.example.demo.assignment.emp.entity.repository;

import com.example.demo.assignment.emp.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Emp,Long> {
}
