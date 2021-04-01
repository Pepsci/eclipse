package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClientDao implements IDAO<Client>{

	Connection connect = getConnect.getConnection();
	
	@Override
	public void create(Client object) {
		
		try {
			
			PreparedStatement req = connect.prepareStatement("INSERT INTO client"
					+ "(nom, prenom) VALUES (?,?) ");
			
			req.setString(1, object.getNom());
			req.setString(2, object.getPrenom());
			
			req.executeUpdate();
			
			System.out.println("Insertion OK");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Insertion KO - KO - KO");
			
		}
		
	}

	@Override
	public void read(Client object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Client object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Client object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findById(Client object) {
		// TODO Auto-generated method stub
		
	}

}
