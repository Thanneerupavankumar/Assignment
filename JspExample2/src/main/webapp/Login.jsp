<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Login.jsp" method="get">
enter userid<input type="text" name="txtUser"><br><br>
enter password<input type="password" name="txtPword"><br><br>
<input type="submit" value="check">
</form>
<%!
  boolean validate(String uname,String pword){
	if(uname.equalsIgnoreCase("Pavan") && pword.equals("Pavan@123")){
		return true;
	}
	return false;
}

%>
<%  
   String uname=request.getParameter("textuser");
   String pword=request.getParameter("txtPword");
if(uname !=null && pword!=null){
	if(validate(uname,pword)){
		out.println("welcome"+uname);
	}
	else
		out.println("invalid username and password");
}

%>
</body>
</html>