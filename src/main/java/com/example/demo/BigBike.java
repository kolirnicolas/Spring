package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class BigBike {
    private final Brakes brakes;
    private final Frame frame;
    private final Pedal pedal;
    private final SteeringWheel steeringWheel;
    private final Wheel wheel;
    private final Transmission transmission;


    public void implementation() {
        brakes.createBigBike();
        frame.createBigBike();
        pedal.createBigBike();
        steeringWheel.createBigBike();
        wheel.createBigBike();
        transmission.createBigBike();

    }


}