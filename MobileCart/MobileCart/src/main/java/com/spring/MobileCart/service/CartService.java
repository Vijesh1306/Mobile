package com.spring.MobileCart.service;

import com.spring.MobileCart.model.Cart;
import com.spring.MobileCart.model.User;

import java.util.Optional;

public interface CartService {
    Optional<Cart> findByUser(User user);
}
