<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/DeleteStudentServlet" method="post">
<table><tr>
<th> Enter Student ID You Want to Delete ..</th>
<tr>

    <td><input type="text" name="Sid"></td>
    
    </table>
    <input type="submit" value="Submit">
    </form>
    
</body>
</html>