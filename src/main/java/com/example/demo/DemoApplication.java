package com.example.demo;

import com.example.demo.aop.BoysStudent;
import com.example.demo.aop.GirlStudent;
import com.example.demo.aop.assignment1.Login1;
import com.example.demo.aop.assignment1.Login2;
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

		Login1 login1 = context.getBean(Login1.class);
		login1.member();

		Login2 login2 =context.getBean(Login2.class);
		login2.member();

//		BoysStudent boysStudent = context.getBean(BoysStudent.class);
//		boysStudent.studyBoy(2);
//
//		GirlStudent girlStudent =context.getBean(GirlStudent.class);
//		girlStudent.study();


//		Student student =context.getBean(Student.class);
//		student.callSubject();
//
//		Student student1 =context.getBean(Student.class);
//		student1.callSubject();


//		Employee employee = context.getBean(Employee.class);
//		employee.id();




	}
@GetMapping("Hii")

	public String hii(){
		return "Hello World";
}
}
