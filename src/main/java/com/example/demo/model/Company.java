package com.example.demo.model;
import javax.persistence.*;

@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idCompany;

    @Column(name = "companyName")
    public String companyName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="product_idProduct")
    public Product product;

    public Company() {
    }

    public Company(Long idCompany, String companyName) {
        this.idCompany = idCompany;
        this.companyName = companyName;
    }

    public Company(Long idCompany) {
        this.idCompany = idCompany;
    }

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public Long getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Long idCompany) {
        this.idCompany = idCompany;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Company{" +
                "idCompany=" + idCompany +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
