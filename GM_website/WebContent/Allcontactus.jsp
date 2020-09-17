<%@page import="com.Login.Dao.GM_admindao"%>
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
	<%@ page import="GM_login.bean.GM_contactus"%>
	<%@ page import="java.util.List"%>>
	<%
		GM_admindao admindao=new GM_admindao();

		PrintWriter writer = response.getWriter();

		List<GM_contactus> list = admindao.getallcontact();

		writer.print("<table border='1' width='100%'");

		writer.print("<tr><th>Fname</th>" 
					+ "<th>Email</th>"
					+"<th>Phone</th>"
					+ "<th>Subject</th>"
					+"<th>Date</th>");

		for (GM_contactus contact : list) 
		{
			writer.print("<tr>"
		            + "<td>" + contact.getFname() + "</td>" 
					+ "<td>" + contact.getEmail() + "</td>"
					+"<td>"+contact.getPhone()+"</td>"
					+ "<td>" + contact.getSubject() + "</td>"
					+"<td>"+contact.getContact_date()+"</td>");
			
	
		}
		writer.print("</table>");
		writer.print("<br>");
		writer.print("<br>");
		writer.print("</tr>");
		writer.write("<h1>"+"<a href=\"admin.html\"> Return  </a>"+"</h1>");
		
	%>
</body>
</html>