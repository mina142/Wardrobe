package com.example.demo;

import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.security.Principal;

@Controller
public class HomeController {
    @Autowired
    UserRepository userRepository;


    @Autowired
    ItemRepository itemRepository;

   @Autowired
   CloudinaryConfig cloudc;

//    @Autowired
//    UserService userService;

    @RequestMapping("/login")
    public String login(Model model) {

        return "login";
    }
}
