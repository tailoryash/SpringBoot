package com.simform.demoSpringMvc.Controller;

import com.simform.demoSpringMvc.entities.User;
import com.simform.demoSpringMvc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SendingController {
    @Autowired
    private UserService userService;

    @ModelAttribute
    public void commonData(Model model) {
        model.addAttribute("Header", "Yash Tailor's Website.");
        model.addAttribute("Desc", "This is Programmer's place to code better");
    }

    @RequestMapping("/signup")
    public String signup(Model model) {

        return "signup";
    }

    //    @RequestMapping(path = "/login", method = RequestMethod.POST)
//    public String login(@RequestParam(value = "username") String username,
//                        @RequestParam("email") String email,
//                        @RequestParam("pwd") String password,
//                        Model model) {
//        System.out.println(
//                "Email : " + email
//        );
//        System.out.println(
//                "Username : " + username
//        );
//        System.out.println(
//                "Password : " + password
//        );
//        User user = new User();
//        user.setUsername(username);
//        user.setEmail(email);
//        user.setPassword(password);
////        model.addAttribute("username", username);
////        model.addAttribute("email", email);
////        model.addAttribute("password", password);
//        model.addAttribute("user", user);
//        return "login";
//    }
    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute User user,
                        Model model) {
        this.userService.createUser(user);
        return "login";
    }
}
