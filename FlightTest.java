package com.sbi;

public class FlightTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flight f1=new Flight(123,"Air India", "Mumbai", "Delhi", "Domestic", "International");
		System.out.println(f1);
	}

}
class Flight {
	private int flightNumber;
	private String CareerName;
	private String Source;
	private String Destination;
	private String Type;
	private String AirportType;
	
	public Flight(int flightNumber, String careerName, String source, String destination, String type,
			String airportType) {
		super();
		this.flightNumber = flightNumber;
		CareerName = careerName;
		Source = source;
		Destination = destination;
		Type = type;
		AirportType = airportType;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", CareerName=" + CareerName + ", Source=" + Source
				+ ", Destination=" + Destination + ", Type=" + Type + ", AirportType=" + AirportType + "]";
	}
	
}