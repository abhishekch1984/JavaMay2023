import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JOptionPane;
import pojo.Department;

public class SelectTestPojo {
	public static void main(String[] args) {
		try {
			System.out.println("Trying to load the Driver ....");
					//vendor.    protocol.drivarName
				    //oracle.    jdbc.    OracleDriver
					//org.hsqldb.jdbc.    JDBCDriver
			
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			//DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			
			System.out.println("Driver loaded....");
			
			//System.out.println("Trying to connect to the DB");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			//Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
			System.out.println("Connected to the DB :"+conn);
			
			Statement st = conn.createStatement();
			System.out.println("Statement created....");
			
			ResultSet rs = st.executeQuery("SELECT * FROM DEPARTMENT");
			System.out.println("Query fired and got the result..");
			
			while(rs.next()) {
				//System.out.println("DEPTNO    : "+rs.getInt(1));
				//System.out.println("DEPT NAME : "+rs.getString(2));
				//System.out.println("DEPT LOC  : "+rs.getString(3));
				Department deptObj = new Department();
				deptObj.setDepartmentNumber(rs.getInt(1));
				deptObj.setDepartmentName(rs.getString(2));
				deptObj.setDepartmentLocation(rs.getString(3));
				System.out.println("DEPTNO    : "+deptObj.getDepartmentNumber());
				System.out.println("DEPT NAME : "+deptObj.getDepartmentName());
				System.out.println("DEPT LOC  : "+deptObj.getDepartmentLocation());
				System.out.println("-------------------------");
			}
			
			
			System.out.println("Trying to close the DB connection....");
			rs.close();
			st.close();
			conn.close();
			System.out.println("Disconnected from the DB");
			
			depFrame mfr = new depFrame ("Login", 10,20,300,400);
			mfr.setVisible(true);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

class depFrame extends JFrame implements ActionListener
{
	JButton apply = new JButton ("Apply for Bank Account");
	JButton login = new JButton ("Login");
	JTextField dId = new JTextField();
	JTextField dName = new JTextField();
	JTextField dLoc = new JTextField();
	JLabel dIdL = new JLabel("Department Id");
	JLabel dNameL = new JLabel("Department Name");
	JLabel dLocL = new JLabel("Department Location");
	depFrame (String title, int x, int y, int z, int j)
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
		
		add(apply);
		add(login);

		apply.addActionListener(this);
		login.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "Hi");
	}
}