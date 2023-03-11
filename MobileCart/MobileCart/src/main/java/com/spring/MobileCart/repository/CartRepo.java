package com.spring.MobileCart.repository;

import com.spring.MobileCart.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<Cart,Integer> {
}
