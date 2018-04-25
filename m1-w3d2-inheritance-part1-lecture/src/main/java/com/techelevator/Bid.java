package com.techelevator;

public class Bid {
	// instance var
	private String bidder;
	private int bidAmount;
	//cnstructor
	public Bid(String bidder, int bidAmount) {
		this.bidder = bidder;
		this.bidAmount = bidAmount;
	}
	//getter and setter
	public String getBidder() {
		return bidder;
	}
	
	public int getBidAmount() {
		return bidAmount;
	}
}
