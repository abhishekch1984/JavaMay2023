package myException;

public class DogAgeExceededException extends RuntimeException 
{
	public DogAgeExceededException(String msg)
	{
		super(msg);
	}
}
