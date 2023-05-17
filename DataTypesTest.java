package com.sbi;

public class DataTypesTest {

	public static void main(String[] args) {
		
		byte nurseryRollNumber=127;	
		short collegeRollNumber=30000;
		int universityRollno=92589544;
		long internationalUniversityno=922568954126455666L;
		float simpleInterest=3.55f;
		double compoundInterest= 56.23;
		System.out.println("byte   :" + nurseryRollNumber);
		System.out.println("Size of byte   :" + Byte.SIZE);
		System.out.println("byte   :" + collegeRollNumber);
		System.out.println("Size of Short   :" + Short.SIZE);
		System.out.println("byte   :" + universityRollno);
		System.out.println("Size of Integer   :" + Integer.SIZE);
		System.out.println("byte   :" + internationalUniversityno);
		System.out.println("Size of Long   :" + Long.SIZE);
		System.out.println("byte   :" + simpleInterest);
		System.out.println("Size of Float   :" + Float.SIZE);
		System.out.println("byte   :" + compoundInterest);
		System.out.println("Size of Double   :" + Double.SIZE);
		String city="New York";
		String bankName="State Bank of India";
		System.out.println("City     : "+city);
		System.out.println("Bank Name     : "+bankName);
		boolean isMarriad=true;
		System.out.println("Are you married "+ isMarriad);
	}

}
