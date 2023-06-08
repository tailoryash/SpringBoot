<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.time.LocalDateTime"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2> ${name}</h2>
<h2>${roll}</h2>
<h2>${time}</h2>
<hr/>
<c:forEach var="list" items="${l}" >
    <c:out value = "${list}" />
</c:forEach>
</body>
</html>