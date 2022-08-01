package com.example.demo.ioc;

public class Vodafone implements  Sim{
    @Override
    public void calling() {
        System.out.println("Calling");
    }

    @Override
    public void data() {
        System.out.println("data");
    }
}
