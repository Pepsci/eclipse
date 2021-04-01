package DAO;

import java.sql.Connection;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Connection testConnection = getConnect.getConnection();

		ClientDao moussa = new ClientDao();
		
		//moussa.create(new Client("Camara", "Moussa"));
		
		//Liste 
		UserDao usDAO = new UserDao();
		List<User> us = usDAO.read();
		
		for (User user : us) {
			System.out.println(user.getId()+ "  "+ user.getEmail()+ "  "+ user.getPassword());
		}
		
		
	}

}
