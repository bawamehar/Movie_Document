package com.capgemini.service;

import java.util.Scanner;

import com.capgemini.dao.CustomerDaoImpl;
import com.capgemini.dao.TheaterDaoImpl;
import com.capgemini.dto.Theater;
import com.capgemini.dto.Ticket;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDaoImpl cdi = new CustomerDaoImpl();
	private TheaterDaoImpl tdi = new TheaterDaoImpl();
	
	@Override
	public Boolean bookMovieTicket(Theater theaterId) {
		
		return null;
	} 

	@Override
	public Boolean cancelMovieTicket(Ticket ticketId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean chooseCity(String city) {
		tdi.viewTheater(city);
	return null;
	}
}
