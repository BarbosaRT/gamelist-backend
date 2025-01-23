package com.barbosart.gamelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barbosart.gamelist.dto.GameListDTO;
import com.barbosart.gamelist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListSerivce;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListSerivce.findAll();
		return result;
	}	
	
}
