<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/aa" method="post">
<input type="text" name="name"/>
<input type="text" name="addr"/>
<input type="submit" value="提交">
</form>
</body>
</html>