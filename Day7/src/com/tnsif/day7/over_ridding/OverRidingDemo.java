package com.tnsif.day7.over_ridding;

public class OverRidingDemo {

	public static void main(String[] args) {
		
		RBI rbi;
		 
		rbi=new SBI();
		System.out.println(rbi.getRateofInterest());
		
		rbi=new ICICI();
		System.out.println(rbi.getRateofInterest());
		
		rbi=new HDFC();
		System.out.println(rbi.getRateofInterest());

	}

}
