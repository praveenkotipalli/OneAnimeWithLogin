package com.example.cash_card.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cash_card.model.AnimeCharacter;
import com.example.cash_card.repository.AnimeCharacterRepository;

@Service
public class AnimeCharacterServiceImpl implements AnimeCharacterService{

    @Autowired
    private AnimeCharacterRepository repository;
    @Override
    public AnimeCharacter addCharacter(AnimeCharacter character) {
        return repository.save(character);
    }

    @Override
    public List<AnimeCharacter> getAllCharacters() {
        return repository.findAll();
    }

    @Override
    public Optional<AnimeCharacter> getCharacterById(Long id) {
       return repository.findById(id);
    }

    @Override
    public AnimeCharacter updateCharacter(Long id, AnimeCharacter character) {
        character.setId(id);
        return repository.save(character);
    }

    @Override
    public boolean deleteCharacter(Long id) {
        if(repository.existsById(id))
        {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
    
}
