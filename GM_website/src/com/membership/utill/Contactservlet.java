package com.membership.utill;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Login.Dao.GM_signupdao;

import GM_login.bean.GM_contactus;


public class Contactservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname=request.getParameter("fname");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String subject=request.getParameter("subject");
		
		GM_contactus contactus=new GM_contactus();
		
		contactus.setFname(fname);
		contactus.setEmail(email);
		contactus.setPhone(phone);
		contactus.setSubject(subject);
		Date date=new Date();
		contactus.setContact_date(date.toString());
		
		GM_signupdao signup=new GM_signupdao();

		PrintWriter writer=response.getWriter();
		
		 int i=signup.contactus(contactus);
		 
		 if(i==1)
		 {
			 writer.write("<h1>"+"Thank You For Contact Us"+"</h1>");
			 
			 RequestDispatcher dispatcher=request.getRequestDispatcher("/Contact.html");
			 dispatcher.include(request, response);
		 }	
		
	}

}
