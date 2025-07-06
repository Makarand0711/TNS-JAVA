package day_two;


public class Primitive_Data_Type_Demo {

	public static void main(String[] args) {
		byte byteMax = 127;
		byte byteMin = -128;
		
		System.out.println("Minimum: "+byteMin+ " Maximum: "+byteMax);
		short ShortMax = 32767;
		short ShortMin = -32768;
		System.out.println("Minimum: "+ShortMin+ " Maximum: "+ShortMax);
		int maxInt = 2147483647;
		int minInt = -2147483648;
		System.out.println("Minimum: "+minInt+ " Maximum: "+maxInt);
		long maxLong = 9223372036854775807L;
		long minLong = -9223372036854775808L;
		System.out.println("Minimum: "+minLong+ " Maximum: "+maxLong);

		float f = 3234.141243278345f;
		System.out.println("float value: " +f);
		double d = 3456.14124512345678902345678914f;
		System.out.println("Double value: "+d);
		boolean flag = false;
		boolean flag2 = true;
		System.out.println("boolean can be "+flag +" or "+flag2);
	}

}
