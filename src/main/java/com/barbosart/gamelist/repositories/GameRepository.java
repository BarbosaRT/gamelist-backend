package com.barbosart.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barbosart.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
