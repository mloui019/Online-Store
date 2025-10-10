package com.example.backend.controller;

import com.example.backend.entity.Product;
import com.example.backend.service.ProductService;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public ResponseEntity<?> getAllProducts(
        @RequestParam(required = false) List<String> category, 
        @RequestParam(required = false) BigDecimal minPrice, 
        @RequestParam(required = false) BigDecimal maxPrice) 
    {
        return null;//ResponseEntity.ok(productService.getAllProducts(category, minPrice, maxPrice));
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Long id) {
        return ResponseEntity.ok(productService.getProductById(id));
    }
}
