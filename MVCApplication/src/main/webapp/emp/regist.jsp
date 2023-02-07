<%@ page contentType="text/html;charset=UTF-8"%>
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
				<form id="registForm">
					<div class="mb-3 mt-3">
						<label for="dept" class="form-label">부서명:</label>
						<input type="text" class="form-control" name="dname">
					</div>
					<div class="mb-3 mt-3">
						<label for="writer" class="form-label">사원명:</label>
						<input type="text" class="form-control" name="ename">
					</div>
					<div class="mb-3 mt-3">
						<label for="sal" class="form-label">급여:</label>
						<input type="number" class="form-control" name="sal">
					</div>
				</form>
				<button type="button" class="btn btn-dark" id="regist">등록</button>
				<button type="button" class="btn btn-secondary" id="list">목록</button>
			</div>
			<div class="col-md-4"></div>
		</div>
	</div>
</body>

<script type="text/javascript">
	function regist(){
		$("#registForm").attr({
			action: "/emp/regist.do",
			method: "post"
		});
		$("#registForm").submit();
	}

	$(function(){
		$("#regist").on("click", function(){
			regist();
		});
		$("#list").on("click", function(){
			location.href="/emp/list.do";
		});
	});
</script>
</html>