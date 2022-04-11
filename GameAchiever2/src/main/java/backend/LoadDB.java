package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoadDB {
	public static void main(String[] args) {
	String jdbcURL = "jdbc:h2:~/test";
	String username = "sa";
	String password = "";
		
		System.out.println("Developer: Brendan Freeman 2022 \u00a9 \nWelcome to the Game Achievement Tracker...");
		
		try {
		Connection connection = DriverManager.getConnection(jdbcURL, username, password);
			System.out.println("Connected to H2 embedded database.");
			
connection.close();
			
	} catch (SQLException e) {
	e.printStackTrace();
}
}
}