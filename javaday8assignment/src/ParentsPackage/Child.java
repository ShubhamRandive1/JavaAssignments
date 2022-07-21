package ParentsPackage;

public final class Child extends Parents{
	
	void method4() {
		System.out.println("Method 4 Child Class");
	}
	
	
	void method1() {
		System.out.println("Overriden method 1 : value of number"+super.number);
	}

}
