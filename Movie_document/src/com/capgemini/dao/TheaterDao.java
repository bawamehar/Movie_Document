package com.capgemini.dao;

import com.capgemini.dto.Movie;
import com.capgemini.dto.Screen;
import com.capgemini.dto.Theater;

public interface TheaterDao {
	public Theater addTheater(Theater theater);
	public Boolean deleteTheater(Integer theaterId);
	public Movie searchMovie(String movieName);
	public Screen searchScreen(Integer screenId);
	public Theater viewTheater(String city);
}
