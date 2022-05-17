package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@AllArgsConstructor
public class DemoApplication {
    private final BigBike bigBike;
    private final BigBikeWithListInjected bigBikeWithListInjected;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @EventListener(ContextRefreshedEvent.class)
    public void bigBikeMethod() {
        bigBike.implementation();
    }

    @EventListener(ContextRefreshedEvent.class)
    public void bigBikeWithListInject() {
       bigBikeWithListInjected.addInterface();
    }
}
