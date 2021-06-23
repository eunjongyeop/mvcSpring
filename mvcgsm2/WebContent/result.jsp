<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%
	List<String> list = (ArrayList)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<meta charset="UTF-8">
</head>
<body>
<table>
  <% for (int i=0; i<list.size(); i++) { %>
    <tr>
  	  <td><%= list.get(i) %></td>
  	</tr>
  <% } %>
</table>
</body>
</html>
