package Q3;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.tree.ExpandVetoException;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("....Start of the main....");
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter number 1 :");
			
			int num1 = sc.nextInt();
			
			System.out.println("Enter number 2 :");
			
			int num2 = sc.nextInt();
			
			sc.close();
			
			String message = null;
			int num3 = num1/num2;
			
			if(num3 >10) {
				
				message = "Welcome to Expectional Handling";
				
				
			}
			
			System.out.println("Message is"+" "+message.toUpperCase());
			
			System.out.println("....End of the main....");
			
			sc.close();
		}catch(ArithmeticException ae) {
			
			System.out.println("Cannot be divided by 0");
		}catch(NullPointerException NEP) {
			
			System.out.println("String is Null");
			
		}catch(InputMismatchException IME) {
			
			System.out.println("Enter Valid Number");
		}catch(Exception ex) {
			
			System.out.println("Something went wrong");
		}
		
		
		

	}

}
