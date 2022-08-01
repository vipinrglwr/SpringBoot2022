package com.example.demo.onetoone;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AadharRepo extends JpaRepository<Person,Long> {
}
