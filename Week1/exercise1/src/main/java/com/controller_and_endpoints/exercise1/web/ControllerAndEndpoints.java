package com.controller_and_endpoints.exercise1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ControllerAndEndpoints {

    @RequestMapping("/index")
    public String mainPage() {
        return "This is the main page.";
    }

    @RequestMapping("/contact")
    public String contactPage() {
        return "This is the contact page.";
    }

}
