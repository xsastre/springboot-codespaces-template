package com.example.demo;

import com.example.demo.controller.HelloController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloControllerTest {

  @Test
  public void helloReturnsMessage() {
    HelloController c = new HelloController();
    assertEquals("Hello from Codespaces + Spring Boot!", c.hello());
  }
}