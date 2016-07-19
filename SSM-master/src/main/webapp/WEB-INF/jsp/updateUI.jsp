<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/6/27
  Time: 22:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="/bootstrap/js/jquery.min.js"></script>
<script src="/bootstrap/js/bootstrap.min.js"></script>
<html>
<head>
    <title>修改页面</title>
</head>
<body>
<%--<h1>
    ${sid} ok
</h1>--%>

    <form action="<%=request.getContextPath()%>/student/update" method="post">
        <input type="hidden" name="sid" value="${sid}">
        姓名：<input type="text" name="sname"><br>
        性别：<input type="text" name="gender"><br>
        年龄：<input type="text" name="age"><br>
        地址：<input type="text" name="address"><br>
        <input type="submit" class="btn btn-primary" value="提交">
    </form>

</body>
</html>
