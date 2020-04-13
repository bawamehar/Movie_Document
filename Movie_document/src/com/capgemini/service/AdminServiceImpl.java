package com.capgemini.service;

import java.util.Scanner;

import com.capgemini.dao.TheaterDaoImpl;
//import com.capgemini.dao.MovieDaoImpl;
import com.capgemini.dto.Movie;
import com.capgemini.dto.Screen;
import com.capgemini.dto.Show;
import com.capgemini.dto.Theater;

public class AdminServiceImpl implements AdminService{

	//private MovieDaoImpl dao=new MovieDaoImpl();
	boolean result;
	private Movie  movies;
	TheaterDaoImpl tdl = new TheaterDaoImpl(); 
	private Theater theater;
	
	
	public AdminServiceImpl() {
		super();
	}

	@Override
	public void addTheater() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter theater city ");
		String theaterCity = sc.next();
		System.out.println("enter theater name");
		String theaterName = sc.next();
		Theater tt = new Theater(theaterName,theaterCity);
		theater=tdl.addTheater(tt);
		
		if(theater!=null) 
			System.out.println("Theater Added");
		else 
			System.out.println("theater not added");
		
	}

	@Override
	public Boolean deleteTheater(Integer theaterId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie addMovie(Movie movie) {
		//movies=dao.addMovieDao(movie);
		return movies;
		
	}

	@Override
	public Boolean deleteMovie(Integer movieId) {
		//result=dao.deleteMovie(movieId);
		return result;
		}

	@Override
	public Movie addScreen(Screen screen) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteScreen(Integer screenId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie addShow(Show show) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteShow(Integer showId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
