<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach items="${emplist}" var="empVO">
		<!-- emplist라는 모델을 가져오고, 개당  -->
		<h3>사번 : ${empVO.employee_id} 이름 : ${empVO.last_name }
			,${empVO.first_name }</h3>
		<!-- getemployee_id()를 get 빼고 () 빼고 소문자로.. -->


	</c:forEach>
</body>
</html>