<%@ page contentType="text/html;charset=UTF-8"%>
<%
	//현재 request는 이전 요청부터 유지되어온 객체
	String result = (String)request.getAttribute("result");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	영화 한줄평 :
	<p>
	<%=result %>
</body>
</html>