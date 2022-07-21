package Q2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<String> ss = new ArrayList<>();
	   	ss.add("10");
	    ss.add("20");
	    ss.add("40");
	    ss.add("50");
	    ss.add("60");
	    ss.add("70");
	    ss.add("80");
	    System.out.println("ArrayList: " + ss);

	        // Using forEach loop
	    System.out.println("Iterating over ArrayList using for-each loop:");
	    for(String language : ss) {
	      System.out.print(ss);
	      System.out.print("----");
	    }
	    
	    //Using for loop simple
	    System.out.println("Iterating over ArrayList using for loop: ");

	    for(int i = 0; i < ss.size(); i++) {
	      System.out.print(ss.get(i));
	      System.out.print("----");
	    }

	}

}
