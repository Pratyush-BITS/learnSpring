package com.spring.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomErrorController implements ErrorController {

    @Value("${app.coach.name}")
    private String coachName;

    @RequestMapping("/error")
    public String error() {
        return String.format("%s says: The endpoint you're trying access doesn't exists yet!", coachName);
    }

}
