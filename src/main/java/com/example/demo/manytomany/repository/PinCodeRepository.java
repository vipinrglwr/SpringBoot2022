package com.example.demo.manytomany.repository;

import com.example.demo.manytomany.entity.PinCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PinCodeRepository extends JpaRepository<PinCode,Long> {
}
