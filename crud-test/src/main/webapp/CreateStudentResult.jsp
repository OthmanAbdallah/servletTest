<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


</head>
<body>


<% 
   if((Boolean)request.getAttribute("success")==true)
out.println("Student Register Successful");
   else out.println("Student Register Unsuccessful");
%>
<br>
<a href="Home.jsp">Home</a>



</body>
</html>