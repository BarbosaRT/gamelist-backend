package com.barbosart.gamelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barbosart.gamelist.dto.GameListDTO;
import com.barbosart.gamelist.dto.GameMinDTO;
import com.barbosart.gamelist.dto.ReplacementDTO;
import com.barbosart.gamelist.services.GameListService;
import com.barbosart.gamelist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListSerivce;
	
	@Autowired
	private GameService gameSerivce;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListSerivce.findAll();
		return result;
	}	
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		List<GameMinDTO> result = gameSerivce.findByList(listId);
		return result;
	}
	
	@PostMapping(value = "/{listId}/replacement")
	public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body){
		gameListSerivce.move(listId, body.getSourceIndex(), body.getDestinationIndex());		
	}
}
