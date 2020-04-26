package com.capg.fms.schedule.excepions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FlightNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public FlightNotFoundException(String message) {
		super(message);
	}
}
