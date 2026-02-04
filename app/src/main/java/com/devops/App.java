package com.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    @GetMapping("/")
    public String home() {
        return "Real-Time DevOps CI/CD Pipeline Running Successfully 🚀";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

