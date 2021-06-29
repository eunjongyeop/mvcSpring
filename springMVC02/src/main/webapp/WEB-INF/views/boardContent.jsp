<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    function goList() {
		location.href = "boardList.do";
	}
    
    function goDelete(idx) {
    	location.href = "boardDelete.do?idx="+idx;
	}
  </script>
</head>
<body>
 
<div class="container">
  <h2>Spring MVC Board</h2>
  <div class="panel panel-default">
    <div class="panel-heading">BOARD VIEW</div>
    <div class="panel-body">
      <form class="form-horizontal" action="boardUpdate.do" method="post">
        <div class="form-group">
          <label class="control-label col-sm-2">번호:</label>
          <div class="col-sm-10">
            <input type="text" class="form-control" value=${vo.idx} name="idx" readonly="readonly">
          </div>
        </div>
        <div class="form-group">
          <label class="control-label col-sm-2">제목:</label>
          <div class="col-sm-10">
            <input type="text" class="form-control" value=${vo.title} name="title">
          </div>
        </div>
        <div class="form-group">
		  <label class="control-label col-sm-2">내용:</label>
		  <div class="col-sm-10">
		    <textarea class="form-control" rows="5" name="contents">${vo.contents}</textarea>
		  </div>
		</div>
        <div class="form-group">
          <label class="control-label col-sm-2">작성자:</label>
          <div class="col-sm-10">
            <input type="text" class="form-control" value=${vo.writer} readonly="readonly">
          </div>
        </div>
        <div class="form-group">
          <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-primary">수정</button>
            <button type="reset" class="btn btn-warning">취소</button>
            <button type="button" class="btn btn-info" onclick="goDelete(${vo.idx})">삭제</button>
            <button type="button" class="btn btn-seccess" onclick="goList()">리스트</button>
          </div>
        </div>
      </form>
    </div>
    <div class="panel-footer">광주소프트웨어마이스터고(은종엽)</div>
  </div>
</div>

</body>
</html>
