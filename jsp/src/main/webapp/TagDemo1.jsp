<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="TagDemo2.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo Jsp 1</title>
</head>
<body>
<div align="center">
<h1>TAG DEMO JSP 1</h1>
<%!int a=20; 
int b=20;
int c=0; %>

<%!public int add(){
	 return a+b ; 
	     }%>
	    
	     <%c= add(); %>
      
      <%=c %>

</div>
</body>

</html>