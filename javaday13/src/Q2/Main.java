package Q2;

import java.util.Scanner;

public class Main {
	
	public static Employee getEmployeeDetails(Employee employeee) {
		
		int x = employeee.employeeId;
		String n = employeee.employeeName;
		double s = employeee.salary;
		double net = employeee.netSalary;
		
		return employeee;
	}
	
	public static int getPFPercentage(int p) {
		double fund = p;
		
		return (int) fund;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee e = new Employee();
		
		
		System.out.println("Enter the employee id");
		
		e.employeeId = sc.nextInt();
		
		System.out.println("Enter Employee name");
		
		e.employeeName = sc.next();
		
		System.out.println("Enter employee salary");
		
		e.salary = sc.nextDouble();
		
		System.out.println("Enter employee net salary");
		
		e.netSalary = sc.nextDouble();
		
		int p = sc.nextInt();
		
		
		e.calculateNetSalary(getPFPercentage(p));
		
		System.out.println("ID"+" :"+e.employeeId);
		
		System.out.println("Name"+" :"+e.employeeName);
		
		
		System.out.println("Net Salary"+" :"+e.calculateNetSalary(getPFPercentage(p)) );
		
		
		sc.close();
		
	}
	
	

}
