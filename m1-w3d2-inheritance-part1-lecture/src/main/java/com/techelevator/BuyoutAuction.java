package com.techelevator;

/**
 * This class models an auction with an additional set price (the 'buyout' price) that any bidder 
 * can accept at any time during the auction, thereby immediately ending the auction and winning 
 * the item.  If no bidder chooses to utilize the buyout option before the end of bidding the 
 * highest bidder wins.
 */
public class BuyoutAuction extends Auction {

	private int buyoutPrice;

	/**
	 * @param description the description of the auction
	 * @param buyoutPrice the set price that immediately wins the auction
	 */
	public BuyoutAuction(String itemForSale, int buyoutPrice) {
		super(itemForSale);
		this.buyoutPrice = buyoutPrice;
	}
	
	/*
	 * This class overrides the default placeBid behavior of the parent class.
	 * If the offeredBid meets or exceeds the buyout price, the bid is set
	 * to the buyout price and all future bids are ignored.
	 */
	@Override
	public boolean placeBid(Bid offeredBid) {
		boolean isCurrentWinningBid = false; // set winning bid to false
		if(getHighBid().getBidAmount() < buyoutPrice) { // if current hight bid is less than  buyout price
			if(offeredBid.getBidAmount() >= buyoutPrice) { // is offered bid greater than or equal to buyout price
				offeredBid = new Bid(offeredBid.getBidder(), buyoutPrice); // set bid to buyout price if higher
			}
			isCurrentWinningBid = super.placeBid(offeredBid); // pass bid to super class
		}
		return isCurrentWinningBid; // return if the bid is a winning bid
	}

	public int getBuyoutPrice() {
		return buyoutPrice;
	}

}
