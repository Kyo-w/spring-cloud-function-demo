package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.config.EnableWebFlux;

import java.util.function.Function;

@SpringBootApplication
@EnableWebFlux
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public Function<String, String> uppercase() {
        return (value) -> {
            return value.toUpperCase();
        };
    }
//    @Bean
//    public FunctionProperties getFunctionProperties(){
//        return new FunctionProperties();
//    }

    @Bean
    public Function<String, String> lowercase() {
        return (value) -> {
            return value.toLowerCase();
        };
    }
}
