package com.tnsif.day7.over_ridding;

public class ICICI extends RBI{

	public float getRateofInterest()
	{
		System.out.println("Base rate of interest of home loan");
		return 7.2f;
	}
}