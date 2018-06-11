package ru.gvg.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by GVG on 10.06.2018.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/m1", method = RequestMethod.GET)
    public String test1(Model model) {
        model.addAttribute("message", "test page m1");
        return "test";
    }

    @RequestMapping(value = "/m2", method = RequestMethod.GET)
    public String test2(Model model) {
        model.addAttribute("message", "test page m2");
        return "test";
    }
}
