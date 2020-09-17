<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home servlet</title>
</head>
<body>
	<%@ page import="com.Login.Dao.GM_signupdao"%>
	<%@ page import="GM_login.bean.GM_memebership"%>
	<%@  page import="javax.servlet.http.HttpSession"%>>
	<%
		String email = request.getParameter("uname");
		String password = request.getParameter("psw");

		PrintWriter writer = response.getWriter();

		GM_signupdao signup = new GM_signupdao();

		GM_memebership memebership = signup.Check1(email, password);

		if (memebership == null) {

			RequestDispatcher dispatcher = request.getRequestDispatcher("Login.html");
			dispatcher.include(request, response);
		} else {

			HttpSession sesion = request.getSession();
			session.setAttribute("memebership", memebership);

			if (memebership.getEmail().equalsIgnoreCase("rahulpawar0755@gmail.com")) {

				RequestDispatcher dispatcher = request.getRequestDispatcher("/admin.html");
				dispatcher.forward(request, response);
			} 
			else
			{
				RequestDispatcher dispatcher = request.getRequestDispatcher("/Home.html");
				dispatcher.forward(request, response);
			}
		}
	%>
</body>
</html>