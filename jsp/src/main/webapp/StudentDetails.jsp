<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    String name=request.getParameter("name");
    String email=request.getParameter("email");
    String contact=request.getParameter("contact");
    String city = request.getParameter("city");
     %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StudentDetails</title>
</head>
<body>
<div align="center">

<fieldset>
<legend style="margin: auto">STUDENT DETAILS</legend>
<table>
<tr>
<td>STUDENT NAME:-</td>
<td><%=name %></td> 
</tr>

<tr>
<td>STUDENT EMAIL:-</td>
<td><%=email %></td> 
</tr>

<tr>
<td>STUDENT CONTACT:-</td>
<td><%=contact %></td> 
</tr>

<tr>
<td>STUDENT CITY:-</td>
<td><%=city %></td> 
</tr>
</table>
</fieldset>
</div>
</body>
</html>