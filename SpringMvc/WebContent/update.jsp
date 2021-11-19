<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
  <form method="post" action="<%=request.getContextPath()%>/springmvc/update.html">
  <input type="hidden" name="_method" value="PUT"/><!-- 将post请求转换成put请求 -->
  <input type="text" name="name"/>
  <input type="submit" value="提交">
  </form>
</body>
</html>