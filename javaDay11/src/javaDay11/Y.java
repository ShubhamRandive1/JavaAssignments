package javaDay11;

public interface Y {
	
	public abstract void y();
	
	public default void y2() {
		
		System.out.println("Writing by default ball pen.");
	}
	
	public static void y3() {
		System.out.println("Writing by static ball pen.");
	}

}
