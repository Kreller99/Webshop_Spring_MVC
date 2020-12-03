package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.repository.ICrudRepo;
import com.example.demo.repository.ProductRepo;
//import com.example.demo.service.ProductService;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    ProductService productService;

    public HomeController(ProductService productService) {this.productService = productService;}


    @GetMapping("/")
    public String index(Model model){

        model.addAttribute("products", productService.findAll());
        return "index";
    }

    @GetMapping("/product/create")
    public String getCreate(Product product){
        return "product/create";
    }

    @PostMapping("/product/create")
    public String postCreate(Product product){

        productService.create(product);
        //productService.create(product);
        return "redirect:/";
    }

    @GetMapping("/product/update")
    public String getUpdate(@RequestParam Long id, Model model){
       model.addAttribute("updateProduct", productService.findById(id));
       return "product/update";
    }

    @PostMapping("/product/update")
    public String postUpdate(Product product){
        productService.update(product);
        return "redirect:/";
    }

    /*@GetMapping("/product/delete")
    public String getDelete(@RequestParam int id, Model model){
        model.addAttribute("deleteProduct", productRepo.read(id));
        return "/product/delete";
    }

    @PostMapping("/product/delete")
    public String postDelete(int id){
        productRepo.delete(id);
        return "redirect:/";
    }

    TODO Direct to detailed view of student
    @GetMapping("/product")
    @ResponseBody
    public String getProductByParameter(@RequestParam int id) {
        Product pro = productRepo.read(id);
        return "ID: " + id + " Name: " + pro.name + "";
    }*/

    @GetMapping("/h2-console")
    public String h2Console(){
        return "/h2-console";
    }
}
