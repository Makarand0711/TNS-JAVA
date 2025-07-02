package com.tnsif.daytwo.jumpDemo;

public class switch_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userinput=1;
		switch(userinput)
		{
		case 1: System.out.println("Current recharge details");
		break;
		case 2: System.out.println("Current recharge expiry");
		break;
		case 3: System.out.println("new offers");
		break;
		case 4: System.out.println("talk to our customer person");
		break;
		default :
			System.out.println(userinput + " nay sapdat \nnit tak ki mitra");
		}
	}

}
