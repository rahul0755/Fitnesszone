package com.Login.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import GM_login.bean.GM_contactus;
import GM_login.bean.GM_feedback;
import GM_login.bean.GM_memebership;

public class GM_admindao {

	public Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");

		return connection;

	}

	public List<GM_contactus> getallcontact() throws ClassNotFoundException, SQLException
	{

		String sql="select * from contact";

		Connection connection=getConnection();

		PreparedStatement statement=connection.prepareStatement(sql);

		List<GM_contactus> list=new ArrayList<GM_contactus>();

		ResultSet rs=statement.executeQuery();

		while(rs.next())
		{
			GM_contactus contactus=new GM_contactus();

			contactus.setFname(rs.getString("fname"));
			contactus.setEmail(rs.getString("email"));
			contactus.setPhone(rs.getString("phone"));
			contactus.setSubject(rs.getString("subject"));
			contactus.setContact_date(rs.getString("contact_date"));
			list.add(contactus);

		}
		connection.close();

		return list;

	}


	public List<GM_memebership> getallmembership() throws ClassNotFoundException, SQLException
	{
		String sql="select * from membership";

		Connection connection=getConnection();


		PreparedStatement statement=connection.prepareStatement(sql);

		List<GM_memebership> list=new ArrayList<GM_memebership>();

		ResultSet rs=statement.executeQuery();

		while(rs.next())
		{

			GM_memebership memebership=new GM_memebership();
			memebership.setFname(rs.getString("fname"));
			memebership.setLname(rs.getString("lname"));
			memebership.setAddress(rs.getString("address"));
			memebership.setConatct(rs.getString("contact"));
			memebership.setEmail(rs.getString("email"));
			memebership.setDob(rs.getString("dob"));
			memebership.setDate(rs.getString("membership_date"));
			list.add(memebership);


		}
		connection.close();

		return list;

	}

	public List<GM_feedback> getallfeedback() throws ClassNotFoundException, SQLException
	{
		String sql="select * from feedback";

		Connection connection=getConnection();


		PreparedStatement statement=connection.prepareStatement(sql);

		List<GM_feedback> list=new ArrayList<GM_feedback>();

		ResultSet rs=statement.executeQuery();

		while(rs.next())
		{

			GM_feedback  feedback=new GM_feedback();
			feedback.setQuestion1(rs.getString(1));
			feedback.setQuestion2(rs.getString(2));
			feedback.setQuestion3(rs.getString(3));
			feedback.setQuestion4(rs.getString(4));
			feedback.setQuestion5(rs.getString(5));
			feedback.setQuestion6(rs.getString(6));
			feedback.setQuestion7(rs.getString(7));
			feedback.setQuestion8(rs.getString(8));
			feedback.setQuestion9(rs.getString(9));
			feedback.setQuestion10(rs.getString(10));
			feedback.setQuestion11(rs.getString(11));

			list.add(feedback);

		}
		connection.close();
		
		return list;

	}
}
