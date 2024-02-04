<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
main{border: 2px solid red;
width:50%;
left:25%;
margin-left:25%;
padding:10px;

}
section{width:100%;
margin 10px;
border: 1px solid black;
text-align:center;
padding-bottom:10px;
}
table{
width:100%;

}
input{width:80%;}

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

%>
<main>
<section><span>Input Student Information:</span><br>
<form action="<%=request.getContextPath() %>/Createstudentservlet" method="post"> 
<table>
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

    <td><input type="text" name="Sid"></td>
    <td><input type="text" name="Name"></td>
    <td><input type="text" name="Age"></td>
    <td><input type="text" name="Country"></td>
    <td><input type="text" name="Gpa"></td>
    <td><input type="text" name="Uni_Abb"></td>
    <td><input type="text" name="Gender"></td> 
   
 </tr>
</table>

<input type="submit" value="Submit">
</form>
</section>





</main>

</body>
</html>