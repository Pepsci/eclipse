package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements IDAO<User>{

	Connection connect = getConnect.getConnection();
	
	@Override
	public void create(User object) {
		
		try {
			
			PreparedStatement req = connect.prepareStatement("INSERT INTO user"
					+ "(email, pwd) VALUES (?,?) ");
			
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
	public List<User>read() {
		List<User> listUser = new ArrayList<>();
		
		try {
			
			PreparedStatement req = connect.prepareStatement("SELECT * FROM user");
			
			ResultSet rs = req.executeQuery();
			
			
			while (rs.next()) {
				User user = new User();
				
				user.setId(rs.getInt("id"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("pwd"));
				
				listUser.add(user);
			}
			System.out.println(listUser);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Insertion KO - KO - KO");
		}
		return listUser;
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
