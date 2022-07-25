package Q2;

public class Employee implements Comparable<Employee>{
	
	private int empId;
	
	private String empName;
	
	private double salary;
	
	@Override
	public String toString() {
		return "Employee"+" ID"+empId+" "+"Name"+" "+empName+" "+"Salary"+" "+salary+" ";
	}

	public Employee() {
		super();
	}

	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
