package Q1;

public class ScienceStudent extends Student {
	
	int physicsMarks;
	int chemistryuMarks;
	int mathsMarks;
	
	
	
	
	public ScienceStudent(String name, String address, int physicsMarks, int chemistryuMarks, int mathsMarks) {
		super(name, address);
		this.physicsMarks = physicsMarks;
		this.chemistryuMarks = chemistryuMarks;
		this.mathsMarks = mathsMarks;
	}
	
	
	double getPercentage() {
		
		double percent = (chemistryuMarks+mathsMarks+physicsMarks)/3;
		
		return percent;
	}
	
	
	void showDetails() {
		System.out.println("Student Name "+"  "+name);
		System.out.println("Address "+" " +address);
		System.out.println("Chemistry Marks "+" "+chemistryuMarks);
		System.out.println("Physics Marks "+" "+physicsMarks);
		System.out.println("Maths Marks "+" "+mathsMarks);
	}
	
	
	

}
