package com.sbi;

public class ProfessorTest {

	public static void main(String[] args) {
		Professor p1 = new Professor ("Ram", "Hindi", "Asstt Prof");
		Professor p2 = new Professor ("Shyam", "English", "Asstt Prof");
		Professor p3 = new Professor ("Laxman", "Maths", "HOD");
		System.out.println("Professor Name " + p1.getpName()+ "  Subject "+p1.getpSubject() + " Type "+p1.getpType());
		System.out.println("Professor Name " + p2.getpName()+ "  Subject "+p2.getpSubject() + " Type "+p2.getpType());
		System.out.println("Professor Name " + p3.getpName()+ "  Subject "+p3.getpSubject() + " Type "+p3.getpType());
		
		System.out.println("---------------------------------------");
		System.out.println("One Professor is being promoted, new details are as under:");
		System.out.println("---------------------------------------");
		
		changeDetails cd = new changeDetails();
		cd.chSub(p1);
		cd.chType(p1);
		System.out.println("Professor Name " + p1.getpName()+ "  Subject "+p1.getpSubject() + " Type "+p1.getpType());
		System.out.println("Professor Name " + p2.getpName()+ "  Subject "+p2.getpSubject() + " Type "+p2.getpType());
		System.out.println("Professor Name " + p3.getpName()+ "  Subject "+p3.getpSubject() + " Type "+p3.getpType());
		
		System.out.println("---------------------------------------");
		System.out.println("1 Professor is being replaced, new details are as under:");
		System.out.println("---------------------------------------");
		
		changeName cd1 = new changeName();
		cd1.chName(p3);;
		System.out.println("Professor Name " + p1.getpName()+ "  Subject "+p1.getpSubject() + " Type "+p1.getpType());
		System.out.println("Professor Name " + p2.getpName()+ "  Subject "+p2.getpSubject() + " Type "+p2.getpType());
		System.out.println("Professor Name " + p3.getpName()+ "  Subject "+p3.getpSubject() + " Type "+p3.getpType());
		
	}

}

class changeDetails {
	void chSub(Professor x) {
		x.setpSubject("Science");
	}
	void chType(Professor x) {
		x.setpType("Professor");
	}
}

class changeName {
	void chName (Professor x) {
		x.setpName("Abhishek");
	}
}
class Professor {
	private String pName;
	private String pSubject;
	private String pType;
	/**
	 * @param pName
	 * @param pSubject
	 * @param pType
	 */
	public Professor(String pName, String pSubject, String pType) {
		super();
		this.pName = pName;
		this.pSubject = pSubject;
		this.pType = pType;
	}
	@Override
	public String toString() {
		return "Professor [pName=" + pName + ", pSubject=" + pSubject + ", pType=" + pType + "]";
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpSubject() {
		return pSubject;
	}
	public void setpSubject(String pSubject) {
		this.pSubject = pSubject;
	}
	public String getpType() {
		return pType;
	}
	public void setpType(String pType) {
		this.pType = pType;
	}
	
	
}