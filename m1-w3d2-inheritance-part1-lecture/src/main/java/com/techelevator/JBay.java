package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class JBay {

	public static void main(String[] args) {
		/*
		 * create new auction
		 */
		Auction javaBeanyBabby = new Auction("Mint Condition Bean Baby");
		/*
		 * create buyout auction
		 */
		BuyoutAuction zeldaGame = new BuyoutAuction("Mint flavored Zelda Game", 20);
		/*
		 * create reserve auction
		 */
		ReserveAuction plushie = new ReserveAuction("Death Metal Plushie", 25);
			
		/*
		 * list of auctiona
		 */
		List<Auction> allAuctions = new ArrayList<>();
		
		allAuctions.add(javaBeanyBabby);
		allAuctions.add(zeldaGame);
		allAuctions.add(plushie);
		
		for(Auction currentAuction: allAuctions) {
			currentAuction.placeBid(new Bid("Brad", 20));
			currentAuction.placeBid(new Bid("Greg", 30));
			currentAuction.placeBid(new Bid("Barb", 100));
			
			System.out.println(currentAuction.getItemForSale() + ": current wining bidder is " + currentAuction.getHighBid().getBidder() + " who bid "+ currentAuction.getHighBid().getBidAmount());

		}
		
		
//			
//			
//		javaBeanyBabby.placeBid(new Bid("James", 100)); // place new bid
//		
//		/*
//		 * print auction results
//		 */
//		System.out.println(javaBeanyBabby.getItemForSale() + ": current wining bidder is " + javaBeanyBabby.getHighBid().getBidder() + " who bid "+ javaBeanyBabby.getHighBid().getBidAmount());
//		
//		
//		
//		 plushie.placeBid(new Bid ("Andrew", 10)); // place new bid that will fail
//		 plushie.placeBid(new Bid ("Erin", 40)); // place new bid that will pass and post
//		 System.out.println(plushie.getItemForSale() + ": current wining bidder is " + plushie.getHighBid().getBidder() + " who bid "+ plushie.getHighBid().getBidAmount());
//		 
//		 
//		 zeldaGame.placeBid(new Bid ("Joe", 125)); // place new bid that will fail
//		 zeldaGame.placeBid(new Bid ("Bryan", 400)); // place new bid that will pass and post
//		 System.out.println(zeldaGame.getItemForSale() + ": current wining bidder is " + zeldaGame.getHighBid().getBidder() + " who bid "+ zeldaGame.getHighBid().getBidAmount());
//		 
	}

}
