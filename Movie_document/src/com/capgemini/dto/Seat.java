package com.capgemini.dto;

public class Seat {

	
	private Integer seatId;
	private enum  seatStatus {Available,Blocked,Booked };
	private Double seatPrice;
	
	public Seat(Integer seatId, Double seatPrice) {
		super();
		this.seatId = seatId;
		this.seatPrice = seatPrice;
	}

	public Integer getSeatId() {
		return seatId;
	}

	public void setSeatId(Integer seatId) {
		this.seatId = seatId;
	}
	public Double getSeatPrice() {
		return seatPrice;
	}
	public void setSeatPrice(Double seatPrice) {
		this.seatPrice = seatPrice;
	}
	
	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", seatPrice=" + seatPrice + "]";
	}
	
	
}
