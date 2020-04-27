package com.capg.fms.schedule.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ScheduledFlight {
	@Id
	@Column(name = "scheduledFlightId")
	private int scheduledFlightId;// Not mentioned in DTO but, according to document methods, these are included


	@Column(name = "availableSeats")

	private int availableSeats;
	// private Schedule schedule;

	@Column(name = "flightNumber")
	private long flightNumber;

	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="schedule",referencedColumnName = "scheduleId")
	private Schedule schedule;
	
	public ScheduledFlight() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ScheduledFlight(int scheduleFlightId, int availableSeats, long flightNumber, Schedule schedule) {
		super();
		this.scheduledFlightId = scheduleFlightId;
		this.availableSeats = availableSeats;
		this.flightNumber = flightNumber;
		this.schedule = schedule;
	}


	public int getScheduleFlightId() {
		return scheduledFlightId;
	}
	public void setScheduleFlightId(int scheduleFlightId) {
		this.scheduledFlightId = scheduleFlightId;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public long getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(long flightNumber) {
		this.flightNumber = flightNumber;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}


	@Override
	public String toString() {
		return "ScheduledFlight [scheduledFlightId=" + scheduledFlightId + ", availableSeats=" + availableSeats
				+ ", flightNumber=" + flightNumber + ", schedule=" + schedule + "]";
	}
}