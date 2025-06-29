package com.spring.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRectController {

    @Value("${app.learner.name}")
    private String learnerName;

    @Value("${app.coach.name}")
    private String coachName;

    @Value("${app.team.name}")
    private String teamName;

    @GetMapping("/")
    public String sayHello() {
        return String.format("%s says: Hello %s! Welcome to %s :)", coachName, learnerName, teamName);
    }

    //expose new endpoint for workout
    @GetMapping("/learn")
    public String getDailyWorkout() {
        return String.format("%s says start learning!", coachName);
    }

    //expose new endpoint for workout
//    @GetMapping("/fortune")
//    public String getFortune() {
//        return String.format("%s says You're going to have an amazing day!", coachName);
//    }

}
