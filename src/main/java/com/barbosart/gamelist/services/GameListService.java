package com.barbosart.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.barbosart.gamelist.dto.GameListDTO;
import com.barbosart.gamelist.entities.GameList;
import com.barbosart.gamelist.repositories.GameListRepository;


@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;

	@Transactional(readOnly = true)	
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
		return dto;
	}	
}
