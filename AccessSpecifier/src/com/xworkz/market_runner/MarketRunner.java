package com.xworkz.market_runner;

import com.xworkz.market.base.SuperMarket;
import com.xworkz.market.online.OnlineMarket;

public class MarketRunner {

	public static void main(String[] args) {
		System.out.println("running main ");
		SuperMarket supermarket=new SuperMarket();
		supermarket.sell();
		supermarket.buy();
		
		
		OnlineMarket onlinemarket=new OnlineMarket();
		onlinemarket.buy();
		
		

	}

}
