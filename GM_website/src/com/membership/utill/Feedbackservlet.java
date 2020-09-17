package com.membership.utill;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Login.Dao.GM_signupdao;

import GM_login.bean.GM_feedback;

public class Feedbackservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		
		  String qus = "";
	        String qus1[]=request.getParameterValues("checkbox1");
	        for(int i=0;i<qus1.length;i++)
	        {
	            qus+=qus1[i]+"";
	        }
		String qus2=request.getParameter("radio1");
		String qus3=request.getParameter("radio3");
		String qus4=request.getParameter("question4");
		String qus5=request.getParameter("radio6");
		String qus6=request.getParameter("contact");
		String qus7=request.getParameter("name");
		String qus8=request.getParameter("surname");
		String qus9=request.getParameter("phone");
		String qus10=request.getParameter("email");
		String qus11=request.getParameter("address");
		GM_signupdao signupdao=new GM_signupdao();
		
		 GM_feedback feedback=new GM_feedback(qus, qus2, qus3, qus4, qus5, qus6, qus7, qus8, qus9, qus10, qus11);
		
		int i=signupdao.insertintofeedback(feedback);
		
		
		
			 if(i==1)
			 {
			     writer.write("<h1>"+"Thank You For FEEDBACK"+"</h1>");
				 
				 RequestDispatcher dispatcher=request.getRequestDispatcher("feedback.html");
				 dispatcher.include(request, response);
			 }
			 else if(i==0)
			 {
                   writer.write("<h1>"+" You For FEEDBACK is not Complited"+"</h1>");
				 
				 RequestDispatcher dispatcher=request.getRequestDispatcher("feedback.html");
				 dispatcher.include(request, response);
			 }
	}

}
