package Q3;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	List<Book> books = new ArrayList<>();
	
	public void addBooks(Book book) {
		
		if(!books.contains(book)) {
			
			books.add(book);
			
			
		}else {
			System.out.println("Duplicate book");
		}
	}

}
