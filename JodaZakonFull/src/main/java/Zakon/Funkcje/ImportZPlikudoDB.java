package Gui;


import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ImportZPlikudoDB {
	

			static final String JDBC_Driver = "org.postgresql.jdbc.Driver"; // mysql or.mysql.Driver
			static final String URL = "jdbc:postgresql://localhost:5432/ZakonJedi"; // jdbc:mysql://localhost:/nazwabazydanych;
			
			public static void main(String[]args) {
				
				String mojedane = "";
				
				File nowyJedi = new File("C:\\Users\\iwkar\\Documents\\JavaPracaDomowa\\JediZakonFull\\JediToDB.txt");
				
				try {
					Scanner scanner = new Scanner (nowyJedi);
					while(scanner.hasNextLine()) {

						mojedane = scanner.nextLine();
						System.out.println(mojedane);
						Class.forName("org.postgresql.Driver");
						Connection connection = DriverManager.getConnection(URL, "postgres","1234" );
						
						Statement statement = connection.createStatement();
						int idx = statement.executeUpdate("INSERT INTO jedi ( ID_jedi,nazwa,kolomiecza,moc,stronamocy,id_zakonu) VALUES ("+mojedane+")");
						
					}
				}
				
				
//				 public void add() {
//				        String tableName = "JediKnight";
//				        String addQuery = "INSERT INTO " + tableName + "(FirstName,SwordColor,Power,ForceSite) VALUES";
//
//				        try {
//				            StartConnection().executeUpdate(
//				                    "INSERT INTO JediKnight(FirstName,SwordColor,Power,ForceSite) VALUES (\n" +
//				                            "'Anna', 'Oliwkowy', 666, 'GUnit');"
//				            );
//				            System.out.println("poszło");
//				        } catch (SQLException e) {
//				            System.out.println("nie poszło");
//				            e.printStackTrace();
//				            
				            
				            
				
				
				
				
				
				catch (Exception e) {
					e.printStackTrace();
				
			}
			}
	}

				
					




}
