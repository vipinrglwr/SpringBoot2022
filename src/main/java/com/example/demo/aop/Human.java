package com.example.demo.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {
    //advice
// @Before("point()") //point cut expression
// public void getUp(){
//     System.out.println("Get Up");
// }
//
// @After("execution(public void study*())")
// public void sleep(){
//     System.out.println("Sleep");
//
//
// }
//
// @Pointcut("execution(public void study*(..))")
//    public void point(){}

    @AfterReturning(value="execution(public int studyBoy(..))",returning = "value")
public void afterRet(int value){
        System.out.println("Value Is =>"+value);
    }


}
