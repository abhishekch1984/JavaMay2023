import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Scanner;

import myExceptions.DepartmentAlreadyExistsException;
 //java.beans.Statement

public class UpdateTest {
	public static void main(String[] args) {
		try {
			System.out.println("Trying to load the Driver ....");
					//vendor.    protocol.drivarName
				    //oracle.    jdbc.    OracleDriver
					//org.hsqldb.jdbc.    JDBCDriver
			
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			//DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			
			System.out.println("Driver loaded....");
			
			System.out.println("Trying to connect to the DB");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			//Connection conn = 
			//		DriverManager.getConnection("jdbc:oracle:thin:"
			//				+ "@localhost:1521:XE","scott","tiger");
			System.out.println("Connected to the DB :"+conn);
			
			conn.setAutoCommit(false); //TRANSACTION can be started
			
			PreparedStatement pst = conn.prepareStatement("UPDATE DEPARTMENT set DNAME=?,DLOC=? WHERE DEPTNO=?");
			
			Scanner scanner1 = new Scanner(System.in);
			Scanner scanner2 = new Scanner(System.in);
			Scanner scanner3 = new Scanner(System.in);
			
			System.out.println("Enter EXISTING deptno : ");
			int existingDeptno  = scanner1.nextInt();
			
			System.out.println("Enter new dept name : ");
			String newDeptName  = scanner2.nextLine();
			
			System.out.println("Enter new dept location : ");
			String newDeptLoc  = scanner3.nextLine();
			
			
			pst.setString(1, newDeptName); //set
			pst.setString(2, newDeptLoc); //set
			pst.setInt(3, existingDeptno ); // WHERE clause ? 
			
			System.out.println("PreparedStatement created....");

			System.out.println("Wish to modify (yes/no) : ");
			Scanner scan = new Scanner(System.in);
			String answer = scan.nextLine();
			if(answer.equalsIgnoreCase("yes")) {
				
				int rows = pst.executeUpdate();
				conn.commit();
				System.out.println(rows + " rows updated...");
			}
			else {
				System.out.println("rows discarded...");
			}
			
			
			System.out.println("Trying to close the DB connection....");
			pst.close();
			conn.close();
			System.out.println("Disconnected from the DB");

		} 
		catch(SQLIntegrityConstraintViolationException e) {
			throw new DepartmentAlreadyExistsException("This department already exist!!!");
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}