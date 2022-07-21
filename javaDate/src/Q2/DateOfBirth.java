package Q2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateOfBirth {
	
	
	
	public int DateOfBirth(String date)throws InvalidDateFormatException{
		
		try {
			DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
			LocalDate localD = LocalDate.parse(date,dateTime);
			
			LocalDate localD1 = LocalDate.now();
			
			Period p = Period.between(localD, localD1);
			
			if(p.getYears() > 0 || p.getMonths() > 0 || p.getDays() > 0) {
				
				return p.getYears();
				
			}else {
				
				return -1;
			}
		}catch(Exception IDF) {
			
			InvalidDateFormatException IDF1 = new InvalidDateFormatException("Invalid dte format");
			
			throw IDF1;
			
		}
		
	}

	public static void main(String[] args) throws InvalidDateFormatException{
		// TODO Auto-generated method stub
		
		try {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Date Of Birth in Formate : dd/MM/yyyy");
			
			String date = sc.next();
			
			DateOfBirth dateOB = new DateOfBirth();
			
			
			int Age = dateOB.DateOfBirth(date);
			
			if(Age < 0) {
				System.out.println("Date should not be in future");
			}else {
				System.out.println(Age);
			}
		}catch(InvalidDateFormatException IDFE) {
			
			IDFE.printStackTrace();
		}

	}

}
