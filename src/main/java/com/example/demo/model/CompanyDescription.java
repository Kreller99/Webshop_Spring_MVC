package com.example.demo.model;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;



@Entity
public class CompanyDescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idCompanyDescription;

    @Column(name = "descriptionOfCompany")
    public String descriptionOfCompany;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name ="company_idCompany", nullable = false)
    public Company company;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_idProduct")

    @JsonBackReference
    public Product product;



    public CompanyDescription() {
    }

    public CompanyDescription(String descriptionOfCompany, Product product) {
        this.descriptionOfCompany = descriptionOfCompany;
        this.product = product;
    }

    public CompanyDescription(Long idCompanyDescription) {
        this.idCompanyDescription = idCompanyDescription;
    }

    public CompanyDescription(String descriptionOfCompany) {
        this.descriptionOfCompany = descriptionOfCompany;
    }

    public Long getIdCompanyDescription() {
        return idCompanyDescription;
    }

    public void setIdCompanyDescription(Long idCompanyDescription) {
        this.idCompanyDescription = idCompanyDescription;
    }

    public String getDescriptionOfCompany() {
        return descriptionOfCompany;
    }

    public void setDescriptionOfCompany(String descriptionOfCompany) {
        this.descriptionOfCompany = descriptionOfCompany;
    }

    @Override
    public String toString() {
        return "CompanyDescription{" +
                "idCompanyDescription=" + idCompanyDescription +
                ", descriptionOfCompany='" + descriptionOfCompany + '\'' +
                '}';
    }
}
