package com.example.rest.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class PassegerInfo {
	@Id
	@GeneratedValue
	private Long pId;
	private String name;
	@JsonFormat
	private  Date travelDate;
	private Double fare;
	public Long getpId() {
		return pId;
	}
	public void setpId(Long pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	public Double getFare() {
		return fare;
	}
	public void setFare(Double fare) {
		this.fare = fare;
	}
	public PassegerInfo(Long pId, String name, Date travelDate, Double fare) {
		super();
		this.pId = pId;
		this.name = name;
		this.travelDate = travelDate;
		this.fare = fare;
	}
	public PassegerInfo() {
		super();
	}
	
	
	

}
