package com.example.htmxthymeleafproducts.controller;

import com.example.htmxthymeleafproducts.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ProductController {

    @GetMapping("/")
    public String listProducts(Model model) {
        List<Product> products = Arrays.asList(
            new Product(1L, "Laptop", 999.99),
            new Product(2L, "Smartphone", 599.99),
            new Product(3L, "Headphones", 149.99)
        );
        model.addAttribute("products", products);
        return "products";
    }
}