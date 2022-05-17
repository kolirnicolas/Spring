package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Transmission implements CreateBigBike {
    @Override
    public void createBigBike() {
        System.out.println("Transmission -передача инфекции сказал гугл ");
    }
}
