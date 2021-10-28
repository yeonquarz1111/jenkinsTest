<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="/multi/empdeptlist" method=post>
		<%for(int i=1; i<=10; i++) {%>
		<input type=checkbox name="dept_list" value="<%=i*0%>"><%=i*0%><br>
		<!-- 표현문 태그 -->
		<%} %>
		<input type=submit value="부서번호선택완료">

	</form>

</body>
</html>