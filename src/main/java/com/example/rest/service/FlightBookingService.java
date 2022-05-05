package com.example.rest.service;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.controller.FlightBookingAcknowledement;
import com.example.rest.dto.FlightBookingAcknowledgement;
import com.example.rest.dto.FlightBookingRequest;
import com.example.rest.entity.PassegerInfo;
import com.example.rest.entity.PaymentInfo;
import com.example.rest.repository.PassengerInfoRepository;
import com.example.rest.repository.PaymentInfoRepository;
import com.example.rest.utils.InsuffientAmountException;
import com.example.rest.utils.PaymentUtils;
@Service
public class FlightBookingService {
	@Autowired
	private PassengerInfoRepository passengerInfoRepository;
	@Autowired
	private PaymentInfoRepository   paymentInfoRepository;
	
	@Transactional
	public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request) {
		PassegerInfo passengerInfo=request.getPassengerInfo();
		passengerInfo=passengerInfoRepository.save(passengerInfo);
		PaymentInfo paymentInfo=request.getPaymentInfo();
		
		PaymentUtils.validateCreditLimit(paymentInfo.getAcctNo(),passengerInfo.getFare());
		paymentInfo.setPassengerId(passengerInfo.getpId());
		paymentInfo.setAmount(passengerInfo.getFare());
		paymentInfoRepository.save(paymentInfo);
		
		
		
		return new FlightBookingAcknowledgement("successfully booked ",passengerInfo.getFare(),UUID.randomUUID().toString().split("-")[0],passengerInfo);
	}
	
	

}
