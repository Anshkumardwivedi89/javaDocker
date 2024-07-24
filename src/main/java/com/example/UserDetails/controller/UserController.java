package com.example.UserDetails.controller;


import com.example.UserDetails.model.User;
import com.example.UserDetails.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user-form")
    public String userForm(Model model) {
        model.addAttribute("user", new User());
        return "user-form";
    }

    @PostMapping("/user-form")
    public String submitUserForm(User user) {
        userRepository.save(user);
        return "redirect:/";
    }
}
