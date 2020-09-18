package com.membership.utill;



public class MyAuth extends javax.mail.Authenticator {
	
	String username="";
	String password="";

	public MyAuth(String username,String password)
	{
		super();
		this.username=username;
		this.password=password;
	}
	
	public javax.mail.PasswordAuthentication  getPasswordAuthentication()
	{
		return new javax.mail.PasswordAuthentication(username,password);
	}
}
