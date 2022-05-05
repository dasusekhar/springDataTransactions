package com.example.rest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class PaymentInfo {
	@Id
	@GeneratedValue(generator="uuid2")
	@GenericGenerator(name="uuid2",strategy="org.hibernate.id.UUIDGenerator")
	private String paymemtId;
	private String acctNo;
	private Double amount;
	private String cardType;
	private Long passengerId;
	public String getPaymemtId() {
		return paymemtId;
	}
	public void setPaymemtId(String paymemtId) {
		this.paymemtId = paymemtId;
	}
	public String getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public Long getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(Long passengerId) {
		this.passengerId = passengerId;
	}
	public PaymentInfo(String paymemtId, String acctNo, Double amount, String cardType, Long passengerId) {
		super();
		this.paymemtId = paymemtId;
		this.acctNo = acctNo;
		this.amount = amount;
		this.cardType = cardType;
		this.passengerId = passengerId;
	}
	public PaymentInfo() {
		super();
	}

}
