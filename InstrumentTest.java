package com.sbi;

public class InstrumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guitar g = new Guitar();
		g.play();
		g.tuneStrings();
		g.pluck();
		
		System.out.println("-------------------------------");
		
		flute f = new flute();
		f.play();
		f.playMusic();
		f.playOwn();
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

abstract class AirBasedMusicalInstrument extends MusicalInstrument
{
	abstract void playMusic();
}

class flute extends AirBasedMusicalInstrument
{
	void play ()
	{
		System.out.println("Fluite is being played by Musical Instrument Abstract Class");
		
	}
	void playMusic ()
	{
		System.out.println("Fluite is being played by AirBasedMusicalInstrument abstract class");
	}
	void playOwn()
	{
		System.out.println("Fluite is being played by its own class");
	}
	}

