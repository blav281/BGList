package com.example.bglist.Game;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="games")
public class Game {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
