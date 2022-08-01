package com.example.demo.jpa.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentDatabase,Integer> {
}
