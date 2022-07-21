package StudentBean;

import java.util.Scanner;

public class StudentBeam {
	
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	
	public StudentBeam() {
		
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public char getGrade() {
		return grade;
	}


	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
	public void displayDetails() {
		
		Scanner sc = new Scanner(System.in);
		
		
		StudentBeam student = new StudentBeam();
		
		System.out.println("Enter Roll");
		
		int roll = sc.nextInt();
		
		student.setRoll(roll);
		
		
		System.out.println("Enter Name");
		
		String name = sc.next();
		
		student.setName(name);
		
		
		System.out.println("Enter Marks");
		
		int marks = sc.nextInt();
		
		student.setMarks(marks);
		
		
		char grades = student.calculateGrade(marks);
		
		student.setGrade(grades);
		
		System.out.println(student.toString());
	}
	
	
	
	public String toString() {
		return "StudentBean [Roll =" + roll + ", Name=" + name + ", Marks=" + marks + ", Grade=" + grade + "," + getRoll()+","+ getName()+","+getMarks()+","+getGrade()+"]";
					
		
		
	}
	
	private char calculateGrade(int marks) {
		if(marks >= 500) {
			return 'A';
		}
		else if(marks < 500 && marks >= 400) {
			return 'B';
		}
		else {
			return 'C';
		}
	} 
	
	
	
	

}
