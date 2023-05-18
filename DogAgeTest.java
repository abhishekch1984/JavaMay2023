import myException.DogAgeExceededException;
import myException.DogAgeNegativeException;
import java.util.Scanner;
public class DogAgeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try
		//{
		//	Dog d1=new Dog(5, "Tommy");
		//	System.out.println(d1);
		//	Dog d2=new Dog(6, "Tommy");
		//	System.out.println(d2);
		//	Dog d3=new Dog(15, "Tommy");
		//	System.out.println(d3);
		//}
		//catch(RuntimeException e) {
		//	System.out.println(e);
		//}
				
		System.out.println("Main begins");
		Scanner scan = new Scanner(System.in);
		do {
			try {
				System.out.println("Enter age : ");
				int age = scan.nextInt();
				Dog d1 = new Dog("Tommy",age);
				System.out.println("d1 "+d1);
				if(d1 !=null) {
					break;
				}
			}
			/*catch(RuntimeException e) {
			  System.out.println("Problem : "+e.getMessage());
			}*/
			catch(DogAgeExceededException e) {
				System.out.println("Problem 1: "+e.getMessage());
			}
			catch(DogAgeNegativeException e) {
				System.out.println("Problem 2: "+e.getMessage());
			}
			catch (RuntimeException e) {
				System.out.println("Enter Proper Values "+e.getMessage());
				break;
			}
			finally {
				System.out.println("finally : run regardless.......");
			}
			
		} while(true);	
			
		scan.close();
		System.out.println("Main Ends");
	}
}
class Dog
{
	int age;
	String Name;
	public Dog(String name, int age) {
		super();
		if (age>14) {
			throw new DogAgeExceededException("Dogs age cannot exceed 14 years");
		}
		else if (age <0)
		{
			throw new DogAgeNegativeException("Dogs age cannot be ZERO or negative");
		}
		else
		{
			this.age = age;
			Name = name;
		}
		
	}
	@Override
	public String toString() {
		return "Dog [age=" + age + ", Name=" + Name + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
			}
	
}
