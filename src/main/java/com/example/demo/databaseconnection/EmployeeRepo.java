package com.example.demo.databaseconnection;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepo extends JpaRepository <Employee,Integer> {
    Employee findByName(String name);


    Employee findByNameAndAddress(String name, String address);

    Employee findByDobBetween(LocalDate firstDate,LocalDate secondDate);

    List<Employee> findByAgeLessThan (Integer age);

    List<Employee> findByAgeGreaterThanEqual (Integer age);

    List<Employee> findByDobAfter(LocalDate dob);

//    Employee findByNameOrAddress(String name,String address);

//    List<Employee> findByFirstnameLike(String name);

//    List<Employee> findByNameLike(String name);

//    List<Employee> findByAgeIsNull(Integer age);

//    List<Employee> findDistinctByFirstname(String name);

@Query(value = "select * from employee",nativeQuery = true)
public  List<Employee> getEmployee();




}
