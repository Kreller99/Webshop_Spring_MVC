package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/create")
    public String getCreate(){
        return "create";
    }

    @PostMapping("/create")
    public String postCreate(@ModelAttribute Product product){
        productService.create(product);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String getUpdate(@PathVariable("id") long id, Model model){
       model.addAttribute("product", productService.read(id));
       return "update";
    }
}
