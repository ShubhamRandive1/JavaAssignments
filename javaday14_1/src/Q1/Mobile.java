package Q1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Mobile {
	
	String[] outdaterModels = {"note4","note5","note6","note7"};
	
	public void searchOutdatedModel(String name, String...model) {
		int i = 0;
		for(String mod:model) {
			int pointer = 0;
			while(i<outdaterModels.length) {
				if(mod.equalsIgnoreCase(outdaterModels[i])) {
					pointer++;
					
				}
				
				i++;
			}
			
			if(pointer == 0) {
				System.out.println(mod + " _OUTDATED");
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Mobile mob = new Mobile();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the mobile brand or model");
		
		String ss = sc.next();
		
		System.out.println("Enter the amount of models you want to put");
		
		int n = sc.nextInt();
		
		System.out.println("Entering outdate models may lead to outdated message");
		
		ArrayList<String> s = new ArrayList<>(); 
		
		for(int i = 0;i<n;i++) {
			
			String sss = sc.next();
			
			s.add(sss);	
		}
		
		String arr[] = new String[s.size()];
		
		for(int k=0;k<s.size();k++) {
			
			arr[k] = s.get(k);
		}
		
		for(String kk:arr) {
		
			//System.out.println(kk);
			
			mob.searchOutdatedModel(ss, arr);
		
		
		}
	}

}
