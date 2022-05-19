package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {
    @Bean
    public String country() {
        return "Germany";
    }

    @Bean
    @Primary
    public String continent() {
        return "Europe";

    }
}
