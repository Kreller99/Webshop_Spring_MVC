package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.repository.ICrudRepo;
import com.example.demo.repository.ProductRepo;
//import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HomeController {

    /*@Autowired
    ProductService productService;*/



    ProductRepo productRepo;

    public HomeController(ProductRepo productRepo) {this.productRepo = productRepo;}


    @GetMapping("/")
    public String index(){

        for(Product p : productRepo.findAll()){
            System.out.println(p.getIdProduct());
            System.out.println(p.getName());
            System.out.println(p.getPrice());
            System.out.println(p.getDescription());
        }
        return "index";
    }

    /*@GetMapping("/product/create")
    public String getCreate(Product product){
        return "/product/create";
    }

    @PostMapping("/product/create")
    public String postCreate(Product product){

        productRepo.save(product);
        //productService.create(product);
        return "redirect:/";
    }

    @GetMapping("/product/update")
    public String getUpdate(@RequestParam Long id, Model model){
       model.addAttribute("updateProduct", productRepo.findById(id));
       return "product/update";
    }

    @PostMapping("/product/update")
    public String postUpdate(Product product){
        productRepo.save(product);
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
}
