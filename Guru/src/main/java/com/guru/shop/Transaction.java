package com.guru.shop;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class Transaction {
	
	@SerializedName("amount")
	private int amount;
	
	@SerializedName("sender")
	private String sender;
	
	@SerializedName("reciever")
	private String reciever;
	
	@SerializedName("type")
	private TransactionType type;
	
	@SerializedName("time")
	private Date time;

	public Transaction(int amount, String sender, String reciever, Date time, TransactionType type) {
		this.amount = amount;
		this.sender = sender;
		this.reciever = reciever;
		this.time = time;
		this.type = type;
	}

	public int getAmount() {
		return amount;
	}

	public TransactionType getType() {
		return type;
	}

	public void setType(TransactionType type) {
		this.type = type;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReciever() {
		return reciever;
	}

	public void setReciever(String reciever) {
		this.reciever = reciever;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
	

}
