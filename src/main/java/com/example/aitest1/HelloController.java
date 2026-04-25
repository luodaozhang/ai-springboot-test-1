package com.example.aitest1;

import java.util.UUID;

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

    @GetMapping("/request-id")
    public ResultVO requestId() {
        return new ResultVO(UUID.randomUUID().toString());
    }
}
