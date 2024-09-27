package com.request_parameters.exercise2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class RequestParameters {

    @RequestMapping("/hello")
    public String helloPage(@RequestParam(name = "location") String location,
            @RequestParam(name = "firstname") String firstName,
            @RequestParam(name = "lastname") String lastName) {
        return "Welcome to the " + " " + location + " " + firstName + " " + lastName;
    }

}
