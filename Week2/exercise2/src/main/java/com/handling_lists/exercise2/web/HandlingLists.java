package com.handling_lists.exercise2.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.handling_lists.exercise2.domain.Student;

@Controller
public class HandlingLists {
    @GetMapping("/hello")
    public String welcomeStudents(Model model) {
        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kate", "Cole"));
        students.add(new Student("Dan", "Brown"));
        students.add(new Student("Mike", "Mars"));

        // Add data to the model
        model.addAttribute("welcomeMessage", "Welcome to Haaga-Helia!");
        model.addAttribute("students", students);

        // Return the view name
        return "studentlist";
    }
}
