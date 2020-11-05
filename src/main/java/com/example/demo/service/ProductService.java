package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService{

    Product product;

    @Autowired
    ProductRepo productRepo;

    public Iterable<Product> findProducts() throws NullPointerException { productRepo.findAll(); return null;}

    public Product saveProduct() throws NullPointerException {productRepo.save(product); return product;}


}
