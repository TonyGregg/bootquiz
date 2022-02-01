package com.cts.cde.bootquiz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Antony G. on 2/1/22 at 1:53 PM
 **/
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String Hello(@RequestParam String name) {
        return "Greetings " + name;
    }
}
