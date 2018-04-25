package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Auction {
	// instance var
	private String itemForSale;
	private Bid currentHighBid;
	private List<Bid> allBids;
	
	//constructor
	public Auction(String itemForSale) {
		this.itemForSale = itemForSale;
		this.currentHighBid = new Bid("", 0);
		allBids = new ArrayList<>();
	}
	// main logic
	public boolean placeBid(Bid offeredBid) {
		// add to list of bids
		allBids.add(offeredBid);
		boolean isCurrentWinningBid = false;
		//check if the bid we just got is the current high bid
		if(offeredBid.getBidAmount() > currentHighBid.getBidAmount()) {
			currentHighBid = offeredBid;
			isCurrentWinningBid = true;
		}
		// return wheter the current bid is a winning bid
		return isCurrentWinningBid;
	}
	//returns high bid
	public Bid getHighBid() {
		return currentHighBid;
	}
	// return a copy of list of bids
	public List<Bid> getAllBids() {
		return new ArrayList<>(allBids);
	}
	// return items for sale
	public String getItemForSale() {
		return itemForSale;
	}
}
