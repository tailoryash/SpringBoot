package com.simform.demoSpringMvc.Controller;


import com.simform.demoSpringMvc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/yashtailor")
public class DemoController {

    @RequestMapping("/index")
    public String hello(Model model) {
//        System.out.println("This is Home URL");
        model.addAttribute("name", "Yash Tailor");
        model.addAttribute("id", 1000);

        List<String> frds = new ArrayList<String>();
        frds.add("yash");
        frds.add("dhruv");
        frds.add("arpit");
        model.addAttribute("friends", frds);
        return "index";
    }

    @RequestMapping("/help")
    public ModelAndView help() {
        System.out.println("This is help controller");
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", "Yash");
        mv.addObject("roll", 100);
        LocalDateTime now = LocalDateTime.now();
        mv.addObject("time", now);

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        mv.addObject("l", list);
        System.out.println(list);
        mv.setViewName("help");
        return mv;
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }

}
