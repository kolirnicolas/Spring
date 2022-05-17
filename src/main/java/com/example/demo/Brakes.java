package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Brakes implements CreateBigBike {
    @Override
    public void createBigBike() {
        System.out.println("Тормози браток");
    }
}
