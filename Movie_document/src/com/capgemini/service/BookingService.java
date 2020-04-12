package com.capgemini.service;

import com.capgemini.dto.Seat;

public interface BookingService {
	public double calculateTotalCost();
	public PaymentMethod choosePaymentMethod();
	public boolean makePayment(PaymentMethod pm, double amount);
	public boolean cancelTicket(Seat ...seat);
}
