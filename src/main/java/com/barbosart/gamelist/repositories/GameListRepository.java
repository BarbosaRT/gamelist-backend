package com.barbosart.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barbosart.gamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
