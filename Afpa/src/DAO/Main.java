package DAO;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {

		Connection testConnection = getConnect.getConnection();

		ClientDao moussa = new ClientDao();
		
		moussa.create(new Client("Camara", "Moussa"));
		
		
	}

}
