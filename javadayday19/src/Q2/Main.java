package Q2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		TreeSet<Employee> ee = new TreeSet<>();
		
		while(true) {
			
			System.out.println("Enter Id Of Employee");
			
			int eId= sc.nextInt();
			
			System.out.println("Enter Name Of Employee");
			
			String eName = sc.next();
			
			System.out.println("Enter Salary of Employee");
			
			double eSalary = sc.nextDouble();
			
			
			ee.add(new Employee(eId,eName,eSalary));
			
			System.out.println("want to add another employee type Y for yes or type N for no");
			
			String ss = sc.next();
			
			if(ss.contains("N")) {
				
				break;
			}
		}
		
		System.out.println(ee);
	}

}
