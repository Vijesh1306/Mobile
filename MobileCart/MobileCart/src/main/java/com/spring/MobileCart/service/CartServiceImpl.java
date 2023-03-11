package com.spring.MobileCart.service;

import com.spring.MobileCart.model.Cart;
import com.spring.MobileCart.model.User;
import com.spring.MobileCart.repository.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service

public class CartServiceImpl implements CartService{
    @Autowired
    CartRepo cartRepo;
    @Override
    public Optional<Cart> findByUser(User user) {
         Optional<Cart> cart=cartRepo.findById(user.getId());
        return cart;
    }
}
