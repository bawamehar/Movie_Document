package com.capgemini.dao;

import com.capgemini.dto.Theater;
import com.capgemini.dto.Ticket;

public class CustomerDaoImpl implements CustomerDao {
	
	TheaterDaoImpl tdi = new TheaterDaoImpl();
	
	@Override
	public Boolean bookMovieTicket(Theater theaterId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean cancelMovieTicket(Ticket ticketId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean chooseCity(String city) {
		
		
		return null;
	}

}
