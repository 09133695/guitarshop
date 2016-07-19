<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/6/27
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加页面</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/student/add" method="post">
    姓名：<input type="text" name="sname"><br>
    性别：<input type="text" name="gender"><br>
    年龄：<input type="text" name="age"><br>
    地址：<input type="text" name="address"><br>
    <input type="submit" class="btn btn-primary" value="提交">
</form>
</body>
</html>
