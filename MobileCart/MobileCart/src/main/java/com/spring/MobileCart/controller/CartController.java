package com.spring.MobileCart.controller;

import com.spring.MobileCart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Configuration
@RestController
@RequestMapping("api/a3")

public class CartController {
    @Autowired
    CartService cartService;
}
