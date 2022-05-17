package com.example.demo;

public class BigBikeWithListInjected implements CreateBigBike {

    public void run(String... args) {

        for (String arg : args) {
            System.out.println(arg);
        }
    }

    @Override
    public void createBigBike() {


    }
}
