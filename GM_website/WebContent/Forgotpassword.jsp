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
	<%@ page import="com.Login.Dao.GM_signupdao"%>
	<%
	
	PrintWriter writer=response.getWriter();
	String  email=request.getParameter("email");
    String  password=request.getParameter("cpsw");
	
    GM_signupdao signup=new GM_signupdao();

    int i=signup.upadtepassword(email, password);
	if(i==1)
	{
		writer.write("<h1>"+"password upadte sucessfully"+"</h1>");
		RequestDispatcher dispatcher=request.getRequestDispatcher("/Home.html");
		dispatcher.forward(request, response);
	}
	else
	{
		writer.write("<h1>"+"not sucessfull"+"</h1>");
		RequestDispatcher dispatcher=request.getRequestDispatcher("Forgotpassword.html");
		dispatcher.include(request, response);
	}

%>
</body>
</html>