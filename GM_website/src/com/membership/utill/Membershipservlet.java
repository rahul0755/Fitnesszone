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

import GM_login.bean.GM_memebership;

public class Membershipservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String address=request.getParameter("address");
		String dob=request.getParameter("dob");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		
		String password=request.getParameter("pass");
		
		Date date=new Date();
		
		String member=date.toString();
		
		GM_signupdao sign=new GM_signupdao();
		
		GM_memebership membership=new GM_memebership(fname, lname, address, dob, email, contact, password,member);
		
		int i=sign.insertintomembership(membership);
		
		 if(i==1)		
			{
			writer.write("<h1>"+"Membership ragistration sucessful"+"</h1>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("Membership.html");
			dispatcher.include(request, response);
			
			  String to=email;
				
				String subject="i hope you get the result";
				String massage="thank for getting membership on fitness zone";
				
				SendMail mail=new SendMail();
				boolean mail_sent=mail.SendMail(to, subject, massage);
		          
				if(mail_sent)
				{
					writer.write("mail sent successful");
				}
				else 
				{
					writer.write("not successful");
				}
			}
			else
			{
				writer.write("<h1>"+"Membership ragistration Unsucessful"+"</h1>");
				RequestDispatcher dispatcher = request.getRequestDispatcher("Membership.html");
				dispatcher.include(request, response);
			} 
	}

}
