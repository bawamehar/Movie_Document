package com.capgemini.dao;

import com.capgemini.dto.Theater;
import com.capgemini.dto.Ticket;

public interface CustomerDao {
	public Boolean bookMovieTicket(Theater theaterId);
	public Boolean cancelMovieTicket(Ticket ticketId);
	public Boolean chooseCity(String city);
}
