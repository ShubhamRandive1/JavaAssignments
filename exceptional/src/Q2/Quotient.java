package Q2;

import java.util.Scanner;

import java.lang.Exception;

public class Quotient {
	
	
	public int Quotient(int num1,int num2) {
		
		int quot = num1/num2;
		
		return quot;
		
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 2 numbers");
		
		int num1 = sc.nextInt();
		
		int num2 = sc.nextInt();
		
		Quotient q = new Quotient();
		
		try {
				
				System.out.println(q.Quotient(num1, num2));
		
		
	}catch(Exception ex) {
		ex.printStackTrace();
	}finally {
		System.out.println("Inside finally block");
	}

}
}
