package Gui;
import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class wpisZBDdoPlikuEksport {

	

		static final String JDBC_Driver = "org.postgresql.jdbc.Driver"; // mysql or.mysql.Driver
		static final String URL = "jdbc:postgresql://localhost:5432/ZakonJedi"; // jdbc:mysql://localhost:/nazwabazydanych;

	//	public static void main(String[] args) {
		
		public void export (){

			try {
				Class.forName("org.postgresql.Driver");
				Connection connection = DriverManager.getConnection(URL, "postgres", "1234");

				Statement statement = connection.createStatement();
				ResultSet rs = statement.executeQuery("SELECT * FROM Jedi");

				String pws = "";
				
				while (rs.next()) {
//						System.out.printf("ID: %d,Gatunek: %s, Imie: %s, Wiek : %d \n", rs.getInt ("id_Zwierze"), rs.getString("gatunek"), rs.getString ("imie"), rs.getInt("wiek"));
					pws += rs.getInt("ID_Jedi") + ","+ rs.getString("Nazwa") +"," + rs.getString("kolormiecza")+","+
							+ rs.getInt("moc") + ", " + rs.getString("stronamocy") + ", "+ rs.getInt("id_zakonu")+"\n";
					
					
				}
				
				PrintWriter pw = new PrintWriter(new File("C:\\Users\\iwkar\\Documents\\JavaPracaDomowa\\JediZakonFull\\JediFromDB.txt"));
				pw.write(pws);

				pw.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}



