package ParentsPackage;

public abstract class Parents {
	
	int number;
	
	abstract void method1();
	
	final void method2() {
		
		System.out.println("Method 2 = Parent class: This method can not be override");
	}
	
	void method3() {
		System.out.println("Method 3 = Parent class: This method may or maynot be override");
	}

}
