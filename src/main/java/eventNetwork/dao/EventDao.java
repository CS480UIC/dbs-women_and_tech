/**
 * 
 */
/**
 * @author diyinhu
 *
 */
package eventNetwork.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import eventNetwork.domain.event_network;



/**
 * DDL functions performed in database
 */
public class EventDao {

private String MySQL_user = "women_and_tech"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "Uic1234567!"; //TODO change password

	public event_network findByEventAndMember(Integer event_ID, Integer member_ID) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		event_network network_Event = new event_network();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech", MySQL_user, MySQL_password);
		    String sql = "select * from network_event where event_id = ? and member_id = ?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,event_ID);
		    preparestatement.setInt(2,member_ID);
		    ResultSet resultSet = preparestatement.executeQuery();

		    while(resultSet.next()){
		    	Integer event_Id = resultSet.getInt("event_id");
		    	Integer member_Id = resultSet.getInt("member_id");
		    	
		    	if(event_ID.equals(event_Id) && member_ID.equals(member_Id)){
		    		
		    		System.out.println("Network Event ID: " + resultSet.getInt("event_id"));
		    		System.out.println("Network Event Member ID: " + resultSet.getInt("member_id"));
		    		System.out.println("Network Event Title: " + resultSet.getString("event_title"));
		    		System.out.println("Network Event Address: " + resultSet.getString("event_address"));
		    		System.out.println("Network Event Date: " + resultSet.getDate("event_date"));
		    		
		    		network_Event.setEventID(resultSet.getInt("event_id"));
		    		network_Event.setMemberID(resultSet.getInt("member_id"));
		    		network_Event.setEventTitle(resultSet.getString("event_title"));	
		    		network_Event.setEventAddress(resultSet.getString("event_address"));
		    		network_Event.setEventDate(resultSet.getDate("event_date"));	
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return network_Event;
	}	
	
	/**
	 * insert Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	
	
	public void add(event_network form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech", MySQL_user, MySQL_password);
			
			String sql = "insert into network_event values(?,?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			
			System.out.println("Network Event ID: " + form.getEventID());
			System.out.println("Network Event Member ID: " + form.getMemberID());
			System.out.println("Network Event Title: " + form.getEventTitle());
			System.out.println("Network Event Address: " + form.getEventAddress());
			System.out.println("Network Event Date: " + form.getEventDate());
		
			
		    preparestatement.setInt(1,form.getEventID());
		    
		    preparestatement.setInt(2,form.getMemberID());
		    preparestatement.setString(3,form.getEventTitle());
		    preparestatement.setString(4,form.getEventAddress());
		    preparestatement.setDate(5,form.getEventDate());
		    
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
	public void update(event_network form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech", MySQL_user, MySQL_password);
			
			String sql = "UPDATE network_event SET event_title = ?, event_address = ?, event_date = ? where event_id = ? and member_id = ?;";
	
			
			
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    
		    preparestatement.setString(1,form.getEventTitle());
		    preparestatement.setString(2,form.getEventAddress());
		    preparestatement.setDate(3,form.getEventDate());
		    preparestatement.setInt(4,form.getEventID());
			preparestatement.setInt(5,form.getMemberID());
		    
		    
		    System.out.println("Network Event ID: " + form.getEventID());
			System.out.println("Network Event Member ID: " + form.getMemberID());
			System.out.println("Network Event Title: " + form.getEventTitle());
			System.out.println("Network Event Address: " + form.getEventAddress());
			System.out.println("Network Event Date: " + form.getEventDate());
		    
	
//			
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
	public void delete(Integer event_ID, Integer member_ID) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech", MySQL_user, MySQL_password);
			
			String sql = "delete from network_event where event_id = ? and member_id = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1, Integer.valueOf(event_ID));
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
			String sql = "select * from network_event";
			
		
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
				event_network network_Event = new event_network();

	    		
	    		network_Event.setEventID(resultSet.getInt("event_id"));
	    		network_Event.setMemberID(resultSet.getInt("member_id"));
	    		network_Event.setEventTitle(resultSet.getString("event_title"));	
	    		network_Event.setEventAddress(resultSet.getString("event_address"));
	    		network_Event.setEventDate(resultSet.getDate("event_date"));	
	    		
	    		list.add(network_Event);
			 }
			
			System.out.println("Number of Network Event: " + list.size());
			
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
	
	public List<Object> findMemberPerEvent() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech", MySQL_user, MySQL_password);
			
			
			String sql = "select event_id, count(member_id) as num_member from network_event group by event_id";
					
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
				event_network network_Event = new event_network();

	    		
	    		network_Event.setEventID(resultSet.getInt("event_id"));
	    		network_Event.setMemberID(resultSet.getInt("num_member"));
	
	    		
	    		list.add(network_Event);
			 }
			
			System.out.println("Number of Member in Network Event: " + list.size());
			
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
}