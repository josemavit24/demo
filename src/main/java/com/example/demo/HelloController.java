package com.example.demo;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.expression.Lists;

@Controller
public class HelloController {
    
 

    
    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        
        List<String> menuItems = Arrays.asList("Mobs", "Biomes", "Consumables","Blocks","Tools");
        modelAndView.addObject("menuItems", menuItems);
        
        return modelAndView;
    }
    

    // @GetMapping("/")
    // public ModelAndView home() {
    //     ModelAndView modelAndView = new ModelAndView();
    //     modelAndView.setViewName("hello");
    //     modelAndView.addObject("message", "Hello, World!");
    //     return modelAndView;
    // }
}
    

