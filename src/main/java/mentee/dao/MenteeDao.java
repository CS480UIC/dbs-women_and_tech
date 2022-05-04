package mentee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import mentee.domain.Mentee;

/**
 * DDL functions performed in database
 */
public class MenteeDao {

	public static Mentee findBymember_id(Integer member_id_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Mentee mentee = new Mentee();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","women_and_tech", "Uic1234567!");
		    String sql = "select * from mentee where member_id=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,member_id_p);
		    ResultSet resultSet = preparestatement.executeQuery();
		    //ResultSet resultSet  = preparestatement.executeUpdate();
		    while(resultSet.next()){
		    	Integer member_id = Integer.parseInt(resultSet.getString("member_id"));
		    	if(member_id.equals(member_id_p)){
		    		mentee.setMember_id(resultSet.getInt("member_id"));
		    		mentee.setField_of_interest(resultSet.getString("field_of_interest"));
		    		mentee.setMajor(resultSet.getString("major"));
		    		mentee.setSchool_name(resultSet.getString("school_name"));
		    		
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return mentee;
	}	
	
	/**
	 * insert mentee
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(Mentee form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","women_and_tech", "Uic1234567!");
			
			String sql = "insert into mentee values(?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			
			System.out.println(form.getMember_id());
			System.out.println(form.getField_of_interest());
			System.out.println(form.getMajor());
			System.out.println(form.getSchool_name());
				
		    preparestatement.setInt(1,form.getMember_id());
		    preparestatement.setString(2,form.getField_of_interest());
		    preparestatement.setString(3,form.getMajor());
		    preparestatement.setString(4,form.getSchool_name());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void update(Mentee form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {


		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","women_and_tech", "Uic1234567!");
			
			String sql = "UPDATE mentee SET field_of_interest = ?, major = ?, school_name = ? where member_id = ?;";
			System.out.println("Update Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			
		    preparestatement.setString(1,form.getField_of_interest());
		    preparestatement.setString(2,form.getMajor());
		    preparestatement.setString(3,form.getSchool_name());
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
			
			String sql = "delete from mentee where member_id = ?";

			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1, Integer.valueOf(member_id));
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
