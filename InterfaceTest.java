package com.sbi;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Surgeon1 s = new Surgeon1();
		s.speaking();
		s.Operation();
		s.walk();
	}

}



interface Human1
{
	void speaking();
}
interface Doctor1
{
	void Operation();
}

class walking
{
	void walk() {
		System.out.println("Walk by extending");
	}
}

class Surgeon1 extends walking implements Human1, Doctor1
{
	public void speaking() {
		System.out.println("Surgeon speaking");
	}
	public void Operation() {
		System.out.println("Surgeon Operating");
	}
}