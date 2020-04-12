package com.capgemini.dao;

import com.capgemini.dto.Theater;
import com.capgemini.dto.Ticket;

public interface TicketDao {
	public boolean bookMovieTicket(Theater theater);
	public boolean cancelMovieTicket(Ticket ticket);
}
