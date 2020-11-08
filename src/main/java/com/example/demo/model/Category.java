package com.example.demo.model;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idCategory;

    @Column(name = "catName")
    public String catName;

    @ManyToMany
    Set<Product> products;

    public Category() {
    }

    public Category(Long idCategory, String catName) {
        this.idCategory = idCategory;
        this.catName = catName;
    }

    public Category(String catName) {
        this.catName = catName;
    }

    public Category(Long idCategory) {
        this.idCategory = idCategory;
    }

    public Long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "idCategory=" + idCategory +
                ", catName='" + catName + '\'' +
                '}';
    }
}
