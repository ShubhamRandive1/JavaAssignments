package javadayday19Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		
		List<Product> prod = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("Please enter the product id");
			int pId = sc.nextInt();
			
			System.out.println("Please enter the product name");
			String pName = sc.next();
			
			System.out.println("Please enter the product price");
			double pPrice = sc.nextDouble();
			
			
			prod.add(new Product(pId,pName,pPrice));
			
			
			System.out.println("Want to add more products enter Y or enter N for no");
			
			String ss = sc.next();
			
			if(ss.contains("N")) {
				
				break;
				
			}
		}
		
		System.out.println("Choose the option from 1 , 2, 3");
		
		int choice = sc.nextInt();
		
		if(choice == 1) {
			
			Collections.sort(prod, new ProductSortByPrice());
			System.out.println(prod);
		}
		else if(choice == 2) {
			Collections.sort(prod, new ProductSortByName());
			System.out.println(prod);
		}
		else if(choice ==3) {
			Collections.sort(prod, new ProductSortByID());
			System.out.println(prod);
		}
		
	}

}
