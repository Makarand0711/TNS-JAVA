package com.tnsif.day6.finalkeyword;

public class FinalVariable {
	final int x = 100;
	final static int y;
	
	final static int z = 10;
	void change() {
	}

	@Override
	public String toString() {
		return "FinalVariable [x= " + x + ", y= " +y+ "]";
	}
	
	static {
		y = 20;
	}
}