package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/manage")
    public String manageProducts(Model model) {
        // Add logic to fetch and pass product data to the view
        return "product/manage";
    }

    @GetMapping("/add")
    public String addProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "product/add";
    }

    @PostMapping("/add")
    public String addProduct(@ModelAttribute Product product) {
        // Add logic to save the product to the database
        return "redirect:/products/manage";
    }

    // Other methods for editing and deleting products
}
