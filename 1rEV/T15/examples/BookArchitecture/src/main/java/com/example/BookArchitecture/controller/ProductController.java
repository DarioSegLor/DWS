package com.example.BookArchitecture.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.BookArchitecture.domain.Product;

@RequestMapping("/productos")
@Controller

public class ProductController {
    List<Product> products = List.of(
            new Product(1, "Producto A", "Marca A", new BigDecimal(23.99)),
            new Product(2, "Producto B", "Marca B", new BigDecimal(14.99)),
            new Product(3, "Producto C", "Marca B", new BigDecimal(44.99)));

    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("products", this.products);
        return "products";
    }
}
