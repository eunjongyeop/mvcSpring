<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <script type="text/javascript">
  	function registerForm() {
		location.href = "registerForm.do";
	}
  </script>
</head>
<body>
 
<div class="container">
  <h2>Spring MVC Board</h2>
  <div class="panel panel-default">
    <div class="panel-heading">게시판 리스트</div>
    <div class="panel-body">
	  <div class="table-responsive">          
	    <table class="table table-hover">
	      <thead>
	        <tr>
	          <th>번호</th>
	          <th>제목</th>
	          <th>조회수</th>
	          <th>작성자</th>
	          <th>작성일</th>
	        </tr>
	      </thead>
	      <tbody>
	        <c:forEach var="vo" items="${list}">
	          <tr>
	            <td>${vo.idx}</td>
	            <td><a href="content.do?idx=${vo.idx}">${vo.title}</a></td>
                <td>${vo.count}</td>
	            <td>${vo.writer}</td>
	            <td>${vo.indate}</td>
	        </tr>
	        </c:forEach>
	      </tbody>
	      <tr>
	        <td colspan="5"><button class="btn btn-primary btn-sm" onclick="registerForm()">글쓰기</button></td>
	      </tr>
	    </table>
	  </div>
	</div>
    <div class="panel-footer">광주소프트웨어마이스터고(은종엽)</div>
  </div>
</div>

</body>
</html>
