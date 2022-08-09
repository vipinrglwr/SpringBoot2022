package com.example.demo.studentregistrationform.repository;

import com.example.demo.studentregistrationform.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepository extends JpaRepository<Courses,Long> {

}
