package com.sbi;

public class InstrumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guitar g = new Guitar();
		g.play();
		g.tuneStrings();
		g.pluck();
	}

}
abstract class MusicalInstrument
{
	abstract void play();
}

abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}

class Guitar extends StringBasedMusicalInstrument {
	
	void play() {
	System.out.println("Playing");
	}
	void tuneStrings()
	{
		System.out.println("tuning strings");
	}
	void pluck()
	{
		System.out.println("Plicking-----------");
	}
}