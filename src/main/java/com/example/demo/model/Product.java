package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idProduct;

    @Column(name = "name")
    public String name;

    @Column(name = "price")
    public double price;

    @Column(name = "description")
    public String description;

    /*@ManyToMany(mappedBy = "product")
    public Set<Category> categories;

    @OneToOne
    public Company company;

    @OneToOne
    public CompanyDescription companyDescription;*/


    /*

    @OneToOne(fetch = FetchType.LAZY eller FetchType.EAGER, optional = false)
    @JoinColumn(name = "recipe_id", nullable = false
    public Recipe recipe;

    @OneToMany(cascade = CascadeType.ALL, mappedBY = "recipe")
    private Set<Ingredient> ingredients;

    @ManyToMany(mappedBy = "recipe")
    private Set<Category> categories;

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
