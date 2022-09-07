//package com.example.demo.studentregistrationform.controller;
//
//import com.example.demo.studentregistrationform.entity.Courses;
//import com.example.demo.studentregistrationform.repository.CoursesRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class CoursesController {
//
//    @Autowired
//    private CoursesRepository coursesRepository;
//
//   @PostMapping("saveCourses")
//    public String saveCourse(@RequestBody Courses courses){
//       coursesRepository.save(courses);
//
//       return "saved Courses";
//   }
//
//   @GetMapping("getCourses")
//    public List<Courses> getCourses(){
//       return coursesRepository.findAll();
//   }
//
//}
