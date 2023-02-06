package AssignmentExam;
class Loan {
private int accountNumber;
private int accountBalance;
private int salary;
private String loanType;
private int loanAmountExpected;
private int emisExpected;

public Loan(int accountNumber, int accountBalance, int salary, String loanType, int loanAmountExpected, int emisExpected) {
this.accountNumber = accountNumber;
this.accountBalance = accountBalance;
this.salary = salary;
this.loanType = loanType;
this.loanAmountExpected = loanAmountExpected;
this.emisExpected = emisExpected;
}

public boolean validate() {
if (accountNumber < 1000 || accountNumber > 9999) {
	System.out.println("Error: Invalid account number. The account number should be of 4 digits and its first digit should be 1");
	return false;
	}
	if (accountBalance < 1000) {
	System.out.println("Error: Insufficient account balance. The customer should have a minimum balance of $1000 in the account");
	return false;
	}
	return true;
	}

	public boolean checkLoanEligibility() {
	int eligibleLoanAmount = 0;
	int eligibleEmis = 0;
	if (salary > 25000 && loanType.equals("Car")) {
	eligibleLoanAmount = 500000;
	eligibleEmis = 36;
	}
	if (salary > 50000 && salary <= 75000 && loanType.equals("House")) {
	eligibleLoanAmount = 6000000;
	eligibleEmis = 60;
	}
	if (salary > 75000 && loanType.equals("Business")) {
	eligibleLoanAmount = 7500000;
	eligibleEmis = 84;
	}
	if (eligibleLoanAmount == 0) {
		System.out.println("Error: You are not eligible for the loan");
		return false;
		}
		if (loanAmountExpected > eligibleLoanAmount ||emisExpected > eligibleEmis) {
		System.out.println("Error: Loan not provided. The loan amount and the number of EMIs expected by the customer should be less than or equal to the loan amount and the number of EMIs decided by the bank respectively.");
		return false;
		}
		System.out.println("Eligible Loan Amount: " + eligibleLoanAmount);
		System.out.println("Eligible EMIs: " + eligibleEmis);
		return true;
		}
		}

public class ControlStructure {

	public static void main(String[] args) {
		Loan loan = new Loan(1001, 250000, 40000, "Car", 300000, 30);
		if (loan.validate()) {
		loan.checkLoanEligibility();
		}

	}

}
