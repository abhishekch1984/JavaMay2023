package com.sbi;

public class testAccount {
	public static void main(String[] args) {
		TestAccountSet ta1 = new TestAccountSet();
		TestAccountSet ta2 = new TestAccountSet();
		ta1.setAccount(123, "Abhishek", 5000000);
		ta2.setAccount(223, "Ram", 60000000);
		ta1.depositAcc(2000);
		ta1.withdrawAcc(3000);
		
		ta2.depositAcc(2000);
		ta2.withdrawAcc(3000);
	}
}

class TestAccountSet {
	private String accuntHolderName;
	private int accountNumber;
	private double accountBalance;
	 void setAccount (int x, String y, double z) {
		accountNumber = x;
		accuntHolderName = y;
		accountBalance = z;
		
		System.out.println("Account Holder Name is " + accuntHolderName);
		System.out.println("Account Number is " + accountNumber);
		System.out.println("Account Balance is " + accountBalance);
		System.out.println("---------------------------------------");
	}
	double depositAcc(double x) {
		System.out.println(accuntHolderName+ " is depositing....and now current balance is " + (accountBalance + x));
		
		return (accountBalance + x);
	}
	double withdrawAcc(double x) {
		System.out.println(accuntHolderName+ " is withdrawing....and now current balance is " + (accountBalance - x));
		return (accountBalance - x);
	}
}