<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo jsp 2</title>
</head>
<body>
<div align="center">

<%!List <Integer> list = new ArrayList(); %>
<%
  list.add(10);
  list.add(20);
  list.add(30);
  %>

<%
     for(Integer num : list) {%>
 

   <h3><%=num %></h3>


<%
}
%>
</div>
</body>
</html>