package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService{

    Product product;

    @Autowired
    ProductRepo productRepo;

    public Iterable<Product> findProducts() throws NullPointerException { productRepo.findAll(); return null;}

    public Product saveProduct() throws NullPointerException {productRepo.save(product); return product;}

    public Set<Product> findAll(){
        Set<Product> products = new HashSet<>();
        for(Product product : productRepo.findAll()){
            products.add(product);
        }
        return products;
    }

    public Product findById(Long id) {
        //findById giver en optional
        Optional<Product> productOptional = productRepo.findById(id);
        //hvis der ikke findes et product på id, kastes der en fejl
        if (!productOptional.isPresent())
        {
            throw new RuntimeException("Product not found");
        }
        //returner product vha. .get()
        return productOptional.get();
    }

    public void create(Product product)
    {
        productRepo.save(product);
    }

    public void update(Product product) { productRepo.save(product); }

    public void delete(Long id) { productRepo.deleteById(id); }


}
