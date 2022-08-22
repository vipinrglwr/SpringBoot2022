package com.example.demo.crmapplication.repository;

import com.example.demo.crmapplication.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RegistrationRepository extends JpaRepository<Registration,Integer> {
    Optional<Registration> findByUserNameAndPassword(String userName, String password);
}
