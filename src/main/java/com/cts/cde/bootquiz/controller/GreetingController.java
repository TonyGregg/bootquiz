package com.cts.cde.bootquiz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Antony G. on 11/7/21 at 8:16 PM
 **/
@RestController
@RequestMapping("/api/greeting")
public class GreetingController {
    @GetMapping(value = "/v1/sayHello/{name}")
    public String sayGreeting(@PathVariable(name = "name")String name) {
        return "Greetings " + name;
    }
}
