import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JOptionPane;

public class frTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyFrame mfr = new MyFrame ("Login", 10,20,300,400);
			mfr.setVisible(true);
			
	}

}

class MyFrame extends JFrame implements ActionListener
{
	JButton apply = new JButton ("Apply for Bank Account");
	JButton login = new JButton ("Login");
	MyFrame (String title, int x, int y, int z, int j)
	{
		super (title);
		setLocation (x,y);
		setSize (z,j);
		setLayout (new FlowLayout());
		add(apply);
		add(login);
		apply.addActionListener(this);
		login.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "Hi");
	}
}