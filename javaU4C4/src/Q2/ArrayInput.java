package Q2;

import java.util.Scanner;

import java.lang.Exception;

import java.util.InputMismatchException;

import java.lang.NumberFormatException;

import java.lang.ArrayIndexOutOfBoundsException;



public class ArrayInput {
	
	

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int input = 0;
		
		System.out.println("Enter the length of the array");
		
		input = sc.nextInt();
		
		int[] array = new int[input];
		
		
		System.out.println("Enter the elements in array");
		
		int elementsArray = sc.nextInt();
		
		for(int i=1;i<input;i++) {
			
			array[i] = sc.nextInt();
		}
		
		System.out.println("Enter the index for which you want to check element");
	try {
			int indexElement = sc.nextInt();
			
			int indexss = array[indexElement];
			
		
		System.out.println("the array element at index :"+" "+indexElement+" is :"+indexss);
		
		
		}catch(ArrayIndexOutOfBoundsException aoe) {
			
			aoe.printStackTrace();
			
			
		}catch(NumberFormatException ne) {
			
			ne.printStackTrace();
			
		}
	

	}

}


