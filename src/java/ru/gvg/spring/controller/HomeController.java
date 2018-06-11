package ru.gvg.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by GVG on 10.06.2018.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String getIndex(){
        return "index";
    }

    @RequestMapping("/welcome")
    public String getWelcome(){
        return "welcome";
    }

}
