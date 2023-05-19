import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class frmInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		depFrame1 mfr = new depFrame1 ("Login", 100,200,500,700);
		mfr.setVisible(true);
	}

}
class depFrame1 extends JFrame implements ActionListener
{
	JButton save = new JButton ("Save");
	JButton exit = new JButton ("Exit");
	JTextField dId = new JTextField();
	
	JTextField dName = new JTextField();
	JTextField dLoc = new JTextField();
	JLabel dIdL = new JLabel("Department Id");
	JLabel dNameL = new JLabel("Department Name");
	JLabel dLocL = new JLabel("Department Location");
	depFrame1 (String title, int x, int y, int z, int j)
	{
		super (title);
		setLocation (x,y);
		setSize (z,j);
		setLayout (new FlowLayout());
		add(dIdL);
		add(dId);
		dId.setBounds(50, 100, 100, 300);
		add(dNameL);
		add(dName);
		dName.setBounds(50, 100, 100, 300);
		add(dLocL);
		add(dLoc);
		dLoc.setBounds(50, 100, 100, 300);
		
		add(save);
		add(exit);

		save.addActionListener(this);
		exit.addActionListener(this);
	}
	public void ActionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "Saving data...");
	}
	
}