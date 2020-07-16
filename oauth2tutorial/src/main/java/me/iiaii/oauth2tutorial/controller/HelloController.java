package me.iiaii.oauth2tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/restricted")
    public String restricted() {
        return "To see this text, you need to be logged in! ";
    }
}
