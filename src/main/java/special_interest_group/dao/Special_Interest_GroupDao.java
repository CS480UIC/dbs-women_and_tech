package special_interest_group.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import special_interest_group.domain.Special_Interest_Group;

/**
 * DDL functions performed in database
 */
public class Special_Interest_GroupDao {

	public static Special_Interest_Group findByGroupID(Integer group_id_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Special_Interest_Group sig = new Special_Interest_Group();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","women_and_tech", "Uic1234567!");
		    String sql = "select * from special_interest_group where group_id=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,group_id_p);
		    ResultSet resultSet = preparestatement.executeQuery();
		    //ResultSet resultSet  = preparestatement.executeUpdate();
		    while(resultSet.next()){
		    	Integer group_id = resultSet.getInt("group_id");
		    	if(group_id == group_id_p){
		    		sig.setGroup_id(resultSet.getInt("group_id"));
		    		sig.setGroup_name(resultSet.getString("group_name"));
		    		sig.setMembers_id(resultSet.getInt("members_id"));
		    		sig.setMission_statement(resultSet.getString("mission_statement"));
		    		sig.setGroup_type(resultSet.getString("group_type"));
		    		sig.setWebpage_url(resultSet.getString("webpage_url"));
		    		sig.setDate_created(resultSet.getDate("date_created"));
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return sig;
	}	
	
	/**
	 * insert Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(Special_Interest_Group form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("We are here");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","women_and_tech", "Uic1234567!");
			
			String sql = "insert into special_interest_group values(?,?,?,?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getGroup_id());
		    preparestatement.setString(2,form.getGroup_name());
		    preparestatement.setInt(3,form.getMembers_id());
		    preparestatement.setString(4,form.getMission_statement());
		    preparestatement.setString(5,form.getGroup_type());
		    preparestatement.setString(6,form.getWebpage_url());
		    preparestatement.setDate(7,form.getDate_created());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void update(Special_Interest_Group form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to update");
		System.out.println(form);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","women_and_tech", "Uic1234567!");
			
			String sql = "UPDATE special_interest_group SET group_name = ?, members_id = ?, mission_statement = ?, group_type = ?, webpage_url = ?, date_created = ? where group_id = ?;";
			System.out.println("Update Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,form.getGroup_name());
		    preparestatement.setInt(2,form.getMembers_id());
		    preparestatement.setString(3,form.getMission_statement());
		    preparestatement.setString(4,form.getGroup_type());
		    preparestatement.setString(5,form.getWebpage_url());
		    preparestatement.setDate(6,form.getDate_created());
		    preparestatement.setInt(7,form.getGroup_id());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void delete(String username) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to delete");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","women_and_tech", "Uic1234567!");
			
			String sql = "delete from special_interest_group where group_id = ?";
			System.out.println(username);
			System.out.println("Delete Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,username);
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
