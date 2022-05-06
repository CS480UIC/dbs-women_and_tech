package learning_resource.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import learning_resource.domain.Learning_Resource;

public class ResourceDao {
	
private String MySQL_user = "women_and_tech"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "Uic1234567!"; //TODO change password

	public Learning_Resource findByResourceAndMember(Integer resource_ID, Integer member_ID) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Learning_Resource Learning_Resource = new Learning_Resource();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech", MySQL_user, MySQL_password);
		    String sql = "select * from learning_resource where resource_id = ? and member_id = ?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,resource_ID);
		    preparestatement.setInt(2,member_ID);
		    ResultSet resultSet = preparestatement.executeQuery();

		    while(resultSet.next()){
		    	Integer event_Id = resultSet.getInt("resource_id");
		    	Integer member_Id = resultSet.getInt("member_id");
		    	
		    	if(resource_ID.equals(event_Id) && member_ID.equals(member_Id)){
		    		
		    		System.out.println("Learning Resource ID: " + resultSet.getInt("resource_id"));
		    		System.out.println("Learning Resource Member ID: " + resultSet.getInt("member_id"));
		    		System.out.println("Learning Resource Title: " + resultSet.getString("resource_title"));    		
		    		System.out.println("Learning Resource Type: " + resultSet.getString("resource_type"));
		    		System.out.println("Learning Resource  Author: " + resultSet.getString("author"));	    		
		    		System.out.println("Learning Resource Publisher: " + resultSet.getString("publisher"));    		
		    		System.out.println("Learning Resource PublishYear: " + resultSet.getInt("publish_year"));
		    		System.out.println("Learning Resource  Language: " + resultSet.getString("resource_language"));
		    		
		    		
		    		
		    		Learning_Resource.setResourceID(resultSet.getInt("resource_id"));
		    		Learning_Resource.setMemberID(resultSet.getInt("member_id"));
		    		Learning_Resource.setResourceTitle(resultSet.getString("resource_title"));	
		    		Learning_Resource.setResourceType(resultSet.getString("resource_type"));
		    		Learning_Resource.setAuthor(resultSet.getString("author"));		
		    		Learning_Resource.setPublisher(resultSet.getString("publisher"));
		    		Learning_Resource.setPublishYear(resultSet.getInt("publish_year"));
		    		Learning_Resource.setLanguage(resultSet.getString("resource_language"));	
		    		
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return Learning_Resource;
	}	
	
	/**
	 * insert Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	
	
	public void add(Learning_Resource form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech", MySQL_user, MySQL_password);
			
			String sql = "insert into learning_resource values(?,?,?,?,?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			
			System.out.println("Learning Resource ID: " + form.getResourceID());
    		System.out.println("Learning Resource Member ID: " + form.getMemberID());
    		System.out.println("Learning Resource Title: " + form.getResourceTitle());    		
    		System.out.println("Learning Resource Type: " + form.getResourceType());
    		System.out.println("Learning Resource  Author: " + form.getAuthor());	    		
    		System.out.println("Learning Resource Publisher: " + form.getPublisher());    		
    		System.out.println("Learning Resource PublishYear: " + form.getPublishYear());
    		System.out.println("Learning Resource  Language: " + form.getLanguage());
    		
    
		    preparestatement.setInt(1,form.getResourceID());
		    preparestatement.setInt(2,form.getMemberID());
		    preparestatement.setString(3,form.getResourceTitle());
		    preparestatement.setString(4,form.getResourceType());
		    preparestatement.setString(5,form.getAuthor());
		    preparestatement.setString(6,form.getPublisher());
		    preparestatement.setInt(7,form.getPublishYear());
		    preparestatement.setString(8,form.getLanguage());
		    
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * @param form
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public void update(Learning_Resource form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech", MySQL_user, MySQL_password);
			
			String sql = "UPDATE learning_resource SET resource_title = ?, resource_type = ?, author = ?, publisher = ?, publish_year = ?, resource_language = ? where resource_id = ? and member_id = ?;";
	
					
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    
			
		    preparestatement.setString(1,form.getResourceTitle());
		    preparestatement.setString(2,form.getResourceType());
		    preparestatement.setString(3,form.getAuthor());
		    preparestatement.setString(4,form.getPublisher());
		    preparestatement.setInt(5,form.getPublishYear());
		    preparestatement.setString(6,form.getLanguage());
		    preparestatement.setInt(7,form.getResourceID());
		    preparestatement.setInt(8,form.getMemberID());
		    
		    
		    System.out.println("Learning Resource ID: " + form.getResourceID());
    		System.out.println("Learning Resource Member ID: " + form.getMemberID());
    		System.out.println("Learning Resource Title: " + form.getResourceTitle());    		
    		System.out.println("Learning Resource Type: " + form.getResourceType());
    		System.out.println("Learning Resource  Author: " + form.getAuthor());	    		
    		System.out.println("Learning Resource Publisher: " + form.getPublisher());    		
    		System.out.println("Learning Resource PublishYear: " + form.getPublishYear());
    		System.out.println("Learning Resource  Language: " + form.getLanguage());
	

		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * @param username
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public void delete(Integer resource_ID, Integer member_ID) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech", MySQL_user, MySQL_password);
			
			String sql = "delete from learning_resource where resource_id = ? and member_id = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1, Integer.valueOf(resource_ID));
		    preparestatement.setInt(2,Integer.valueOf(member_ID));
		    
		    
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
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech", MySQL_user, MySQL_password);
			String sql = "select resource_id, first_name, last_name, resource_title , resource_type, education_level from  learning_resource a left join member_user b on a.member_id = b.member_id";
			
			
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
				Learning_Resource Learning_Resource = new Learning_Resource();

	    
	    		Learning_Resource.setResourceID(resultSet.getInt("resource_id"));
	    		Learning_Resource.setResourceTitle(resultSet.getString("first_name"));	
	    		Learning_Resource.setResourceType(resultSet.getString("last_name"));
	    		Learning_Resource.setAuthor(resultSet.getString("resource_title"));		
	    		Learning_Resource.setPublisher(resultSet.getString("resource_type"));
	    		Learning_Resource.setLanguage(resultSet.getString("education_level"));
	    		
	    		
	    		list.add(Learning_Resource);
			 }
			
			System.out.println("Number of Learning Resource: " + list.size());
			
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
	
	
	public List<Object> findBook() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech", MySQL_user, MySQL_password);
			String sql = "select * from learning_resource where resource_type = 'Book' order by member_id";

			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			
//			preparestatement.setString(1,"Book");
			
			while(resultSet.next()){
				Learning_Resource Learning_Resource = new Learning_Resource();

	    
	    		Learning_Resource.setResourceID(resultSet.getInt("resource_id"));
	    		Learning_Resource.setMemberID(resultSet.getInt("member_id"));
	    		Learning_Resource.setResourceTitle(resultSet.getString("resource_title"));	
	    		Learning_Resource.setResourceType(resultSet.getString("resource_type"));
	    		Learning_Resource.setAuthor(resultSet.getString("author"));		
	    		Learning_Resource.setPublisher(resultSet.getString("publisher"));
	    		Learning_Resource.setPublishYear(resultSet.getInt("publish_year"));
	    		Learning_Resource.setLanguage(resultSet.getString("resource_language"));
	    		
	    		list.add(Learning_Resource);
			 }
			
			System.out.println("Learning Resource is book: " + list.size());
			
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}

}
