package com.testingbug.thymeleafbugdemo.controller;

import com.testingbug.thymeleafbugdemo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonController {

    @GetMapping("/")
    public String display(Model model){

        List<Person> people = new ArrayList<>();
        people.add(new Person("Brian", "Laughlin", "Tinker"));
        people.add(new Person("Petr","Rastegaev","Pro Support"));

        model.addAttribute("people", people);

        return "index";
    }
}
