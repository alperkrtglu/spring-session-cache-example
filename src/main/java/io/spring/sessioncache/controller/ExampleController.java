package io.spring.sessioncache.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/")
    public String helloWorld(HttpSession session) {
        return "Hello World!";
    }
}
