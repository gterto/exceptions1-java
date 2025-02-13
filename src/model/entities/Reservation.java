package model.entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation {
	
	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	
	public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}


	public Integer getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}


	public LocalDate getCheckIn() {
		return checkIn;
	}


	public LocalDate getCheckOut() {
		return checkOut;
	}
	
	public long duration() {
			  int diff = (int) ChronoUnit.DAYS.between(checkIn, checkOut);
			  return diff;
	}
	
	public void updateDate(LocalDate checkIn, LocalDate checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Room"
				+ roomNumber
				+ ", check-in "
				+ "blablablabla";
				
	}
}
