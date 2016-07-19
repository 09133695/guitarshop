<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/6/27
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生老师列表</title>
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="/bootstrap/js/jquery.min.js"></script>
    <script src="/bootstrap/js/bootstrap.min.js"></script>
    <style>
        .w{
            width: 700px;
            margin-left: auto;
            margin-right: auto;
        }

    </style>
</head>
<body>
    <form action="/teacher/list" method="post">
        <input type="text" name="tid"><br>
        <input type="submit" value="提交">
    </form>

    <table class="table table-hover w">
        <thead>
            <tr>
                <c:if test="${sList!=null}">
                <td>#</td>
                <td>学生姓名</td>
                <td>学生性别</td>
                <td>学生年龄</td>
                <td>学生地址</td>
                <td>老师姓名</td>
                <td>职务</td>
                </c:if>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${sList}" var="sl" varStatus="s">
                <tr>
                    <td>${s.index+1}</td>
                    <td>${sl.sname}</td>
                    <td>${sl.gender}</td>
                    <td>${sl.age}</td>
                    <td>${sl.address}</td>
                    <td>${sl.teacher.tname}</td>
                    <td>${sl.teacher.job}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
