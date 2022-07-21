package com.masai;

public class Demo2 {
	public static void main(String[] args) {
		
		X x1 = new Ximpl();
		
		X x2 = new Ximpl2();
		
		x1.fun1();
		x1.fun2();
		
		((Ximpl) x1).fun3();//downCasting interface variable into its implemented class object
		
		System.out.println(x1.i);
		
	}

}
