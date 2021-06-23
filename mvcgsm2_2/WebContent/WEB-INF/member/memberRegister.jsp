<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<fieldset>
  <legend>회원가입화면</legend>
  <form action="<c:url value='/memberInsert.do' />" method="post">
  <table class="table table-bordered">
  	<tr>
  	  <td>아이디</td>
  	  <td><input type="text" name="id"></td>
  	</tr>
  	<tr>
  	  <td>비밀번호</td>
  	  <td><input type="password" name="pass"></td>
  	</tr>
  	<tr>
  	  <td>이름</td>
  	  <td><input type="text" name="name"></td>
  	</tr>
  	<tr>
  	  <td>나이</td>
  	  <td><input type="text" name="age"></td>
  	</tr>
  	<tr>
  	  <td>전화번호</td>
  	  <td><input type="text" name="phone"></td>
  	</tr>
  	<tr>
  	  <td>이메일</td>
  	  <td><input type="text" name="email"></td>
  	</tr>
  	<tr>
  	  <td colspan="2" style="text-align:center">
  	    <input type="submit" value="회원가입" class="btn">
  	    <input type="reset" value="취소" class="btn">
  	  </td>
  	</tr>
  </table>
  </form>
</fieldset>
</body>
</html>