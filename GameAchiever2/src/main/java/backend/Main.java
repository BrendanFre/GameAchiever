package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	String jdbcURL = "jdbc:h2:~/test";
		//	String username = "sa";
		//	String password = "";
			
			System.out.println("Developer: Brendan Freeman 2022 \u00a9 \nWelcome to the Game Achievement Tracker...");
			//try {
			//Connection connection = DriverManager.getConnection(jdbcURL, username, password);
			//	System.out.println("Connected to H2 embedded database.");
			//	
//	connection.close();
	//			
		//	} catch (SQLException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
			
			UserOptions(args);
	}
	
	public static void UserOptions(String[] args) {		
			System.out.println("Please chose an option \n1. Add Game\n2.Search Game\n3.Settings\n4.Exit");
			
			Scanner OptionScanner = new Scanner (System.in);
			int Option = OptionScanner.nextInt();
			
			if(Option == 1) {
				System.out.println("New Game");
				OptionScanner.close();
				AddGame.main(args);
			}
				else if(Option ==2) {
					System.out.println("Search Game");
					OptionScanner.close();
				}
				else if(Option ==3) {
					System.out.println("Settings");
					OptionScanner.close();
				}
				else if(Option ==4) {
					System.out.println("Exit");
					OptionScanner.close();
					System.exit(0);	
				}
				else {
					System.out.println("Try Again");
					UserOptions(args);
				}
			
			

	}
	

}
