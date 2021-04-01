package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


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

	public List<Client> read(Client object) {
		List<Client> listClient = new ArrayList<>();
		
		try {
			
			PreparedStatement req = connect.prepareStatement("SELECT * FROM client");
			
			ResultSet rs = req.executeQuery();
			
			while (rs.next()) {
				Client client = new Client();
				
				client.setId(rs.getInt("id"));
				client.setNom(rs.getString("Nom"));
				client.setPrenom(rs.getString("Prenom"));
				
				listClient.add(client);
			}
			System.out.println(listClient);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Insertion KO - KO - KO");
		}
		return listClient;
	}

	@Override
	public void update(Client object) {
		
        try {

            PreparedStatement req = connect.prepareStatement("UPDATE client SET nom=?,"
                    + " prenom=? WHERE id=?");

            req.setString(1, object.getNom());
            req.setString(2, object.getPrenom());
            req.setInt(3, object.getId());

            req.executeUpdate();

            System.out.println("Updated !");

        }catch(Exception e) {
            e.printStackTrace();
            System.out.println("Insertion KO - KO - KO");
        }

    }
			
	@Override
	public void delete(Client object) {
		
        try {

            PreparedStatement req = connect.prepareStatement("DELETE FROM client WHERE id=?");

            req.setInt(1, object.getId());

            req.executeUpdate();

            System.out.println("Delete !");

        }catch(Exception e) {
            e.printStackTrace();
            System.out.println("delete KO - KO - KO");
        }		
	}

	@Override
	public void findById(Client object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Client>read() {
		List<Client> listUser = new ArrayList<>();
		
		try {
			
			PreparedStatement req = connect.prepareStatement("SELECT * FROM client");
			
			ResultSet rs = req.executeQuery();
			
			
			while (rs.next()) {
				Client cli = new Client();
				
				cli.setId(rs.getInt("id"));
				cli.setNom(rs.getString("nom"));
				cli.setPrenom(rs.getString("prenom"));
				
				listUser.add(cli);
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Insertion KO - KO - KO");
		}
		return listUser;
	}

}
