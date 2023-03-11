package com.spring.MobileCart.repository;

import com.spring.MobileCart.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepo extends JpaRepository<CartItem,Integer> {
}
