package com.example.demo.repository;

import com.example.demo.model.CompanyDescription;
import org.springframework.data.repository.CrudRepository;

public interface CompanyDescriptionRepo extends CrudRepository<CompanyDescription, Long> {
}
