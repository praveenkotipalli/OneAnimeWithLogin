package com.example.cash_card.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.cash_card.model.AnimeCharacter;

@Service
public interface AnimeCharacterService {

    AnimeCharacter addCharacter(AnimeCharacter character);
    List<AnimeCharacter> getAllCharacters();
    Optional<AnimeCharacter> getCharacterById(Long id);
    AnimeCharacter updateCharacter(Long id, AnimeCharacter character);
    boolean deleteCharacter(Long id);


}
