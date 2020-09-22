package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepo implements ICrudRepo{

    private List<Product> products = new ArrayList<>();

    public ProductRepo(){
        this.products.add(new Product());
    }

    @Override
    public List<Product> readAll(){return products;}

    @Override
    public void create(Product product){

    }


}
