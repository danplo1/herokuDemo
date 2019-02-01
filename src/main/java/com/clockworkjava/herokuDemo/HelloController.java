package com.clockworkjava.herokuDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Daniel_D'AGE on 01.02.2019.
 */
@Controller
public class HelloController {

    PeopleRepository peopleRepository;

    @Autowired
    public HelloController(PeopleRepository peopleRepository) {

        this.peopleRepository = peopleRepository;
    }

    @RequestMapping("hi")
    public String hello(Model model) {
        model.addAttribute("people", peopleRepository.findAll());
        return "hello";

    }
}
