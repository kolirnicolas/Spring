package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Frame implements CreateBigBike {

    @Override
    public void createBigBike() {
        System.out.println("ты на раме браток");
    }
}
