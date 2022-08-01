package com.example.demo;

import com.example.demo.databaseconnection.Employee;
import com.example.demo.databaseconnection.EmployeeRepo;
import com.example.demo.di.Student;
import com.example.demo.ioc.Vodafone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		Vodafone vodafone = context.getBean(Vodafone.class);

		vodafone.data();
		vodafone.calling();

		Student student =context.getBean(Student.class);
		student.callSubject();

		Student student1 =context.getBean(Student.class);
		student1.callSubject();


//		Employee employee = context.getBean(Employee.class);
//		employee.id();




	}
@GetMapping("Hii")

	public String hii(){
		return "Hello World";
}
}
