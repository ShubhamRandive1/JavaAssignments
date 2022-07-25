package javaC5Q2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class dateOfBirth {
	
	public int DateOfBirth(String date)throws InvalidAgeException{
		
		try {
			
			DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
			LocalDate localDate = LocalDate.parse(date, dateTime);
			
			LocalDate localDate1 = LocalDate.now();
			
			Period per = Period.between(localDate, localDate1);
			
			if(per.getYears() > 0 || per.getMonths() >0 || per.getDays() >0) {
				
				return per.getYears();
			}else {
				
				return -1;
			}
		}catch(Exception ex) {
			
			InvalidAgeException ae = new InvalidAgeException("please pass the date in proper format");
			
			throw ae;
		}
	}
	
	public static void main(String[] args) throws InvalidAgeException{
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the date of birth in format : dd/MM/yyyy");
			
			String date = sc.next();
			
			dateOfBirth dob = new dateOfBirth();
			
			int Age = dob.DateOfBirth(date);
			
			if(Age > 18) {
				System.out.println("you are eligible to vote");
			}
			if(Age == 18) {
				System.out.println("Happy Birthday , you are eligilbe to vote");
			}
			if(Age < 0) {
				System.out.println("Date should not be in future");
			}
			
		}catch(Exception ex) {
			
			System.out.println(ex.getMessage());
			
			//ex.printStackTrace();
		}
		
		
		
	}

}
