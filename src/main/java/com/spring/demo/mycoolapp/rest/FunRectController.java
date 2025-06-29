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

    //expose new endpoint for workout
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return String.format("%s says Workout!", owner);
    }

    //expose new endpoint for workout
//    @GetMapping("/fortune")
//    public String getFortune() {
//        return String.format("%s says Workout!", owner);
//    }

}
