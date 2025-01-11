package com.tweetapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping( value = "/health")
    public String health(){
        return "Home Time Line Service HEALTH is Good";
    }
}
