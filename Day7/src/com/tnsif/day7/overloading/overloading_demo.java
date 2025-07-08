package com.tnsif.day7.overloading;

public class overloading_demo {

	public static void main(String[] args) {
		
		pointer p= new pointer(); // default
		System.out.println(p);
		
		pointer p1=new pointer(20.09f, 23.45f);
		System.out.println(p1);
		
		System.out.println("Method Overloading");
		System.out.println(methode_overloading.addition(3.14f, 23.67f));
		System.out.println(methode_overloading.addition(1, 2, 3));

	}

}