package com.capgemini.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.capgemini.dto.Movie;
import com.capgemini.dto.Screen;
import com.capgemini.dto.Theater;

public class TheaterDaoImpl implements TheaterDao {
	
	Theater t = new Theater();
	
	ArrayList<Object> ar = new ArrayList<Object>();
	HashMap<Integer, String> map= new HashMap<Integer, String>();
	static int[] array = new int[20];
	int i=0;

	@Override
	public Theater addTheater(Theater theater) {
		ar.add(theater.getTheaterCity());
		ar.add(theater.getTheaterName());
		ar.add(theater.getTheaterId());
		map.put(theater.getTheaterId(), theater.getTheaterCity());
		return theater;
	}

	@Override
	public Boolean deleteTheater(Integer theaterId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie searchMovie(String movieName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Screen searchScreen(Integer screenId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Theater viewTheater(String city) {
		for(Integer key : map.keySet()) {
			if(city.equals(map.get(key))) {
				array[i]=key;
				i++;
			}
		}
		String s= t.getTheaterCity();
		ar.get(array[0]);
		return null;
	}

}
