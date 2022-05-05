package com.example.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.dto.FlightBookingAcknowledgement;
import com.example.rest.dto.FlightBookingRequest;
import com.example.rest.service.FlightBookingService;

@RestController

public class MyController {
	@Autowired
	private FlightBookingService service;
	@PostMapping("/bookTicket")
	public ResponseEntity<?> bookFlight(@RequestBody FlightBookingRequest request)
	{
		FlightBookingAcknowledgement book=service.bookFlightTicket(request);
		return new ResponseEntity<>(book,HttpStatus.ACCEPTED);
	}

}
