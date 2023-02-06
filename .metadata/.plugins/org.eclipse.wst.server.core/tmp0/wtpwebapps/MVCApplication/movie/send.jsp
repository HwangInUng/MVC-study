<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="root"></div>
</body>
<script src="https://unpkg.com/react@18/umd/react.development.js" crossorigin></script>
<script src="https://unpkg.com/react-dom@18/umd/react-dom.development.js" crossorigin></script>
<script src="https://unpkg.com/@babel/standalone/babel.min.js"></script>
<script type="text/babel">
		function App(){
			const send = () => {
				form1.action="/movie.do";
				form1.method="POST"
				form1.submit();
			}
			return (
				<div>
					<form name="form1">
						<select name="movie">
							<option value="인터">인터스텔라</option>
							<option value="다크">다크나이트</option>
							<option value="마션">마션</option>
							<option value="아이">아이언맨</option>
						</select>
					</form>
					<p></p>
					<button type="button"
									onClick={send}
									style={{
										backgroundColor: "tomato",
										color: "white",
										padding: "10px 20px",
										fontSize: 18,
										border: 0,
										borderRadius: 10
									}}
					>
					분석
					</button>
				</div>
			)
		}
		const root = ReactDOM.createRoot(document.getElementById("root"));
		root.render(<App/>);
</script>
</html>