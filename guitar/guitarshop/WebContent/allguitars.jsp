<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="guitarshop.dal.inventoryDal"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>allguitars</title>
</head>
<body>
	<table width="100%" border="1" cellpadding="2" cellspacing="0">
		<tr>
			<td>serialNumber</td>
			<td>price</td>
			<td>builder</td>
			<td>model</td>
			<td>type</td>
			<td>backWood</td>
			<td>topWood</td>
		</tr>
		<c:forEach var="allgoods" items="${inventoryDal.allGuitars()}">
			<tr>
				<td>${allgoods.getSerialNumber()}</td>
				<td>${allgoods.getPrice()}</td>
				<td>${allgoods.getBuilder()}</td>
				<td>${allgoods.getModel()}</td>
				<td>${allgoods.getType()}</td>
				<td>${allgoods.getTopWood()}</td>
				<td>${allgoods.getBackWood()}</td>
			</tr>
		</c:forEach>
	</table>
<a href="index.jsp">返回主页</a>
</body>
</html>