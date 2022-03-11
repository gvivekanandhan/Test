package MavenDay1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {
	
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/lms_db","root","shree@16");
			// Create statement
			Statement stmt = conn.createStatement();
			
			int count = stmt.executeUpdate("Insert into lms_members "
					+ "(MEMBER_ID,MEMBER_NAME,CITY,DATE_REGISTER,DATE_EXPIRE,MEMBERSHIP_STATUS)"
					+ " values('LM007','Vivek','Bangalore','2022-10-03','2022-10-05','Permanent')");
			
			if(count == 1) {
				System.out.println("Record is inserted successfully !!" + count);
			}else {
				System.out.println("Record is not inserted successfully !!");
			}
		conn.close();	
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
