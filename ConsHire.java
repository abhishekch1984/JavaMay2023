package com.sbi;

public class ConsHire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus b = new Bus("Mumbai", "Pune", "18.05.2023");
		
		ShtabdiTravels s = new ShtabdiTravels();
		s.Route("Jaipur", "Lucknow");
		s.booking("Mumbai", "Pune", "17.05.2023");
	}

}

class Bus {
	private String fromLoc;
	private String toLoc;
	private String jDate;
	
	/**
	 * @param fromLoc
	 * @param toLoc
	 * @param jDate
	 */
	public Bus(String fromLoc, String toLoc, String jDate) {
		super();
		this.fromLoc = fromLoc;
		this.toLoc = toLoc;
		this.jDate = jDate;
		System.out.println(fromLoc + toLoc + jDate);
	}

	@Override
	public String toString() {
		return "Bus [fromLoc=" + fromLoc + ", toLoc=" + toLoc + ", jDate=" + jDate + ", toString()=" + super.toString()
				+ "]";
	}

	
	
}
class Redbus extends Bus {
	Redbus() {
		System.out.println("Hi, You have selected Red Bus this is RedBus, Please select the Operator: -");
	}
}
class ShtabdiTravels extends Redbus{
	ShtabdiTravels() {
		System.out.println("Hi you have selected Shtabadi Travels");
	}
	void Route(String fLoc, String tLoc) {
		System.out.println("This is Shtabdi Travels from ");
		System.out.println("------------------------");
		System.out.println("The departure timing is 09.00 PM");
		System.out.println("Only a few seats left, please book fast.");
		//fromLoc = fLoc;
		//toLoc = tLoc;
	}
	void booking (String fLoc, String tLoc, String dd) {
		
		System.out.println("------------------------");
		System.out.println("Hi Your seat is booked for Travel on "+ dd+ " from "+fromLoc+ " to " + toLoc);
	}
}