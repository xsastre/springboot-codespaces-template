package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloController {

  @GetMapping("/hello")
  public String hello() {
    return "Hello from Codespaces + Spring Boot!";
  }

  @GetMapping("/greet")
  public Map<String,String> greet(@RequestParam(defaultValue = "Món") String name) {
    return Map.of("message", "Hola, " + name + "!");
  }
}