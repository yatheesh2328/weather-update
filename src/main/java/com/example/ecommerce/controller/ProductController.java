package com.example.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping("/products")
    public String listProducts(Model model) {
        // Add logic to fetch and pass product data to the view
        return "product/list";
    }
}
