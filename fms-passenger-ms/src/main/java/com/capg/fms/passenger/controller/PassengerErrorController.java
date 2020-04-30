package com.capg.fms.passenger.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.capg.fms.passenger.exceptions.EmptyPassengerListException;
import com.capg.fms.passenger.exceptions.PassengerAlreadyExistException;
import com.capg.fms.passenger.exceptions.PassengerNotFoundException;
import com.capg.fms.passenger.exceptions.PassengerUinAlreadyExistException;




@RestController
	@ControllerAdvice
	public class PassengerErrorController {

//		@ResponseStatus(code = HttpStatus.ALREADY_REPORTED,reason = "Passenger Already Exist")
//		@ExceptionHandler(PassengerAlreadyExistException.class)
//		public void handlePassengerAlreadyExistException()
//		{
////		      To Handle Passenger Already Exist Exception	
//		}
		
		@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "Passenger Not Found ")
		@ExceptionHandler(PassengerNotFoundException.class)
		public void handlePassengerNotFoundException()
		{
		       //To Handle Passenger Not Found Exception	
		}
	
	@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "PassengerList is Empty")
	@ExceptionHandler(EmptyPassengerListException.class)
	public void handleEmptyPassengerListException()
	{
	       //To Handle  Empty Passenger List Exception	
	}
	
	
	@ResponseStatus(code = HttpStatus.ALREADY_REPORTED,reason = "Passenger UIN already exist")
	@ExceptionHandler(PassengerUinAlreadyExistException.class)
	public void handlePassengerUinAlreadyExistListException()
	{
	       //To Handle  Empty Passenger UIN Already Exist Exception	
	}


}

	


