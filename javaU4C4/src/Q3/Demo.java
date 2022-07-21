package Q3;

import java.util.Scanner;

import java.util.InputMismatchException;

public class Demo {
	
	void showDetails(Month m){
		
		switch(m.toString()) {
		
		case "JAN":
			System.out.println("This is 1st Month Of the Year January");
			break;
		
		case "FEB":
			System.out.println("This is 2nd Month of the Year Feburary");
			break;
			
		case "MAR":
			System.out.println("Thuis is 3rd Month of the year March");
			break;
			
		case "APR":
			System.out.println("This is 4th Month of the Year April");
			break;
		case "MAY":
			System.out.println("This is 5th Month of the year may");
			break;
			
		case "JUN":
			System.out.println("This is 6th Month of the year June");
			break;
			
		case "JUL":
			System.out.println("This is 7th Month of the year JUL");
			break;
			
		case "AUG":
			System.out.println("This is 8th Month of the year August");
			break;
			
		case "SEP":
			System.out.println("This is 9th Month of the year septumber");
			break;
			
		case "OCT":
			System.out.println("This is 10th Month of the year october");
			break;
			
		case "NOV":
			System.out.println("This is 11th Month of the year November");
			break;
			
		case "DEC":
			System.out.println("This is 12th Month of the year December");
			break;
			
		
		}
		
	}
	
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			
			System.out.println("Enter the Month in short form");
			
			String monthName = sc.next();
			
			sc.close();
			
			Month months = Month.valueOf(monthName);
			
			d1.showDetails(months);
			
			
		}catch(Exception ex) {
		
		 System.out.println("Please enter the valid month");
		 System.out.println("The Exception is:"+" "+ex.getMessage());
		
	}

}
}
