package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDao implements IDAO<User>{

	Connection connect = getConnect.getConnection();
	
	@Override
	public void create(User object) {
		
		try {
			
			PreparedStatement req = connect.prepareStatement("INSERT INTO user"
					+ "(email, pwd) VALUES (?,MD5(?)) ");
			
			req.setString(1, object.getEmail());
			req.setString(2, object.getPassword());
			
			req.executeUpdate();
			
			System.out.println("Insertion OK");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Insertion KO - KO - KO");
		}
	}

	@Override
	public void read(User object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findById(User object) {
		// TODO Auto-generated method stub
		
	}

}
