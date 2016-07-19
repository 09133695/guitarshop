<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/6/27
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>学生列表</title>
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="/bootstrap/js/jquery.min.js"></script>
    <script src="/bootstrap/js/bootstrap.min.js"></script>
    <style>
        .w{
            width: 600px;
            margin-left: auto;
            margin-right: auto;
        }

    </style>
</head>
<body>

<table class="table table-hover w">
    <thead>
    <tr>
        <td>#</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
        <td>地址</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
        <c:forEach items="${studentList}" var="sl" varStatus="s">
            <tr>
                <td>${s.index+1}</td>
                <td>${sl.sname}</td>
                <td>${sl.gender}</td>
                <td>${sl.age}</td>
                <td>${sl.address}</td>
                <td><a onclick="return confirm('确定要删除吗?')" href="<%=request.getContextPath()%>/student/delete/${sl.sid}" class="btn btn-danger">删除</a></td>
                <td><a href="<%=request.getContextPath()%>/student/updateUI/${sl.sid}" class="btn btn-info">修改</a></td>
            </tr>
        </c:forEach>
    </tbody>
    <a class="btn btn-primary" href="<%=request.getContextPath()%>/student/addUI">添加</a>
</table>


</body>
</html>
