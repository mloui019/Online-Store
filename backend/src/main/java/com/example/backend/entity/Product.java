package com.example.backend.entity;

import java.math.BigDecimal;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotNull
    private BigDecimal price;

    private String description;
    //private String imageURL;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    
}
