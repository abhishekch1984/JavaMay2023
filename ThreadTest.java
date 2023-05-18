package com.sbi;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car1 c = new car1();
		c.run();
		Bike b = new Bike();
		b.run();
		Train t = new Train();
		t.run();
	}

}
class car1  
{
	public void run() {
		for (int i=1;i<=120;i++) {
			System.out.println("Car is running " +i);
		}
	}
}
class Bike {
	public void run() {
		for (int i=1;i<=120;i++) {
			System.out.println("Bike is running " +i);
		}
	}
}
class Train {
	public void run() {
		for (int i=1;i<=120;i++) {
			System.out.println("Train is running " +i);
		}
	}
}