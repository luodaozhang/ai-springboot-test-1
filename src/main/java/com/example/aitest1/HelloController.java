package com.example.aitest1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "ai-springboot-test-1 is running";
    }

    @GetMapping("/health")
    public String health() {
        return "ok";
    }
}
