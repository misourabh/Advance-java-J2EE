<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StudentRegistration</title>
</head>
<body>
<div align="center">
<form action="./StudentDetails.jsp" method="post">
<fieldset>
<legend style="margin: auto">STUDENT REGISTRATION</legend>
<table>
<tr>
<td>STUDENT NAME</td>
<td> <input type="text" name="name"> </td>
</tr>

<tr>
<td>STUDENT EMAIL</td>
<td> <input type="text" name="email"> </td>
</tr>

<tr>
<td>STUDENT CONTACT</td>
<td> <input type="text" name="contact"> </td>
</tr>

<tr>
<td>STUDENT CITY</td>
<td> <input type="text" name="city"> </td>
</tr>
</table>

</fieldset>
<input style="margin: auto" type="submit" value="SUBMIT" >
</form>


</div>
</body>
</html>