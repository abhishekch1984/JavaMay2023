
public class DivisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Started");
		try {
		MyCalculator myC= new MyCalculator();
		myC.divide(100, 20);
		myC.divide(100, 0);
		myC.divide(100, 35);
		System.out.println("Main Finished");
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

}
class MyCalculator
{
	void divide (int num, int deno)
	{
		try
		{
		System.out.println("\nDivide Started");
		System.out.println("\nTrying to divide " +num+ " by " + deno);
		int div = num / deno;
		System.out.println("\nDivision is " + div);
		System.out.println("\nDivision finished");
		}
		catch (ArithmeticException e) {
			System.out.println("\nException caught, this process is being terminaed and next processing being done");
			System.out.println("\nDivision finished");
		}
	}
}