package com.barbosart.gamelist.projections;


public interface GameMinProjection {
	Long getId();
	String getTitle();
	
	Integer getYear();
	String getGenre();
	String getPlatforms();
	Double getScore();
	String getImgUrl();
	
	String getShortDescription();
	Integer getPosition();
	
}
