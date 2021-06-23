<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="a" value="10"/>
<%
  int a = 10;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
jstl : ${a%2==0} <br>	 <!-- $ {} : EL -->  <!-- EL에 들어갈 수 있는 것  1. var, 2. 연산자  -->

<c:forEach var="i" begin="1" end="5">
  <font size=${i} }>야호</font><br>
</c:forEach>

<br>

<c:if test="${a%2==0}">
  짝수 입니다.
</c:if>
<c:if test="${a%2!=0}">
  홀수 입니다.
</c:if>

<br>

<c:choose>
  <c:when test="${a%2==0}">
       짝수입니다.
  </c:when>
  <c:when test="${a%2!=0}">
       홀수 입니다.
  </c:when>
  <c:otherwise>
       일치하는 when이 없을때 실행하는 블력
  </c:otherwise>
</c:choose>
</body>
</html>