package com.example.demo.manytomany.repository;

import com.example.demo.manytomany.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Long> {
}
