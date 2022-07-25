package Q1;

public class PermanentEmployee extends Employee{
	
	
	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		
		super(employeeId, employeeName, basicPay);
		this.basicPay = basicPay;
	}
	
	private double basicPay;

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		double PFAmount = basicPay*(12/100);
		
		double Persalary = basicPay - PFAmount;
		
	}
	
	

}
