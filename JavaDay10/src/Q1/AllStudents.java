package Q1;

import java.util.Scanner;

public class AllStudents {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String name = sc.next();
		
		
		System.out.println("Enter your address");
		
		String address = sc.next();
		
		
		System.out.println("Enetr chemistry marks");
		
		int chemistryMarks = sc.nextInt();
		
		
		System.out.println("Enter maths marks");
		
		int mathsMarks = sc.nextInt();
		
		System.out.println("Enter physics marks");
		
		int physicsMarks = sc.nextInt();
		
		
		ScienceStudent Ss = new ScienceStudent(name, address, physicsMarks, chemistryMarks, mathsMarks);
			Ss.showDetails();
		double result = Ss.getPercentage();
		
		
		System.out.println("Percentage :"+" "+result);
		
		
		System.out.println("Enter name");
		
		String name1 = sc.next();
		
		
		System.out.println("Enter address");
		
		String address1 = sc.next();
		
		
		System.out.println("Enter history marks");
		
		int historyMarks = sc.nextInt();
		
		System.out.println("Enter civic marks");
		
		int civicMarks = sc.nextInt();
		
		HistoryStudent Hs = new HistoryStudent(name1, address1, historyMarks, civicMarks);
		
		Hs.showDetails();
		
		double answer = Hs.getPercentage();
		
		System.out.println("Percentage :"+" "+answer);
		
		
		sc.close();
	}

}
