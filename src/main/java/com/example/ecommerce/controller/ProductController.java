package com.example.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/manage")
    public String showManagePage(Model model) {
        // Add logic to fetch and pass data to the template if needed
        return "manage";
    }

    // Add other methods for different endpoints or operations related to products

}
