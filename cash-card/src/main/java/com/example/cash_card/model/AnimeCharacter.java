package com.example.cash_card.model;

// import javax.validation.constraints.NotNull;
// import javax.validation.constraints.Size;

// import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Data
@Entity
public class AnimeCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private String name;

    private String animeName;
    private String photoUrl; 

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User assignee;
    
}