package com.spring.MobileCart.service;

import com.spring.MobileCart.model.User;
import com.spring.MobileCart.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepo userRepo;
    @Override
    public User addUser(User user) {
        return userRepo.save(user);
    }
}
