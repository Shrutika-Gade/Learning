package com.learning.demo.ConstructorInjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BadmintonCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice backhand for 30 minutes";
    }
}
