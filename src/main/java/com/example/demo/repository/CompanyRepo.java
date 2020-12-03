package com.example.demo.repository;

import com.example.demo.model.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepo extends CrudRepository<Company, Long> {
}
