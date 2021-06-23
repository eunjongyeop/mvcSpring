<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<body>	<!--구구단 홀수단만 출력-->
<table class="table table-bordered">
  <tr>
  	<%for(int i = 3; i<=9; i+=2) {%>
  	  <td><%=i%>단</td>
  	<%}%>
  </tr>
  <%for(int i=1; i<=9; i++) {%>
    <tr>
      <%for(int j=3; j<=9; j+=2) {%>
        <td><%=j%> * <%=i%> = <%=j*i%></td>
      <%}%>
    </tr>
  <%}%>
</table>
</body>
</html>