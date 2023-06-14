package com.springmvc.searchbar.searchbar.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;

@Controller
public class SearchController {
    @RequestMapping("/home")
    public String home(){
        System.out.println("hellllo");
        String s = null;
        System.out.println(s.length());
        return "home";
    }
    @RequestMapping("/search")
    public RedirectView search(@RequestParam("querybox") String query){
        RedirectView redirectView = new RedirectView();
        if(query.isBlank()){
            redirectView.setUrl("home");
            return redirectView;
        }
        String url = "https://www.google.com/search?q=" + query;

        redirectView.setUrl(url);
        return redirectView;
    }

    @RequestMapping("/user/{userId}")
    public String pathVariableEx(@PathVariable("userId") int id){
        System.out.println("User id : " + id);
        return "home";
    }


}
