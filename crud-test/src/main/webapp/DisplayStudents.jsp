<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="com.othman.model.Student" %>
<!DOCTYPE html>

<html>
<head>
<style>
section{width:100%;
margin 10px;
border: 1px solid black;
text-align:center;
padding-bottom:10px;
}
th{
padding-right:10px;
padding-left:10px;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%  %>
<% ArrayList<Student> list=(ArrayList<Student>) request.getAttribute("studentList");  

for(Student s:list){ 
%>
<section><table>
  <tr>
    <th>Sid</th>
    <th>Name</th>
    <th>Age</th>
    <th>Country</th>
    <th>GPA</th>
    <th>Uni_Abb</th>
    <th>Gender</th>
  </tr>
 <tr>
  <td><%= s.getSid() %></td>
    <td><%= s.getName() %></td>
    <td><%= s.getAge() %></td>
    <td><%= s.getCountry() %></td>
    <td><%= s.getGpa() %></td>
    <td><%= s.getUni_Abb() %></td>
    <td><%= s.getGender() %></td> 
 </table> 
 </section>

<%}%>
<a href="Home.jsp">Home</a>
</body>
</html>