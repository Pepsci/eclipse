package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class getConnect {
		
	public static Connection getConnection() {
		Connection connect = null;
		
		String url ="jdbc:mysql://localhost/";
		String database = "cda314";
		String user ="root";
		String password ="";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(url+database,user,password);
			//System.out.println("OK pour la connection");
			
			/*PreparedStatement sql = connect.prepareStatement("select * from centre");
			
			ResultSet rs = sql.executeQuery();
			
			System.out.print("Nom\t Lieu\t Activités \n");
			while(rs.next()) {
				System.out.println(rs.getString("nom_centre")+ "\t " 
						+rs.getString("lieu")+ "\t"+rs.getString("specialite"));
			}*/
			
		}catch(Exception e) {
			System.out.println("Connection KO");
			e.printStackTrace();
		}
		return connect;
	}
}

