package com.spring.MobileCart.repository;

import com.spring.MobileCart.model.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobileRepo extends JpaRepository<Mobile,Integer> {
}
