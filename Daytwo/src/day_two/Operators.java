package day_two;

public class Operators {
public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int x = 10;
		
		System.out.println("A and B value before the operation : "+ a +" "+b);
		
		++a;
		
		int c = ++a + b + a--;
		System.out.println("C value after the operation : "+c);
		
		int d = c++ + a + b--;
		System.out.println("D value after the operation : "+d);
		
		
		}

}
