package com.example.cash_card.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cash_card.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User save(User user);
}
