package com.hello_thymeleaf.exercise1.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloThymeleaf {
    @RequestMapping("/hello_thymeleaf")
    public String helloThymeleaf(@RequestParam(name = "firstname") String firstName,
            @RequestParam(name = "lastname") String lastName, @RequestParam(name = "age") int age,
            Model model) {
        model.addAttribute("firstname", firstName);
        model.addAttribute("lastname", lastName);
        model.addAttribute("age", age);
        return "hello_thymeleaf";
    }

}
