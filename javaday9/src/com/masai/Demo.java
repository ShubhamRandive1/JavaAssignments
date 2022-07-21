package com.masai;

public class Demo {
	
//	public void fun1(A a1)
//	{
//		if(a1 != null) {
//			System.out.println("inside fun1 of Demo");
//			System.out.println("the value of a1 is "+a1);
//			a1.funA1();
//			a1.funA2();
//		}else {
//			System.out.println("Dont pass null value");
//		}
//	}
	
	void fun1() {
		System.out.println("empty parameters");
	}
	
	void fun1(int x) {
		System.out.println("with parameters");
	}
	
	
	public void fun1(Object obj) {
		if(obj != null) {
			System.out.println("inside fun1(Object obj) of Demo");
			String s;
			
			 s = obj.toString();
			 System.out.println(s);
			
		}else {
			System.out.println("pass value");
		}
	}
	
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		
		//byte x = 10;
		
		//d1.fun1(null);
		
		//d1.fun1(new B());
		
		d1.fun1(new A());
		
		Object obj = new B();
		
		
	}

}
