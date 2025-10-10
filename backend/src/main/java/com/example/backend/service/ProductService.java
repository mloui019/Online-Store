package com.example.backend.service;

import com.example.backend.dto.ProductDTO;
import com.example.backend.entity.Product;
import com.example.backend.mapper.ProductMapper;
import com.example.backend.repository.ProductRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public List<ProductDTO> getAllProducts(List<String> categories, BigDecimal minPrice, BigDecimal maxPrice) {
        if ((categories == null || categories.isEmpty()) && minPrice == null && maxPrice == null) {
            List<Product> products = productRepository.findAll();
            return productMapper.toProductDTOs(products);
        }

        //List<Product> products = productRepository.findByFilter(categories, minPrice, maxPrice);
        //return productMapper.toProductDTOs(products);
        return null;
    }

    public ProductDTO getProductById(Long id) {
        Optional<Product> product = productRepository.findById(id);

        if (product.isPresent()) {
            return productMapper.toProductDTO(product.get());
        }

        return null;
    }

    /*public List<ProductDTO> getProductByFilter(List<String> categories, BigDecimal minPrice, BigDecimal maxPrice) {
        return null;
    }*/
    
}
