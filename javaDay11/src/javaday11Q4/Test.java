package javaday11Q4;

import java.util.Scanner;

public class Test implements intr{
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the integer till which you want prime numbers");
		
		
		int prime = sc.nextInt();
		
		intr ii = new Test();
		
		ii.display(prime);
		
	}

	@Override
	public void display(int p) {
		// TODO Auto-generated method stub
		
		int x,y,flag;
		
		for(x=1;x<=p;x++) {
			
			if(x == 1 || x == 0) {
				continue;
			}
			flag=1;
			
			for(y=2;y<=x/2;++y) {
				
				if(x%y == 0) {
					flag = 0;
					break;
				}
			}
			
			if(flag == 1) {
				
				
				
				System.out.println(x);
			}
		}
	}

}
