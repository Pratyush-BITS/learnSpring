package com.spring.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRectController {

    @Value("${config.owner}")
    private String owner;

    @GetMapping("/")
    public String sayHello() {
        return String.format("%s says Hello!", owner);
    }

}
