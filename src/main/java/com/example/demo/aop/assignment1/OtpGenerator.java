package com.example.demo.aop.assignment1;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class OtpGenerator {
    @After("execution(public void member())")
    public void otp(){
        System.out.println("Your OTP Is 5877");
    }
}
