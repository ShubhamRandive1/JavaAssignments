package Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		List<Book> bookss = new ArrayList<>();
		
		System.out.println("Enter the amount of books you want to add to library");
		
		int amount = sc.nextInt();
		
		for (int i = 0; i < amount; i++) {
			
			System.out.println("Enter the book id");
			
			int bookssid = sc.nextInt();
			
			System.out.println("Enter the book name");
			
			String name = sc.next();
			
			System.out.println("Enter author name");
			
			String authname = sc.next();
			
			
			bookss.add(new Book(bookssid,name,authname));
			
			
		}
		
		
		
		Library lib = new Library();
		
		for (int i = 0; i < bookss.size(); i++) {
			
			lib.addBooks(bookss.get(i));
			
			
		}
		
		for (int i = 0; i < lib.books.size(); i++) {
			
			
			Book bb = lib.books.get(i);
			bb.book();
			
		}

	}

}
