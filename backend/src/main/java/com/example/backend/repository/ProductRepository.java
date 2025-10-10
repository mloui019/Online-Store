package com.example.backend.repository;

import com.example.backend.entity.Product;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ProductRepository extends JpaRepository<Product, Long> {

    /*@Query(FROM Product p WHERE :categories == null)
    List<Product> findByFilter(
        @Param("category") List<String> categories,
        @Param("minPrice") BigDecimal minPrice,
        @Param("maxPrice") BigDecimal maxPrice);*/
    
}
