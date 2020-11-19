package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    ProductRepo productRepo;

    @GetMapping("/product")
    public Iterable<Product> findAll(){
        return productRepo.findAll();
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Optional<Product>> findById(@PathVariable Long id){
        Optional<Product> product = productRepo.findById(id);
        if(product.isPresent()){
            return ResponseEntity.status(200).body(product);
        } else{
            return ResponseEntity.status(404).body(product);
        }
    }

}
