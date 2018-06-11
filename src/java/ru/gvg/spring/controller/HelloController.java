package ru.gvg.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by GVG on 10.06.2018.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String hello(Model model, @PathVariable(value = "name") String name) {
        model.addAttribute("message", name);
        return "hello";
    }
}
