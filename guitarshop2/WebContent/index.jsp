<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
</head>
<body>
<a href="allguitars.jsp">显示所有吉他</a>
<form action="macthguitar">
type<input type="text" name="type"/>
model<input type="text" name="model"/>
builder<input type="text" name="builder"/>
topwood<input type="text" name="topwood"/>
backwood<input type="text" name="backwood"/>
<input type="submit" value="查询"/>
</form>
</body>
</html>