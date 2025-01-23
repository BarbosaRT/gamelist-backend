package com.barbosart.gamelist.projections;


public interface GameMinProjection {
	Long getId();
	String getTitle();
	
	Integer getGameYear();
	String getGenre();
	String getPlatforms();
	Double getScore();
	String getImgUrl();
	
	String getShortDescription();
	Integer getPosition();
	
}
