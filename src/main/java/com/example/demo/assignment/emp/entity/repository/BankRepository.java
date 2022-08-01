package com.example.demo.assignment.emp.entity.repository;

import com.example.demo.assignment.emp.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank,Long> {
}
