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
//import java.util.Date;
import java.util.List;

import eventNetwork.domain.EventNetwork;

/**
 * DDL functions performed in database
 */
public class EventDao {
	
	/**
	 * user name to connect to the database 
	 */
	private String MySQL_user = "womenTech"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "Uic1234567!"; //TODO change password

	public EventNetwork findByEventAndMemberID(Integer eventId, Integer memberId) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		EventNetwork ar = new EventNetwork();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech", MySQL_user, MySQL_password);
		    String sql = "SELECT * FROM network_event where event_id = ? and member_id = ?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,eventId);
		    preparestatement.setInt(2,memberId);
		    ResultSet resultSet = preparestatement.executeQuery();
			System.out.println("event dao find userID: "+ eventId);
			System.out.println("event dao find userID: "+ memberId);

			
		    while(resultSet.next()){
		    	System.out.println("event dao find event ID: "+ resultSet.getInt("event_id"));
				System.out.println("event dao find member ID: "+ resultSet.getInt("member_id"));
		    	int event_id = resultSet.getInt("event_id");
		    	int member_id = resultSet.getInt("member_id");
		    	if(event_id ==  eventId && member_id == memberId){
		    		ar.setEvent_id(event_id);
		    		ar.setMember_id(member_id);
		    		ar.setEvent_title(resultSet.getString("event_title"));
		    		ar.setEvent_address(resultSet.getString("event_address"));
		    		ar.setEvent_date(resultSet.getDate("event_date"));
		
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return ar;
	}	
	
	/**
	 * insert Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(EventNetwork form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech", MySQL_user, MySQL_password);
			

			String sql = "insert into network_event (event_id,member_id,event_title,event_address,event_date) values(?,?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getEvent_id());
		    preparestatement.setInt(2,form.getMember_id());
		    preparestatement.setString(3,form.getEvent_title());
		    preparestatement.setString(4,form.getEvent_address());
		    preparestatement.setDate(5,form.getEvent_date());
		
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
	public void update(EventNetwork form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech", MySQL_user, MySQL_password);

			String sql = "UPDATE network_event SET event_title = ?,event_address = ?,event_date = ? where event_id = ? and member_id = ?;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			preparestatement.setInt(1,form.getEvent_id());
		    preparestatement.setInt(2,form.getMember_id());
		    preparestatement.setString(3,form.getEvent_title());
		    preparestatement.setString(4,form.getEvent_address());
		    preparestatement.setDate(5, form.getEvent_date());
		   
	
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
	public void delete(String eventId, String memberId) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/women_in_tech", MySQL_user, MySQL_password);
			
			String sql = "delete from network_evente where event_id = ? and member_id = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			System.out.println("Dao eventId: "+Integer.parseInt(eventId));
			System.out.println("Dao memberId: "+Integer.parseInt(memberId));

			preparestatement.setInt(1,Integer.parseInt(eventId));
		    preparestatement.setInt(2,Integer.parseInt(memberId));
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
			String sql = "select * from network_evente";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
				EventNetwork ar = new EventNetwork();
				
	    		ar.setEvent_id(resultSet.getInt("event_id"));
	    		ar.setMember_id(resultSet.getInt("member_id"));
	    		ar.setEvent_title(resultSet.getString("event_title"));
	    		ar.setEvent_address(resultSet.getString("event_address"));
	    		ar.setEvent_date(resultSet.getDate("event_date"));
	    		
	    		list.add(ar);
			 }
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}

	
}