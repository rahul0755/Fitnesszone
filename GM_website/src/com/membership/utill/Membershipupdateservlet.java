package com.membership.utill;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Login.Dao.GM_signupdao;

import GM_login.bean.GM_memebership;

public class Membershipupdateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter writer=response.getWriter();
		String fname=request.getParameter("fname");
		String email=request.getParameter("email");
		String mobile=request.getParameter("psw");
		
		GM_signupdao signupdao=new GM_signupdao();
		
		GM_memebership memebership=new GM_memebership();
		
		memebership.setFname(fname);
		memebership.setEmail(email);
		memebership.setConatct(mobile);
		
		int i=signupdao.upadtemembership(memebership);
		
	if(i==1)
	{
		writer.write("<h1>"+"Update Sucessful"+"</h1>");
		RequestDispatcher dispatcher=request.getRequestDispatcher("Membershipupdate.html");
		dispatcher.include(request, response);
	
	}
	else 
	{
		writer.write("<h1>"+"Incorrect User Name"+"</h1>");
		RequestDispatcher dispatcher=request.getRequestDispatcher("Membershipupdate.html");
		dispatcher.include(request, response);
	
	}
		
	}

}
