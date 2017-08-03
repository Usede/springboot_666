package com.usede.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello",produces = "application/json")
    public String hello () {
        return "hello?";
    }

    @RequestMapping(value = "/hello2")
    @ResponseBody
    public String hello2 () {
        return "hello?";
    }
}
