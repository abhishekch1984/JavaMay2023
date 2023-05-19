import javax.swing.JFrame;
import javax.swing.JTextField;

public class MultiThreadTest {
	public static void main(String[] args) {
		Train Train1 = new Train("Car1",100,200,200,150); 
		Train Train2 = new Train("Car2",400,200,200,150); 
		Train Train3 = new Train("Car3",800,200,200,150); 
		
		Thread t1 = new Thread(Train1); 
		Thread t2 = new Thread(Train2); 
		Thread t3 = new Thread(Train3); 
		
		t1.start(); 
		t2.start(); 
		t3.start();
		
	}
}

class Vehicle
{
	
}
class Train extends JFrame implements Runnable { //1
	JTextField t = new JTextField();
	
	Train(String title, int x, int y, int c1,int c2) {
		setTitle(title);
		setLocation(x,y);
		setSize(c1,c2);
		add(t);
		setVisible(true);
	}
	public void run() { //2
		for(int i=1;i<=1200000;i++ ) {
			t.setText("Train is running...."+i);
		}
	}
}
