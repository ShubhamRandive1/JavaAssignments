package Q1;

public class Loan {
	
	public double calculateLoanAmount(Employee employeeObj) {
		
		if(employeeObj instanceof PermanentEmployee) {
			
			double persalarys = employeeObj.getSalary()/12;
			return persalarys;
		}
		else if(employeeObj instanceof TemporaryEmployee) {
			double tempsalary = employeeObj.getSalary()/10;
			return tempsalary;
		}else {
			return 0;
		}
	}

}
