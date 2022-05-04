package mentor.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import mentor.domain.Mentor;

/**
 * DDL functions performed in database
 */
public class MentorDao {

	public static Mentor findByMember_id(Integer member_id_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Mentor mentor = new Mentor();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","women_and_tech", "Uic1234567!");
		    String sql = "select * from mentor where member_id=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,member_id_p);
		    ResultSet resultSet = preparestatement.executeQuery();
		    //ResultSet resultSet  = preparestatement.executeUpdate();
		    while(resultSet.next()){
		    	Integer member_id = Integer.parseInt(resultSet.getString("member_id"));
		    	if(member_id.equals(member_id_p)){
		    		mentor.setMember_id(Integer.parseInt(resultSet.getString("member_id")));
		    		mentor.setYears_in_industry(Integer.parseInt(resultSet.getString("years_in_industry")));
		    		mentor.setRole_in_industry(resultSet.getString("role_in_industry"));
		    		mentor.setYears_of_mentoring(Integer.parseInt(resultSet.getString("years_of_mentoring")));
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return mentor;
	}	
	
	/**
	 * insert Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(Mentor form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("We are here");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","women_and_tech", "Uic1234567!");
			
			String sql = "insert into mentor values(?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getMember_id());
		    preparestatement.setInt(2,form.getYears_in_industry());
		    preparestatement.setString(3,form.getRole_in_industry());
		    preparestatement.setInt(4,form.getYears_of_mentoring());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void update(Mentor form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {


		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","women_and_tech", "Uic1234567!");
			
			String sql = "UPDATE mentor SET years_in_industry = ?, role_in_industry = ?, years_of_mentoring = ? where member_id = ?;";
			System.out.println("Update Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			
		    preparestatement.setInt(1,form.getYears_in_industry());
		    preparestatement.setString(2,form.getRole_in_industry());
		    preparestatement.setInt(3,form.getYears_of_mentoring());
		    preparestatement.setInt(4,form.getMember_id());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
//	
	
	public void delete(Integer member_id) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to delete");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","women_and_tech", "Uic1234567!");
			
			String sql = "delete from mentor where member_id = ?";
			
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,Integer.valueOf(member_id));
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
