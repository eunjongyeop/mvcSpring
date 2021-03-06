<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
 
<div class="container">
  <h2>Spring MVC Board</h2>
  <div class="panel panel-default">
    <div class="panel-heading">게시판 글쓰기</div>
    <div class="panel-body">
	  <form class="form-horizontal" action="register.do" method="post">
		<div class="form-group">
		  <label class="control-label col-sm-2">제목:</label>
		  <div class="col-sm-10">
		    <input type="text" class="form-control" name="title" placeholder="Enter Title">
		  </div>
		</div>
		<div class="form-group">
		  <label class="control-label col-sm-2">내용:</label>
		  <div class="col-sm-10">
		    <textarea class="form-control" rows="5" name="contents"></textarea>
		  </div>
		</div>
		<div class="form-group">
		  <label class="control-label col-sm-2">작성자:</label>
		  <div class="col-sm-10">
		    <input type="text" class="form-control" name="writer" placeholder="Enter Writer">
		  </div>
		</div>
		<div class="form-group">
		  <div class="col-sm-offset-2 col-sm-10">
		    <button type="submit" class="btn btn-default">등록</button>
		    <button type="reset" class="btn btn-default">취소</button>
		  </div>
		</div>
	  </form>
	</div>
    <div class="panel-footer">광주소프트웨어마이스터고(은종엽)</div>
  </div>
</div>

</body>
</html>
