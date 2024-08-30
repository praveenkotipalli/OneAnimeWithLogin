package com.example.cash_card.service;


import com.example.cash_card.model.User;

public interface UserService {
    User findByUsername(String username);

    User save(User user);
}
