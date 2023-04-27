package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.demo.model.Product;

public interface ProductRepository extends JpaRepository<Product, String>, JpaSpecificationExecutor<Product>{

}
