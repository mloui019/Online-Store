package com.example.backend.controller;

import com.example.backend.entity.Cart;
import com.example.backend.service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {
    
    private CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }


    @GetMapping("/cart/{id}")
    public ResponseEntity<?> getCartById() {
        return null;
    }

    @PostMapping("/cart/{id}/items") 
    public ResponseEntity<?> addItemToCart() {
        return null;
    }

    /*@DeleteMapping("/cart/{id}/items/{id}")
    public ResponseEntity<?> deleteItemFromCart() {
        return null;
    }*/
}
