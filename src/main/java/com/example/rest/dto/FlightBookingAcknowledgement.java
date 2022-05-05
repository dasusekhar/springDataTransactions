package com.example.rest.dto;

import com.example.rest.entity.PassegerInfo;

public class FlightBookingAcknowledgement {
	private String status;
	private Double totalFare;
	private String pnrNO;
	private PassegerInfo passengerInfo;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(Double totalFare) {
		this.totalFare = totalFare;
	}
	public String getPnrNO() {
		return pnrNO;
	}
	public void setPnrNO(String pnrNO) {
		this.pnrNO = pnrNO;
	}
	public PassegerInfo getPassengerInfo() {
		return passengerInfo;
	}
	public void setPassengerInfo(PassegerInfo passengerInfo) {
		this.passengerInfo = passengerInfo;
	}
	public FlightBookingAcknowledgement(String status, Double totalFare, String pnrNO, PassegerInfo passengerInfo) {
		super();
		this.status = status;
		this.totalFare = totalFare;
		this.pnrNO = pnrNO;
		this.passengerInfo = passengerInfo;
	}
	public FlightBookingAcknowledgement() {
		super();
	}

}
