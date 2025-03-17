package com.learning.demo.ConstructorInjection.controller;

import com.learning.demo.ConstructorInjection.services.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("constructorDemoController")
public class ConstructorDemoController {

    private final Coach coach;

    @Autowired
    public ConstructorDemoController(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
}
