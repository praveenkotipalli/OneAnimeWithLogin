package com.example.cash_card.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cash_card.model.AnimeCharacter;

public interface AnimeCharacterRepository  extends JpaRepository<AnimeCharacter, Long>{
    
}
