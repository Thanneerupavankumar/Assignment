<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Calc.jsp" method="get">
<input type="text" name="txtNumber">
<input type="submit" value="save">
</form>
<%!
int cube(int num){
	return num*num*num;
}

%>
<% 
String txtNum=request.getParameter("txtNumber");
if(txtNum!=null){
	int num=Integer.parseInt(txtNum);
	out.println("cube of number="+cube(num));
	}
%>
</body>
</html>