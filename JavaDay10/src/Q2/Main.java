package Q2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Area ar = new Area();
		
		
		
		System.out.println("enter the side of square");
		
		int sq = sc.nextInt();
		
		System.out.println("The Area Of square is :"+" "+ar.squareArea(sq));
		
		System.out.println("enter the length of rectangle");
		
		int length = sc.nextInt();
		
		System.out.println("enter the breadth of rectangle");
		
		int breadth = sc.nextInt();
		
		System.out.println("The Area Of Rectangle is :"+" "+ar.rectangle(length, breadth));
		
		System.out.println("enter the radius of circle");
		
		int radius = sc.nextInt();
		
		System.out.println("The Radius Of Circle is :"+" "+ar.circleArea(radius));
		
		sc.close();
	}

}
