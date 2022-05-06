package scholarship.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mentee.domain.Mentee;

//import java.util.ArrayList;
//import java.util.List;

import scholarship.domain.Scholarship;

/**
 * DDL functions performed in database
 */
public class ScholarshipDao {

	public static Scholarship findByScholarshipID(Integer scholarship_id_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Scholarship scholarship = new Scholarship();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","women_and_tech", "Uic1234567!");
		    String sql = "select * from scholarship where scholarship_id = ?;";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,scholarship_id_p);
		    ResultSet resultSet = preparestatement.executeQuery();
		    //ResultSet resultSet  = preparestatement.executeUpdate();
		    while(resultSet.next()){
		    	Integer scholarship_id = resultSet.getInt("scholarship_id");
		    	if(scholarship_id == scholarship_id_p){
		    		scholarship.setScholarship_id(resultSet.getInt("scholarship_id"));
		    		scholarship.setScholarship_name(resultSet.getString("scholarship_name"));
		    		scholarship.setScholarship_description(resultSet.getString("scholarship_description"));
		    		scholarship.setScholarship_amount(resultSet.getInt("scholarship_amount"));
		    		scholarship.setApplication_deadline(resultSet.getDate("application_deadline"));
		    		scholarship.setApplication_released(resultSet.getDate("application_released"));
		    		scholarship.setRequirements(resultSet.getString("requirements"));
		    	}
		    		
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return scholarship;
	}	
	
	/**
	 * insert Scholarship
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(Scholarship form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("We are here");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","women_and_tech", "Uic1234567!");
			
			String sql = "insert into scholarship values(?,?,?,?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getScholarship_id());
		    preparestatement.setString(2,form.getScholarship_name());
		    preparestatement.setInt(3,form.getScholarship_amount());
		    preparestatement.setString(4,form.getScholarship_description());
		    preparestatement.setDate(5,form.getApplication_deadline());
		    preparestatement.setDate(6,form.getApplication_released());
		    preparestatement.setString(7,form.getRequirements());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void update(Scholarship form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to update");
		System.out.println(form);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","women_and_tech", "Uic1234567!");
			
			String sql = "UPDATE scholarship SET scholarship_name = ?, scholarship_amount = ?, scholarship_description = ?, application_deadline = ?, application_released = ?, requirements = ? where scholarship_id = ?;";
			System.out.println("Update Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,form.getScholarship_name());
		    preparestatement.setInt(2,form.getScholarship_amount());
		    preparestatement.setString(3,form.getScholarship_description());
		    preparestatement.setDate(4,form.getApplication_deadline());
		    preparestatement.setDate(5,form.getApplication_released());
		    preparestatement.setString(6,form.getRequirements());
		    preparestatement.setInt(7,form.getScholarship_id());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void delete(String scholarship_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to delete");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","women_and_tech", "Uic1234567!");
			
			String sql = "delete from scholarship where scholarship_id = ?";
			System.out.println(scholarship_p);
			System.out.println("Delete Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,Integer.parseInt(scholarship_p));
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Object> findScholarship() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","women_and_tech", "Uic1234567!");
			String sql = "select * from scholarship where scholarship_amount > 700 order by scholarship_amount;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
				Scholarship scholarship = new Scholarship();

				
				scholarship.setScholarship_id(resultSet.getInt("scholarship_id"));
	    		scholarship.setScholarship_name(resultSet.getString("scholarship_name"));
	    		scholarship.setScholarship_description(resultSet.getString("scholarship_description"));
	    		scholarship.setScholarship_amount(resultSet.getInt("scholarship_amount"));
	    		scholarship.setApplication_deadline(resultSet.getDate("application_deadline"));
	    		scholarship.setApplication_released(resultSet.getDate("application_released"));
	    		scholarship.setRequirements(resultSet.getString("requirements"));
	  
	    		
	    		list.add(scholarship);
			 }
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
	
	public List<Object> findScholarshipLike() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","women_and_tech", "Uic1234567!");
			String sql = "select * from scholarship where scholarship_description like '%bootcamp%';";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
				Scholarship scholarship = new Scholarship();

				
				scholarship.setScholarship_id(resultSet.getInt("scholarship_id"));
	    		scholarship.setScholarship_name(resultSet.getString("scholarship_name"));
	    		scholarship.setScholarship_description(resultSet.getString("scholarship_description"));
	    		scholarship.setScholarship_amount(resultSet.getInt("scholarship_amount"));
	    		scholarship.setApplication_deadline(resultSet.getDate("application_deadline"));
	    		scholarship.setApplication_released(resultSet.getDate("application_released"));
	    		scholarship.setRequirements(resultSet.getString("requirements"));
	  
	    		
	    		list.add(scholarship);
			 }
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
	
	public List<Object> findScholarshipRoundSqrt() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","women_and_tech", "Uic1234567!");
			String sql = "select ROUND(SQRT(scholarship_amount), 1) from scholarship;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
	    		
	    		list.add(resultSet.getFloat("ROUND(SQRT(scholarship_amount), 1)"));
			 }
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
	
	public List<Object> findScholarshipAvg() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","women_and_tech", "Uic1234567!");
			String sql = "select * from scholarship where scholarship_amount > ( select avg(scholarship_amount) from scholarship ) ;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
				Scholarship scholarship = new Scholarship();

				
				scholarship.setScholarship_id(resultSet.getInt("scholarship_id"));
	    		scholarship.setScholarship_name(resultSet.getString("scholarship_name"));
	    		scholarship.setScholarship_description(resultSet.getString("scholarship_description"));
	    		scholarship.setScholarship_amount(resultSet.getInt("scholarship_amount"));
	    		scholarship.setApplication_deadline(resultSet.getDate("application_deadline"));
	    		scholarship.setApplication_released(resultSet.getDate("application_released"));
	    		scholarship.setRequirements(resultSet.getString("requirements"));
	  
	    		
	    		list.add(scholarship);
			 }
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
}
