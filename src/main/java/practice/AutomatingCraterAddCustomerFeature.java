package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class AutomatingCraterAddCustomerFeature {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://stack-overflow.cfse9bqqndon.us-east-1.rds.amazonaws.com:3306/crater";
		String root = "root";
		String pass = "adminpassword";
		
		Connection con = DriverManager.getConnection(url,root,pass);
		
		Statement statement = con.createStatement();
		
		String getUserInfo = "SELECT * FROM crater.customers";
		
		ResultSet rs = statement.executeQuery(getUserInfo);
		String email = null;
		while(rs.next()) {
		email =	rs.getString("name");
		}
		
		System.out.println(email);
		
		System.out.println("script executed");
		
		
		con.close();		
	}

}
