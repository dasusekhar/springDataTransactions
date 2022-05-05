package com.example.rest.dto;

import com.example.rest.entity.PassegerInfo;
import com.example.rest.entity.PaymentInfo;

public class FlightBookingRequest {
	private PassegerInfo passengerInfo;
	private PaymentInfo paymentInfo;
	public PassegerInfo getPassengerInfo() {
		return passengerInfo;
	}
	public void setPassengerInfo(PassegerInfo passengerInfo) {
		this.passengerInfo = passengerInfo;
	}
	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}
	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
	public FlightBookingRequest(PassegerInfo passengerInfo, PaymentInfo paymentInfo) {
		super();
		this.passengerInfo = passengerInfo;
		this.paymentInfo = paymentInfo;
	}
	public FlightBookingRequest() {
		super();
	}
	
	

}
