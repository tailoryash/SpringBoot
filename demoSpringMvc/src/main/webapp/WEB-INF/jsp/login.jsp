<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@page isELIgnored="false"%>
<html>
<head>
    <title>Demo</title>
</head>
<body>
<p class= "text-center0">${Header}
${Desc} </p>
<p>
    Welcome To Simform ${user.username}! <br>
    Your email is : ${user.email}  <br>
    Your password is : ${user.password}  <br>
</p>
</body>
</html>
