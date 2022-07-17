package Q1;

import java.util.*;

import java.util.regex.Pattern;

import javax.sql.CommonDataSource;

public class Demo {
	
	public boolean validate(String name, String mobileNum, String aadharCard) {
		
		int temp = 0;
		
		if(Pattern.matches("[A-Za-Z]{3,9}", name)) {
			
			temp++;
		}
		if(Pattern.matches("[6789]{1}[0-9]{9}", mobileNum)) {
			
			temp++;
		}
		
		if(Pattern.matches("[0-9]{4}[0-9]{4}[0-9]{4}[0-9]{4}", aadharCard)) {
			
			temp++;
		}
		if(temp == 3) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		
		Citizen commomPerson = new Citizen();
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your Name");
		
		String name = sc.next();
		
		System.out.println("Enter aadharCard Number");
		
		String aadhar = sc.next();
		
		
		System.out.println("Enter mobile Number");
		
		String mobile = sc.next();
		
		
		Demo d1 = new Demo();
		
		boolean validatation = d1.validate(name, mobile, aadhar);
		
		if(validatation == true) {
			
			commomPerson.setName(name);
			commomPerson.setMobileNumber(mobile);
			commomPerson.setAadharNumber(aadhar);
			
			
			System.out.println("Name :"+" "+ commomPerson.getName());
			
			System.out.println("Mobile Number :"+" "+commomPerson.getMobileNumber());
			
			System.out.println("Aadhar Number :"+" "+commomPerson.getAadharNumber());
		}
		else {
			System.out.println("Enter valid Input !!! ");
		}
	}

}
