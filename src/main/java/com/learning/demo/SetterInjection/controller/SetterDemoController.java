package com.learning.demo.SetterInjection.controller;

import com.learning.demo.SetterInjection.services.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("setterDemoController")
public class SetterDemoController {
    private Coach coach;

    @Autowired
    public void setCoach(Coach theCoach) {
        coach = theCoach;
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
}
