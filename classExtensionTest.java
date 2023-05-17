package com.sbi;

public class classExtensionTest {

	public static void main(String[] args) {
	heartSurgeon hs = new heartSurgeon();
	Surgeon s = new Surgeon();
	Doctor d = new Doctor();
	
	if (hs instanceof Doctor)
	{
		System.out.println("HS is Doctor");
	}
	else
	{	
		System.out.println("HS is not a Doctor");
	}
	}
}

class Doctor {
	
}
class Surgeon extends Doctor {
	
}
class heartSurgeon extends Surgeon {
	
}