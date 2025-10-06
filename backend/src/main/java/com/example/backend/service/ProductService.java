package com.example.backend.service;

import com.example.backend.dto.ProductDTO;
import com.example.backend.entity.Product;
import com.example.backend.mapper.ProductMapper;
import com.example.backend.repository.ProductRepository;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public List<ProductDTO> getAllProducts() {
        List<Product> products = productRepository.findAll();

        return productMapper.toProductDTOs(products);
    }
    
}
