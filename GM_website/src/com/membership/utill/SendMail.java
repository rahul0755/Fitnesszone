package com.membership.utill;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {


	public boolean SendMail( String to ,String Subject,String massage)
	{
		String from="rahulpawar0755@gmail.com";
		String pass="rahul@0755";

		boolean mail_status=false;

		Properties properties=new Properties();

		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.SocketFactory.port", "465");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.SocketFactory.class", "javax.net.ssl.SSLSocketFactory");
		properties.put("mail.smtp.auth", "true");

		MyAuth auth=new  MyAuth(from, pass);

		auth.getPasswordAuthentication();
		properties.put("mail.debug", "true");

		Session session=Session.getDefaultInstance(properties,
				new javax.mail.Authenticator()
		{
			public javax.mail.PasswordAuthentication  getPasswordAuthentication()
			{
				return new javax.mail.PasswordAuthentication(from,pass);
			}
		   });


		try
		{
			Message msg=new MimeMessage(session);
			msg.setFrom(new InternetAddress(from));
			
			InternetAddress[] addresses= { new InternetAddress(to)};
			
			msg.addRecipients(Message.RecipientType.TO, addresses);
			
			msg.setSubject(Subject);
			msg.setSentDate(new Date());
			msg.setText(massage);
			
			Transport.send(msg);
			mail_status=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return mail_status;
	}

}
