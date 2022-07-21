package javaDateQ1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;


public class EmployeeBonus {
	
	public double bonusGet(String date)throws InvalidAgeException{
		
		DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate locaDate = LocalDate.parse(date,dateTime);
		
		LocalDate locald1 = LocalDate.now();
		
		Period p1 = Period.between(locaDate, locald1);
		
		if(p1.getYears() < 1 && p1.getDays() >= 1 && p1.getMonths() >= 1) {
			
			return 5000;
			
		}else if(p1.getYears() > 1 && p1.getYears() < 2) {
			
			return 8000;
			
		}else if(p1.getYears() > 2) {
			
			return 10000;
			
		}else {
			
			InvalidAgeException ia = new InvalidAgeException("Invalid Age....");
			throw ia;
		}
		
	}
	
	public static void main(String[] args) throws InvalidAgeException{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the date of joining in : dd/MM/yyyy format");
		
		String date = sc.next();
		
		EmployeeBonus EB = new EmployeeBonus();
		
		try {
			double bonus = EB.bonusGet(date);
			
			System.out.println("Your Bonus is : "+" "+bonus);
		}catch(InvalidAgeException IA) {
			
			InvalidAgeException Ia = new InvalidAgeException("Invalid Date Format");
			
			Ia.printStackTrace();
			
			
		}catch(Exception EX) {
			
			EX.printStackTrace();
		}
		
	}

}
