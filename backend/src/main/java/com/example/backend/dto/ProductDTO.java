package com.example.backend.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDTO {

    private Long id;
    private String name;
    private BigDecimal price;
    private String description;
    private String category;
    
}
