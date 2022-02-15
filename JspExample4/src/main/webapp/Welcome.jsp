<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Login </h1>
<form method ="get" action="Welcome.jsp">
Enter Uname:<input type="text" name="user" required><br/>
Enter Password:<input type="password" name="pass" required><br/>
<input type="submit" value="check">
<%! 
boolean validate(String uname,String pass){
	if(uname.equalsIgnoreCase("pavan")&& pass.equals("pavan@123")){
		return true;
	}
	return false;
}

%>
</form>
<% 
String uname=request.getParameter("txtuname");
String pword=request.getParameter("txtpword");
if(uname!=null && pword!=null)

%>
</body>
</html>