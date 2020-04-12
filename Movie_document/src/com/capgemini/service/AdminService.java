package com.capgemini.service;

import com.capgemini.dto.Movie;
import com.capgemini.dto.Screen;
import com.capgemini.dto.Show;
import com.capgemini.dto.Theater;

public interface AdminService {

	public void addTheater(Theater theater);
	public Boolean deleteTheater(Integer theaterId);
	public Movie addMovie(Movie movie);
	public Boolean deleteMovie(Integer movieId);
	public Movie addScreen(Screen screen);
	public Boolean deleteScreen(Integer screenId);
	public Movie addShow(Show show);
	public Boolean deleteShow(Integer showId);
	
}
