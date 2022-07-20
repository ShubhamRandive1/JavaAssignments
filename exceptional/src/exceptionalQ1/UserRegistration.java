package exceptionalQ1;

import java.util.Scanner;

public class UserRegistration {

	
	public void registerUser(String name,String Country)throws InvalidCountryException {
		
		if(Country.equalsIgnoreCase("India")) {
			System.out.println("User registration successful");
		}else {
			InvalidCountryException forign = new InvalidCountryException("User is from forign country cannot register");
			throw forign;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		UserRegistration newUser = new UserRegistration();
		
		try {
			System.out.println("Enter user name");
			
			String name = sc.next();
			
			System.out.println("Enter the country name");
			
			String country = sc.next();
			
			newUser.registerUser(name, country);
		}catch(InvalidCountryException forign){
			
			System.out.println(forign.getMessage());
			forign.printStackTrace();
			
		}
	}

}
