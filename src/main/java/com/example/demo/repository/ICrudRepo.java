package com.example.demo.repository;

import com.example.demo.model.Product;

import java.util.List;

public interface ICrudRepo {

    List<Product> readAll();
    void create(Product product);
}
