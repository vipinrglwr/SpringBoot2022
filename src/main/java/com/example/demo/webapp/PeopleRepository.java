package com.example.demo.webapp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People,Integer> {
}
