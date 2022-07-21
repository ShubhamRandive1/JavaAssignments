package Q1;

public class HistoryStudent extends Student{
	
	int historyMarks;
	int civicMarks;
	
	
	
	
	public HistoryStudent(String name, String address, int historyMarks, int civicMarks) {
		super(name, address);
		this.historyMarks = historyMarks;
		this.civicMarks = civicMarks;
	}
	
	@Override
	double getPercentage() {
		
		double percent = (historyMarks+civicMarks)/2;
		
		return percent;
	}
	
	void showDetails() {
		System.out.println("Name :"+" "+name);
		System.out.println("Address :"+" "+address);
		System.out.println("History Marks :"+" "+historyMarks);
		System.out.println("Civic Marks :"+" "+civicMarks);
	}

}
