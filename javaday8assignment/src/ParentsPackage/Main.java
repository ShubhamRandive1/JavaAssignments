package ParentsPackage;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Parents parent = new Child();
		
		System.out.println("Enter The Number");
		
		
		 int num = sc.nextInt();
		 
		 if(num <= 0 && num > 10) {
			 System.out.println("Enter valid Number");
		 }else {
			 parent.number = num;
		 }
		 
		 parent.method1();
		 parent.method2();
		 parent.method3();
		 
		 Child chi = (Child)parent;
		 
		 chi.method4();
	}

}
