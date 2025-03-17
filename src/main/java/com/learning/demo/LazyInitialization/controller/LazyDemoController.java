package com.learning.demo.LazyInitialization.controller;

import com.learning.demo.LazyInitialization.services.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("lazyDemoController")
public class LazyDemoController {
    private Coach coach;

    @Autowired
    public LazyDemoController(@Qualifier("lazyCricketCoach") Coach coach) {
        System.out.println("In Constructor: " + getClass().getSimpleName());
        this.coach = coach;
    }

    @GetMapping("/lazyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
}
