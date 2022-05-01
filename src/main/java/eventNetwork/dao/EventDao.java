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




//import java.util.ArrayList;
//import java.util.List;

import eventNetwork.domain.event_network;

/**
 * DDL functions performed in database
 */
public class EventDao {

	public event_network findByUsername(String event_ID) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		event_network event_network = new event_network();
		System.out.println("find name event_ID" + event_ID);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","womenTech", "Uic1234567!");
		    String sql = "select * from network_event where event_id=?;";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,event_ID);
		
		    ResultSet resultSet = preparestatement.executeQuery();
		    //ResultSet resultSet  = preparestatement.executeUpdate();
		    while(resultSet.next()){
		    	String eventID = resultSet.getString("event_ID");
		    	
		    	System.out.println("event dao in event id: " + resultSet.getString("member_id"));
		    	
		    	
		    	if(eventID.equals(event_ID)){
		    		
		    		
		    		event_network.setEventID(resultSet.getString("event_id"));
		    		event_network.setMemberID(resultSet.getString("member_id"));
		    		event_network.setEventTitle(resultSet.getString("event_title"));	
		    		event_network.setEventAddress(resultSet.getString("event_address"));
		    		event_network.setEventDate(resultSet.getString("event_date"));
		    		
		    			
		    	}
		    	
		    }
		    
		    String member_test = event_network.getMemberID();
		    System.out.println("event dao in member test: " + member_test);
		    
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return event_network;
	}	
	
	/**
	 * insert Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(event_network form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("We are here");
		
//		System.out.println("1 event id " + form.getEventID());
//	    System.out.println("2 MemberID " + form.getMemberID());
//	    System.out.println("3, getEventTitle " + form.getEventTitle());
//	    System.out.println("4, getEventAddress " + form.getEventAddress());
//	    System.out.println("5 getEventDate " + form.getEventDate());
	    
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","womenTech", "Uic1234567!");
			
			String sql = "insert into network_event values(?,?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,form.getEventID());
		    preparestatement.setString(2,form.getMemberID());
		    preparestatement.setString(3,form.getEventTitle());
		    preparestatement.setString(4,form.getEventAddress());
		    preparestatement.setString(5,form.getEventDate());
		    preparestatement.executeUpdate();
		    
		    
		    
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void update(event_network form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to update");
		System.out.println(form);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","womenTech", "Uic1234567!");
			
    		
			String sql = "UPDATE network_event SET event_id =? member_id = ?, event_title = ?, event_address = ? , event_date = ? where event_id = ?;";
			System.out.println("Update Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			preparestatement.setString(1,form.getEventID());
		    preparestatement.setString(2,form.getMemberID());
		    preparestatement.setString(3,form.getEventTitle());
		    preparestatement.setString(4,form.getEventAddress());
		    preparestatement.setString(5,form.getEventDate());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public static void delete(String event_ID) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Now going to delete");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech","womenTech", "Uic1234567!");
			
			String sql = "delete from network_event where event_id = ?;";
			System.out.println(event_ID);
			System.out.println("Delete Executed");
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,event_ID);
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}