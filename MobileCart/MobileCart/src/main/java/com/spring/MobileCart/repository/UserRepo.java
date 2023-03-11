package com.spring.MobileCart.repository;

import com.spring.MobileCart.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
