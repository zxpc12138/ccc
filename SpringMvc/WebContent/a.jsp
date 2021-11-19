<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/springmvc/pp.html" method="get">
<input type="hidden" name="id" value="12"/>
<input type="text" name="name"/>
<input type="text" name="addr"/>
<input type="submit" value="提交"/>
</form>
</body>
</html>