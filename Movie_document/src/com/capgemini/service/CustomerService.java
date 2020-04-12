package com.capgemini.service;

import com.capgemini.dto.Theater;
import com.capgemini.dto.Ticket;

public interface CustomerService {
	public Boolean bookMovieTicket(Theater theaterId);
	public Boolean cancelMovieTicket(Ticket ticketId);
	public Boolean chooseCity(String city);
}
