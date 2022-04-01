package user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import user.domain.User;



/**
 * DDL functions performed in database
 */
public class UserDao {
	
	/**
	 * get the Search result with Username 
	 */
	public User findByUsername(String email) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		User user = new User();
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","womenTech", "Uic1234567!");
		    String sql = "select * from member_user where email=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,email);
		    ResultSet resultSet = preparestatement.executeQuery();
		    //ResultSet resultSet  = preparestatement.executeUpdate();
		    while(resultSet.next()){
	
		    	String member_email = resultSet.getString("email");
		    	
		    	if(member_email.equals(email)){

		    		user.setMember_id(resultSet.getString("member_id"));
		    		user.setMember_password(resultSet.getString("member_password"));
		    		user.setBio(resultSet.getString("bio"));
		    		user.setBirthday(resultSet.getString("birthday"));
		    		user.setEducation_level(resultSet.getString("education_level"));
		    		user.setEmail(resultSet.getString("email"));
		    		user.setFirst_name(resultSet.getString("first_name"));
		    		user.setLast_name(resultSet.getString("last_name"));
		   	    		
		    	}
		    }
		
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return user;
	}
	

	
	
	/**
	 * insert User
	 */
	public void add(User user) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","womenTech", "Uic1234567!");
			
//			String sql2 = "INSERT INTO member_user (email,member_password, first_name, last_name, birthday)\n"
//					+ "VALUES ('Lars','Monsen', 's','w','2022-12-10');"
			String sql = "insert into member_user ( first_name, last_name,member_password,email, birthday, education_level, bio) values(?,?,?,?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			
		
			preparestatement.setString(1,user.getFirst_name());
			preparestatement.setString(2,user.getLast_name());
			preparestatement.setString(3,user.getMember_password());
			preparestatement.setString(4,user.getEmail());
			preparestatement.setString(5,user.getBirthday());
			preparestatement.setString(6,user.getEducation_level());
			preparestatement.setString(7,user.getBio());
			
		    preparestatement.executeUpdate();
		    
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public List<Object> findall() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","womenTech", "Uic1234567!");
			String sql = "select * from member_user";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
				User user = new User();

				
				user.setMember_id(resultSet.getString("member_id"));
	    		user.setMember_password(resultSet.getString("member_password"));
	    		user.setBio(resultSet.getString("bio"));
	    		user.setBirthday(resultSet.getString("birthday"));
	    		user.setEducation_level(resultSet.getString("education_level"));
	    		user.setEmail(resultSet.getString("email"));
	    		user.setFirst_name("first_name");
	    		user.setLast_name(resultSet.getString("last_name"));
	    		
	    		list.add(user);
			 }
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
		
}
