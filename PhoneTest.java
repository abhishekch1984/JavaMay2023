package com.sbi;

public class PhoneTest {
	public static void main(String[] args) {
		
		System.out.println(100+200+" 100+200 is "+100+200);
		Phone myPhone = new Phone();
		myPhone.dial();
		myPhone.dial((byte)123);
		myPhone.dial("Jack");
		myPhone.dial((byte)91, 9413399565L);
		myPhone.dial(9413399565L,(byte)91);
		System.out.println(myPhone.dial(123));
	}
}
class Phone {
	void dial() {
		System.out.println("dial(byte) nowhere...." );
	}
	int dial(int x) {
		return (x);
	}
	void dial(byte intercom) {
		System.out.println("dial(byte) nowhere...." + intercom);
	}
	void dial(String name) {
		System.out.println("dial(String) to...." + name);
	}
	void dial(byte code, long num) {
		System.out.println("dial(String) to....+"+ code + num);
	}
	void dial(long num, byte code) {
		System.out.println("dial(String) to....+"+ code + num);
	}
}