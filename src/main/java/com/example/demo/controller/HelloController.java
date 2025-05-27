package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Jehez master cici";
    }

    @GetMapping("/api/hello")
    public String hello() {
        return "Halo dari Spring Boot Backend!";
    }

    @GetMapping("/api/test")
    public String test() {
        return "WKWKWKWKWK";
    }
}