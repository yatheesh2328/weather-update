package com.example.ecommerce.controller;

import com.example.ecommerce.model.User;  // Ensure this import is present
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    // Existing code...

    @GetMapping("/register")
    public String registerForm(Model model) {
        model.addAttribute("user", new User());
        return "user/register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {
        // Add logic to save the user to the database
        return "redirect:/login";
    }
}
