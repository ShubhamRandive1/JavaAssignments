package Q3;

import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args)throws InsufficientFundsException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the account number");
		
		String number = sc.next();
		
		Account newacc = new Account(number);
		
		System.out.println("Enter the amount to deposit");
		
		int amountt = sc.nextInt();
		
		newacc.deposit(amountt);
		
		System.out.println("Enter the amount want to withdraw");
		
		int amount = sc.nextInt();
		
		try {
			
			double remains = newacc.withdraw(amount);
			System.out.println("Remaining balance amount is :"+" "+remains);
		}catch(InsufficientFundsException ie) {
			ie.printStackTrace();
			System.out.println(ie.getMessage());
		}
		
	}

}
