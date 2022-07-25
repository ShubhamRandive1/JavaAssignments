package Q1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Loan loanss = new Loan();
		
		double perEmployeeloan = loanss.calculateLoanAmount(new PermanentEmployee(1, "ram", 80000));
		
		double tempEmployee = loanss.calculateLoanAmount(new TemporaryEmployee(5, 500, 5, "raju"));
		
		System.out.println("Loan amount for permanent employee =>  "+perEmployeeloan);
		System.out.println("Loan amount for temporary employee =>  "+tempEmployee);

	}

}
