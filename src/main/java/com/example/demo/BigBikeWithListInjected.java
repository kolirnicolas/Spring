package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class BigBikeWithListInjected {
    private final List<CreateBigBike> createBigBikes;

    public void addInterface() {
        createBigBikes.forEach(CreateBigBike::createBigBike);
    }

}
