package com.Login.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import GM_login.bean.GM_contactus;
import GM_login.bean.GM_feedback;
import GM_login.bean.GM_memebership;
import javafx.scene.shape.Cylinder;

public class GM_signupdao {



	public Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");

		return connection;

	}


	public GM_memebership Check1(String emailid,String password) throws  ClassNotFoundException, SQLException
	{
		String sql="select * from membership  where email=? and password=?";

		Connection connection=getConnection();
		PreparedStatement statement= connection.prepareStatement(sql);

		GM_memebership memebership=null;
		ResultSet rs=null;

		statement.setString(1, emailid);
		statement.setString(2, password);

		rs=statement.executeQuery();


		if(rs!=null)
		{
			try {	
				rs.next();

				String email=rs.getString("email");
				String pass=rs.getString("password");

				memebership=new GM_memebership();


				memebership.setEmail(email);
				memebership.setPassword(pass);

				if(memebership.getEmail().equals(email) && memebership.getPassword().equals(pass))
				{
					connection.close();
				}


			} catch (SQLException e)
			{

				e.printStackTrace();
			}

		}
		return memebership;

	}
	public int upadtepassword(String uname,String pass)
	{
		int i=0;
		try
		{

			Connection connection=getConnection();
			PreparedStatement statement= connection.prepareStatement
					("update  membership set password=? where email=?");
			statement.setString(1,pass);
			statement.setString(2,uname);

			i=statement.executeUpdate();

			connection.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return i;
	}
	public  int insertintomembership(GM_memebership memebership)
	{
		int i=0;
		String sql="insert into membership values(?,?,?,?,?,?,?,?)";
		try
		{
			Connection connection=getConnection();
			PreparedStatement statement=connection.prepareStatement(sql);

			statement.setString(1, memebership.getFname());
			statement.setString(2, memebership.getLname());
			statement.setString(3, memebership.getAddress());
			statement.setString(4, memebership.getDob());
			statement.setString(5, memebership.getEmail());
			statement.setString(6, memebership.getConatct());
			statement.setString(7, memebership.getPassword());
			statement.setString(8, memebership.getDate());

			i=statement.executeUpdate();

			connection.close();	

		}catch (Exception e)
		{
			e.printStackTrace();
		}
		return i;
	}
	public int contactus(GM_contactus contactus)
	{
		int i=0;
		String sql="insert into contact values(?,?,?,?,?)";

		try {
			Connection connection=getConnection();
			PreparedStatement statement=connection.prepareStatement(sql);

			statement.setString(1, contactus.getFname());
			statement.setString(2, contactus.getEmail());
			statement.setString(3, contactus.getPhone());
			statement.setString(4, contactus.getSubject());
			statement.setString(5, contactus.getContact_date());


			i=statement.executeUpdate();

			connection.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

		return i;

	}
	public int upadtemembership(GM_memebership memebership)
	{
		
		String sql="update  membership set email=?,contact=? where fname=?";
		int i=0;
		try
		{

			Connection connection=getConnection();
			PreparedStatement statement= connection.prepareStatement(sql);
					
			statement.setString(1,memebership.getEmail());
			statement.setString(2,memebership.getConatct());
			statement.setString(3, memebership.getFname());

			i=statement.executeUpdate();

			connection.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return i;
	}

	public  int insertintofeedback(GM_feedback feedback)
	{
		int i=0;
		String sql="insert into feedback values(?,?,?,?,?,?,?,?,?,?,?)";
		try
		{
			Connection connection=getConnection();
			PreparedStatement statement=connection.prepareStatement(sql);

			statement.setString(1, feedback.getQuestion1());
			statement.setString(2, feedback.getQuestion2());
			statement.setString(3, feedback.getQuestion3());
			statement.setString(4, feedback.getQuestion4());
			statement.setString(5, feedback.getQuestion5());
			statement.setString(6, feedback.getQuestion6());
			statement.setString(7, feedback.getQuestion7());
			statement.setString(8, feedback.getQuestion8());
			statement.setString(9, feedback.getQuestion9());
			statement.setString(10, feedback.getQuestion10());
			statement.setString(11, feedback.getQuestion11());

			i=statement.executeUpdate();

			connection.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return i;
	}
}
	/*boolean status= false;
	public boolean Check(String emailid,String password) throws SQLException 
	{
		String sql="select email,password from membership  where email=? and password=?";
		try {

			Connection connection=getConnection();
			PreparedStatement statement= connection.prepareStatement(sql);

			statement.setString(1, emailid);
			statement.setString(2, password);

			ResultSet rs=statement.executeQuery();

			status=rs.next();
			connection.close();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		return status;

	}
	 */
