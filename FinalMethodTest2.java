package com.sbi;

public class FinalMethodTest2 {
	public static void main(String[] args) {
		
		def dd = new def();
		dd.dep();
		dd.wdl();
	}
}

abstract class abc
{
	abstract void dep();
	abstract void wdl();
	
}

abstract class cde extends abc
{
void dep() {
	System.out.println("Hi1");
}
void wdl () {
	System.out.println("Hi2");
}
}
class def extends cde
{
	
}