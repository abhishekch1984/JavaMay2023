package com.sbi;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyFunctions fun=new MyFunctions();
		//fun.clearScreen();
		//fun.gotoLocation(20, 30);
		//System.out.println("Average of 10+20+30 is "+ fun.findAverage(10, 20, 30));
		//System.out.println(fun.getAuthorName());
		funTest ft=new funTest();
		ft.firstfun();
		ft.secfun("This is Second type of function, with argument but without return");
		System.out.println(ft.thirdfun());
		System.out.println("This is fourth type of function with arguments and return. The multiplication of 15, 30 & 45 is: " + ft.foruthfun(15, 30, 45));
	}

}

class Dancer
{
	void dance() {
		System.out.println("dancer is dancing....");
	}
	void jump() {
		System.out.println("dancer is jumping....");
	}
	void turnAround() {
		System.out.println("dancer is dancing....");
	}
	void rotateleft() {
		System.out.println("dancer is rotating left....");
	}
	void rotateright() {
		System.out.println("dancer is rotating right....");
	}
}

class MyFunctions
{
	void clearScreen() {
		System.out.println("Cleaning screen");
	}
	void gotoLocation (int longitude, int latitude) {
		System.out.println("Going to location longitude:" +longitude+ " and latitude:"+latitude);
	}
	float findAverage(int x, int y, int z) {
		float a = ((x+y+z)/3);
		System.out.println("Average is :" + a);
		return (a);
	}
	String getAuthorName() {
		return ("Abhishek Chaurasiya");
	}
}

class funTest
{
	void firstfun() {
		System.out.println("This is first type of function, without argument and without return");
	}
	
	void secfun(String text) {
		System.out.println(text);
	}
	
	String thirdfun() {
		String tt = "This is third type of function with return value, but no argument";
		return (tt);
	}
	int foruthfun(int x, int y, int z) {
		return (x*y*z);
	}
}