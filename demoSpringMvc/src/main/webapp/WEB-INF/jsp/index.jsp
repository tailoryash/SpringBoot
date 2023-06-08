<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<body>
<%
String name = (String)request.getAttribute("name");
Integer id = (Integer)request.getAttribute("id");
List<String> friends = (List<String>) request.getAttribute("friends");
%>
<h1> Name is : <%=name%> and ID is : <%=id%> </h1>
<%
    for(String s: friends){
    %>
    <h1><%=s%> </h1>
    <%
    }
%>
</body>
</html>
