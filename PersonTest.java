package com.sbi;

public class PersonTest {

	public static void main(String[] args) {
	Person person = new Person('M',23,"Ram");	
	Person person2 = new Person('M',33,"Laxman");
	System.out.println("Person: "+person);
	System.out.println("Person: "+person.getName() + " age "+ person.getAge() + " gender "+person.getGender());
	Corporation corp = new Corporation();
	corp.changePersonalDetails(person);
	System.out.println("Person: "+person.getName() + " age "+ person.getAge() + " gender "+person.getGender());
	corp.discussions(person, person2);
	}

}
class Corporation {
	void changePersonalDetails(Person x) {
		System.out.println("Changing Personal Details.............");
		x.setName("Robert");
		x.setAge(43);
		
	}
	void discussions(Person x, Person y) {
		System.out.println("Discussions are going on between "+x.getName() + " and "+ y.getName());
	}
}
class Person
{
	private char gender;
	private int age;
	private String name;
	
	public Person(char gender, int age, String name) {
		super();
		this.gender = gender;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [gender=" + gender + ", age=" + age + ", name=" + name + "]";
	}
	void setName(String newName) {
		name=newName;
	}
	void setAge(int newAge) {
		age=newAge;
	}
	void setAge(char newGender) {
		gender=newGender;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	char getGender() {
		return gender;
	}
}