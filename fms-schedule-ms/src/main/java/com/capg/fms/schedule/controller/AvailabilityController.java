package com.capg.fms.schedule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.fms.schedule.excepions.SeatsAreNotAvailableException;
import com.capg.fms.schedule.service.IAvailabilityService;

@RestController
@RequestMapping("/flights")
public class AvailabilityController {

	@Autowired
	IAvailabilityService service;

	@GetMapping("/{flightNumber}")
	public boolean checkScheduledFlightById(@PathVariable long flightNumber) {
		return service.checkScheduledFlightById(flightNumber);
	}
	
	@GetMapping("/{flightNumber}/{availableSeats}")
	public boolean checkSeatAvailability(@PathVariable long flightNumber, @PathVariable int availableSeats) throws SeatsAreNotAvailableException {
		return service.checkSeatAvailability(flightNumber, availableSeats);
	}
}