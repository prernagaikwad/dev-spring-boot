package com.prernagaikwad.springboot.spring_core_demo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout()
    {
        return "Run a hard 5k!";
    }
}