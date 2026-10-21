<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>success</title>
</head>
<body>
  <h1>Registration Successful</h1>
  <%
    String name = (String)session.getAttribute("name");
  %>
  
 <h2>Hey <%= name %>, you have Registered successfully </h2>
</body>
</html>