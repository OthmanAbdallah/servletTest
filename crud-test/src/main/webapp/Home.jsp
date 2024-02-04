<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/DisplayStudentsServlet" method="post" >
 <ul>
<li><a href="CreateStudent.jsp">Create Student</a></li>
<li><a href="UpdateStudent.jsp">Update Student</a></li>
<li><a href="DeleteStudent.jsp">Delete Student</a></li>
<li><input type=submit value="Display Registered Students"></li> 
 </ul>  

</form>
     

</body>
</html>