<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="kr.gsm.model.*"%>
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
  <script type="text/javascript">
    function register() {
		location.href="<c:url value='/memberRegister.do'/>";
	}
    
    function memDel(num) {
    	location.href="<c:url value='/memberDelete.do' />?num="+num;
    }
  </script>
</head>
<body>

<div class="container">
  <h2>회원관리시스템</h2>
  <div class="panel panel-default">
    <div class="panel-heading">
      <form class="form-inline" action="/action_page.php">
        <div class="form-group">
          <label for="id">ID:</label>
          <input type="email" class="form-control" id="id" name="id">
        </div>
        <div class="form-group">
          <label for="pwd">PW:</label>
          <input type="password" class="form-control" id="pwd" name="pwd">
        </div>
    <button type="submit" class="btn btn-default">로그인</button>
  </form>
    </div>
    <div class="panel-body">
      <div class="table-responsive">          
	  <table class="table table-bordered table-hover">
	    <thead>
	    <tr>
          <td>번호</td>
          <td>아이디</td>
          <td>패스워드</td>
          <td>이름</td>
          <td>나이</td>
          <td>전화번호</td>
          <td>이메일</td>
          <td>삭제</td>
        </tr>
        </thead>
	    <tbody>
		  <c:forEach var="vo" items="${list}">
		    <tr>
		      <td>${vo.getNum()}</td>
		      <td><a href='<c:url value='/memberContent.do' />?num=${vo.getNum()}'>${vo.getId()}</a></td>
		      <td>${vo.getPass()}</td>
		      <td>${vo.getName()}</td>
		      <td>${vo.getAge()}</td>
		      <td>${vo.getPhone()}</td>
		      <td>${vo.getEmail()}</td>
		      <td><input type="button" value="삭제" class="btn btn-warning" onclick="memDel(${vo.getNum()})"></td>
		    </tr>
		  </c:forEach>
		  <tr>
            <td colspan="8" align="right">
              <input type="button" onclick="register()" value="회원가입" class="btn btn-primary">
            </td>
          </tr>
	    </tbody>
	  </table>
	  </div>
    </div>
    <div class="panel-footer">
         소프트웨어마이스터고(gsm3-2)
    </div>
  </div>
</div>