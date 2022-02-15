<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="index.jsp"method="get">
<input type="text" name="txtName">
<input type="submit" name="save">
</form>
<%
   String name=request.getParameter("txtName");
if(name!=null){
	out.println("welcome "+name);
}
%>
</body>
</html>