package com.example.backend.service;

import com.example.backend.entity.Cart;
import com.example.backend.repository.CartRepository;

import org.springframework.stereotype.Service;

@Service
public class CartService {

    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }
}
