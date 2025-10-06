package com.example.backend.mapper;

import com.example.backend.dto.ProductDTO;
import com.example.backend.entity.Product;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    // Entity -> DTO
    @Mapping(source = "category.name", target = "category")
    ProductDTO toProductDTO(Product product);

    @Mapping(source = "category.name", target = "category")
    List<ProductDTO> toProductDTOs(List<Product> products);

    // DTO -> Entity
    //Product fromProductDTO(ProductDTO productDTO);    
    
}
