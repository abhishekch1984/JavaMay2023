package com.sbi;

import java.time.LocalDate;

public class HasATest {
	public static void main(String[] args) {
		
		AadharCard aadharCard = new AadharCard("123412341234","Jack Dsouza","CBD Belapur",LocalDate.of(2002, 10, 25),"8865234567","JackSmiley.gif");
		PanCard panCard = new PanCard("AJDPD1232A","Jack Smith Dsouza",LocalDate.of(2002, 10, 25));
		voterCard vot = new voterCard("1234","Jack Smith Dsouza",LocalDate.of(2002, 10, 25),"CBD Belapur");
		DrivingLicense dL = new DrivingLicense("DL123", "Jack Smith Dsouza","CBD Belapur", "Mumbai");
		Person2 personObj = new Person2(23,'M',"Jack","2002, 10, 25",aadharCard, panCard,vot,dL);
		
		System.out.println("personObj : "+personObj);
		//personObj.showPersonDetails();
		
	}
}

class Heart
{
	void pump() {
		System.out.println("Heart is pumping...");
	}
}
class Mammal
{
	void walk() {
		System.out.println("Mammal is walking....");
	}
}
class Liver
{
	void prepareBlood() {
		System.out.println("preparing blood...");
	}
}
class Kidney {
	void filterBlood() {
		System.out.println("Filtering blood....");
	}
}

class Hemisphere
{
	void analyze() {
		System.out.println("Analyzing...");
	}
	void think() {
		System.out.println("Thinking...");
	}
}

class Brain
{
	 Hemisphere left = new Hemisphere();
	 Hemisphere right = new Hemisphere();
	
	void process() {
		left.analyze();
		left.think();
		right.analyze();
		right.think();
	}
}

class Human extends Mammal // isA - data type is affected
{
	int age;
	char gender;
	String name;
	String birthdate;
	
	
	
	Heart heart = new Heart(); //at the field level - hasA
	Liver liver = new Liver();
	Kidney leftKidney = new Kidney ();
	Kidney rightKidney = new Kidney ();
	private Brain brain = new Brain();
	
	
	
	
	

	public Human(int age, char gender, String name, String birthdate) {
		super();
		this.age = age;
		this.gender = gender;
		this.name = name;
		this.birthdate = birthdate;
	}

	void humanHealthStatus() {
		heart.pump();
		liver.prepareBlood();
		leftKidney.filterBlood();
		rightKidney.filterBlood();
		brain.process();
	}
	
	Brain getBrain() {
		return brain; //returning the object of line 70
	}

	@Override
	public String toString() {
		return "Human [age=" + age + ", gender=" + gender + ", name=" + name + ", birthdate=" + birthdate + "]";
	}

	
	
	
}

class AadharCard
{
	String aadharNumber;
	String nameOnAdhaar;
	String address;
	LocalDate birthdate;
	String mobileNumber;
	String photo;
	
	public AadharCard() {
		
	}
	
	public AadharCard(String aadharNumber, String nameOnAdhaar, String address, LocalDate birthdate,
			String mobileNumber, String photo) {
		super();
		this.aadharNumber = aadharNumber;
		this.nameOnAdhaar = nameOnAdhaar;
		this.address = address;
		this.birthdate = birthdate;
		this.mobileNumber = mobileNumber;
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "AadharCard [aadharNumber=" + aadharNumber + ", nameOnAdhaar=" + nameOnAdhaar + ", address=" + address
				+ ", birthdate=" + birthdate + ", mobileNumber=" + mobileNumber + ", photo=" + photo + "]";
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getNameOnAdhaar() {
		return nameOnAdhaar;
	}
	public void setNameOnAdhaar(String nameOnAdhaar) {
		this.nameOnAdhaar = nameOnAdhaar;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	
}

class PanCard
{
	String panNumber;
	String nameOfTheHolder;
	LocalDate dob;
	
	public PanCard(String panNumber, String nameOfTheHolder, LocalDate dob) {
		super();
		this.panNumber = panNumber;
		this.nameOfTheHolder = nameOfTheHolder;
		this.dob = dob;
	}

	public PanCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PanCard [panNumber=" + panNumber + ", nameOfTheHolder=" + nameOfTheHolder + ", dob=" + dob + "]";
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getNameOfTheHolder() {
		return nameOfTheHolder;
	}

	public void setNameOfTheHolder(String nameOfTheHolder) {
		this.nameOfTheHolder = nameOfTheHolder;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
	
}

class voterCard {
	String voterIdNo;
	String voterName;
	LocalDate dob;
	String voterAddress;
	/**
	 * @param voterIdNo
	 * @param voterName
	 * @param dob
	 * @param voterAddress
	 */
	public voterCard(String voterIdNo, String voterName, LocalDate dob, String voterAddress) {
		super();
		this.voterIdNo = voterIdNo;
		this.voterName = voterName;
		this.dob = dob;
		this.voterAddress = voterAddress;
	}
	@Override
	public String toString() {
		return "voterCard [voterIdNo=" + voterIdNo + ", voterName=" + voterName + ", dob=" + dob + ", voterAddress="
				+ voterAddress + "]";
	}
	public String getVoterIdNo() {
		return voterIdNo;
	}
	public void setVoterIdNo(String voterIdNo) {
		this.voterIdNo = voterIdNo;
	}
	public String getVoterName() {
		return voterName;
	}
	public void setVoterName(String voterName) {
		this.voterName = voterName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getVoterAddress() {
		return voterAddress;
	}
	public void setVoterAddress(String voterAddress) {
		this.voterAddress = voterAddress;
	}
	
}

class Person2 extends Human
{
	
	private AadharCard aadharCard; // it is a reference - hasA
	private PanCard pan;
	private voterCard vot;
	private DrivingLicense dL;
	
	
	public Person2(int age, char gender, String name, String birthdate, AadharCard aadharCard, PanCard pan, voterCard vot, DrivingLicense dL) {
		super(age, gender, name, birthdate);
		this.aadharCard = aadharCard;
		this.pan = pan;
		this.vot = vot;
		this.dL = dL;
	}

	void showPersonDetails() {
		System.out.println("Addhar Card 	: "+aadharCard);
		System.out.println("Pan    Card 	: "+pan);
		System.out.println("Voter  Card 	: "+vot);
		System.out.println("Driving License : "+dL);
	}

	@Override
	public String toString() {
		return "Person2 [toString()=" + super.toString() + ", aadharCard=" + aadharCard + ", pan=" + pan + ", Voter ID= " + vot +" , Driving License= " + dL + "]";
	}
	
	
}


class DrivingLicense {
	String dlNo;
	String Name;
	String Address;
	String IssCity;
	/**
	 * @param dlNo
	 * @param name
	 * @param address
	 * @param issCity
	 */
	public DrivingLicense(String dlNo, String name, String address, String issCity) {
		super();
		this.dlNo = dlNo;
		Name = name;
		Address = address;
		IssCity = issCity;
	}
	@Override
	public String toString() {
		return "DrivingLicense [dlNo=" + dlNo + ", Name=" + Name + ", Address=" + Address + ", IssCity=" + IssCity
				+ "]";
	}
	public String getDlNo() {
		return dlNo;
	}
	public void setDlNo(String dlNo) {
		this.dlNo = dlNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getIssCity() {
		return IssCity;
	}
	public void setIssCity(String issCity) {
		IssCity = issCity;
	}
	
	
}