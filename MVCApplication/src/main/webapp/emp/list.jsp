<%@page import="com.mvc.domain.Emp"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%
	List<Emp> empList = (List)request.getAttribute("empList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4">
				<p class="display-2 text-center">사원 목록</p>
				<table class="table">
					<thead>
						<tr>
							<th></th>
							<th>부서명</th>
							<th>사원명</th>
							<th>급여</th>
						</tr>
					</thead>
					<tbody>
					<form id="form1">
						<%
						for (Emp emp : empList) {
						%>
						<tr>
							<td><input type="checkbox" name="empno" value="<%=emp.getEmpno()%>"></td>
							<td><%=emp.getDept().getDname() %></td>
							<td><%=emp.getEname() %></td>
							<td><%=emp.getSal() %>원</td>
						</tr>
						<%
						}
						%>
						</form>
					</tbody>
				</table>
				<button type="button" class="btn btn-dark" id="regist">사원등록</button>
				<button type="button" class="btn btn-secondary" id="del">삭제</button>
			</div>
			<div class="col-md-4"></div>
		</div>
	</div>
</body>
<script>
	function del(){
		$("#form1").attr({
			action: "/emp/delete.do",
			method: "post"
		});
		$("#form1").submit();
	}

	$(function() {
		$("#regist").on("click", function() {
			location.href = "/emp/regist.jsp";
		});
		$("#del").on("click", function() {
			del();
		});
	});
</script>
</html>