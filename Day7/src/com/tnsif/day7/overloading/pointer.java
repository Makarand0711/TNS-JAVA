package com.tnsif.day7.overloading;

//constructor overloading 
public class pointer {

	private float x;
	private float y;
	
	
	public pointer()
	{
		x=0.0f;
		y=0.0f;
	}


	public pointer(float x) {
		this.x = x; 
		this.y = y;
	}


	public pointer(float x, float y) {
		this.x = x;
		this.y = y;
	}


	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
	
}