package com.capgemini.service;

import com.capgemini.dto.Movie;
import com.capgemini.dto.Screen;

public interface TheaterService {
	
	public Movie searchMovie(String movie);
	public Screen searchScreen(Integer screen);
	
}
