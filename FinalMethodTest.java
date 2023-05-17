package com.sbi;

public class FinalMethodTest {
	public static void main(String[] args) {
		GraphicalChess chess = new GraphicalChess();
		Game.upload(chess);
		
	}
}
class Game
{
	static void upload(Chess x) {
		
		if(x instanceof GraphicalChess) {
			GraphicalChess gc  = (GraphicalChess) x;
			gc.moveMyKnight();
		}

	}
}
class Chess 
{
	
	final void moveKnight() { 
		System.out.println("Knight is moving in L shape...L calcs are done...");
	}
}

class GraphicalChess extends Chess 
{
	
	void moveMyKnight() { 
		System.out.println("Knight is moving in L shape + Diagonal shape...L + D calcs are done...");
	}
}
