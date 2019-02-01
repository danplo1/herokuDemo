package com.clockworkjava.herokuDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Daniel_D'AGE on 01.02.2019.
 */
@Controller
public class HelloController {

    @RequestMapping("hi")
    public String hello (){
        return "hello";

    }
}
