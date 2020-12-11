package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@org.springframework.web.bind.annotation.RestController
public class RestProductController {

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

    @PutMapping("/product/{id}")
    public ResponseEntity<String> update(@PathVariable("id") Long id, @RequestBody Product product){

        Optional<Product> optionalProduct = productRepo.findById(id);
        if(optionalProduct.isPresent()){
            return ResponseEntity.status(404).body("{'msg': 'Not found'}");
        }

        productRepo.save(product);

        return ResponseEntity.status(204).body("{'msg': 'Updated'}");
    }

}
