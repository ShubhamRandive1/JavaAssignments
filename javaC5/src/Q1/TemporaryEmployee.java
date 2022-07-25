package Q1;

public class TemporaryEmployee extends Employee{
	
	private int hoursWorked;
	
	private int hourlyWages;

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		
		int tempsalary = hoursWorked*hourlyWages;
		
		
		
	}

	public TemporaryEmployee(int hoursWorked, int hourlyWages,int employeeId,String employeeName) {
		super(employeeId,employeeName, hourlyWages);
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
	}
	
	
	
	
	

}
