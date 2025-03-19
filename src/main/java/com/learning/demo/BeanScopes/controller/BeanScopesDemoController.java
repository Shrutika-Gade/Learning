package com.learning.demo.BeanScopes.controller;

import com.learning.demo.BeanScopes.services.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("beanScopesDemoController")
public class BeanScopesDemoController {
    private Coach myCoach;
    private Coach anotherCoach;

    // Default Scope is Singleton. All dependency injections for the bean will reference the same bean.
    @Autowired
    public BeanScopesDemoController(@Qualifier("beanScopesCricketCoach") Coach theCoach, @Qualifier("beanScopesCricketCoach") Coach theAnotherCoach) {
        System.out.println("In Constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/beanscopes")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    // Check to see if this is the same bean. True or False depending on the bean scopes. Singleton - True, Prototype - False
    @GetMapping("/check")
    public String check() {
        return "Comparing Beans: coach == anotherCoach, " + (myCoach == anotherCoach);
    }
}
