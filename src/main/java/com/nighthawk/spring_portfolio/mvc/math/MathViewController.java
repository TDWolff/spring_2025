package com.nighthawk.spring_portfolio.mvc.math;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MathViewController {
        // @GetMapping handles GET request for /greet, maps it to greeting() method
    @GetMapping("/math")
    // @RequestParam handles variables binding to frontend, defaults, etc
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {

        // model attributes are visible to Thymeleaf when HTML is "pre-processed"
        model.addAttribute("name", name);

        // load HTML VIEW (greet.html)
        return "math"; 

    }
}
