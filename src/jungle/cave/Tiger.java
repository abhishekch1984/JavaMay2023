package jungle.cave;

public class Tiger {

					int defaultA=100;
		private 	int privateB=200;
		protected 	int protectedC=300;
		public 		int publicD=400;
		
	public void jump() {
		System.out.println("Tiger is jumping........");
		System.out.println("B              :" + privateB);
		whiteTiger wt = new whiteTiger();
		wt.fun();
	}
	
}
class whiteTiger extends Tiger 
{
	public void fun() {
		System.out.println("A              :" + defaultA);
		//System.out.println("B              :" + privateB);
		System.out.println("C              :" + protectedC);
		System.out.println("D              :" + publicD);
	}
}