package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Entity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
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

    @JsonManagedReference
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private CompanyDescription companyDescription;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product", orphanRemoval = true)
    public Set<Company> companies;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "product_category",
            joinColumns = @JoinColumn(name = "product_idProduct"),
            inverseJoinColumns = @JoinColumn(name = "category_idCategory")
    )
    public Set<Category> categories = new HashSet<>();


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

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.companies = companies;
        this.companyDescription = companyDescription;
        this.categories = categories;
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
