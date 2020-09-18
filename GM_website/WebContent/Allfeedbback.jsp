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
	<%@ page import="GM_login.bean.GM_feedback"%>
	<%@ page import="java.util.List"%>
	<%
		GM_admindao admindao = new GM_admindao();

		PrintWriter writer = response.getWriter();

		List<GM_feedback> list = admindao.getallfeedback();

		writer.print("<table border='1' width='100%'");

		writer.print("<tr><th>Which part/s of your customer experience are you commenting on?</th>"
				+ "<th>.Which activity area are you commenting on?</th>"
				+ "<th>Would you say that you were making a...</th>" + "<th>. What would you like to tell us?</th>"
				+ "<th>Visiting On</th>" + "<th>Contact  On</th>" + "<th>Name</th>" + "<th>Surname</th>"
				+ "<th>Telephone Tumber</th>" + "<th>Email </th>" + "<th>Address</th>");

		for (GM_feedback feedback : list) {
			writer.print("<tr>" + "<td>" + feedback.getQuestion1() + "</td>" + "<td>" + feedback.getQuestion2()
					+ "</td>" + "<td>" + feedback.getQuestion3() + "</td>" + "<td>" + feedback.getQuestion4()
					+ "</td>" + "<td>" + feedback.getQuestion5() + "</td>" + "<td>" + feedback.getQuestion6()
					+ "</td>" + "<td>" + feedback.getQuestion7() + "</td>" + "<td>" + feedback.getQuestion8()
					+ "</td>" + "<td>" + feedback.getQuestion9() + "</td>" + "<td>" + feedback.getQuestion10()
					+ "</td>" + "<td>" + feedback.getQuestion11() + "</td>");

		}
		writer.print("</table>");
		writer.print("<br>");
		writer.print("<br>");
		writer.print("</tr>");
		writer.write("<h1>"+"<a href=\"admin.html\"> Return  </a>"+"</h1>");
	%>
</body>
</html>