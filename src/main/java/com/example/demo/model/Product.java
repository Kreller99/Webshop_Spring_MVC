package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idProduct;

    public String name;

    public double price;

    public String description;

    /*
    @OneToOne
    public Company company;
    */


    public Product(){}

    public Product(Long idProduct, String name, double price, String description) {
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setId(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + idProduct +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
