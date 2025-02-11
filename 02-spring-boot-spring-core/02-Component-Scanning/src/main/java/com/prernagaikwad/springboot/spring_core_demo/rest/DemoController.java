package com.prernagaikwad.springboot.spring_core_demo.rest;

import com.prernagaikwad.springboot.spring_core_demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;



    @Autowired
    public void doSomeStuff(Coach theCoach)
    {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}