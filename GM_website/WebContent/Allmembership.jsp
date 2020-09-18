<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@ page import="com.Login.Dao.GM_admindao"%>
	<%@ page import="GM_login.bean.GM_memebership"%>
	<%@ page import="java.util.List"%>
	<%
	PrintWriter writer=response.getWriter();
	response.setContentType("text/html");
	
	GM_admindao admindao=new GM_admindao();
	
		
		List<GM_memebership> list=admindao.getallmembership();
		
		
		writer.write("<table name=\"list\" border=\"1\" align=\"centre\">");
		writer.write("<tr>");
		writer.write("<td align=\"centre\">First Name</td>");
		writer.write("<td align=\"centre\">Last Name</td>");
		writer.write("<td align=\"centre\">Address</td>");
		writer.write("<td align=\"centre\">Contact</td>");
		writer.write("<td align=\"centre\">Email</td>");
		writer.write("<td align=\"centre\">Dob</td>");
		writer.write("<td align=\"centre\">Date</td>");
		writer.write("</tr>");
		
		for(GM_memebership memebership:list)
		{

			writer.write("<tr>");
			writer.write("<td align=\"left\">"+memebership.getFname()+"</td>");
			writer.write("<td align=\"left\">"+memebership.getLname()+"</td>");
			writer.write("<td align=\"left\">"+memebership.getAddress()+"</td>");
			writer.write("<td align=\"left\">"+memebership.getConatct()+"</td>");
			writer.write("<td align=\"left\">"+memebership.getEmail()+"</td>");
			writer.write("<td align=\"left\">"+memebership.getDob()+"</td>");
			writer.write("<td align=\"left\">"+memebership.getDate()+"</td>");				
			
			writer.write("</td>");
			
			
			writer.write("<br>");
			
		}
		writer.write("</table>"+"<br><br>");
		writer.write("<h1>"+"<a href=\"admin.html\"> Return  </a>"+"</h1>");
	%>
</body>
</html>