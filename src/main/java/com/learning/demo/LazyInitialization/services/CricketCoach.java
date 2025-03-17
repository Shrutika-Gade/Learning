package com.learning.demo.LazyInitialization.services;

import org.springframework.stereotype.Component;

@Component("lazyCricketCoach")
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
