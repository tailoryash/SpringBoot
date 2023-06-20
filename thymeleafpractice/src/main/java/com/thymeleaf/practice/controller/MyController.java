package com.thymeleaf.practice.controller;

import lombok.extern.slf4j.*;
import org.slf4j.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@Slf4j
public class MyController {

@RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(Model model){
        System.out.println("Inside about handler...");
        model.addAttribute("name", "Yash Tailor");
        model.addAttribute("date", new Date().toLocaleString());
        List<String> list = List.of("Yash", "Arpit", "Parth");
        model.addAttribute("names", list);
        model.addAttribute("isActive", true);
        model.addAttribute("gender", "M");
//        log.error("Hey this is logger message");
        return "about";
        //about.html
    }

}
