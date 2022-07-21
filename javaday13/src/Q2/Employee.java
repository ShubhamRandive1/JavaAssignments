package Q2;

public class Employee {
	
	int employeeId;
	String employeeName;
	double salary;
	double netSalary;
	
	
	public Employee() {
	
	}
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	
	
	public double calculateNetSalary(int pfPercentage) {
		
		double totalNetSalary = pfPercentage - netSalary;
		
		return totalNetSalary;
		
	}

}
