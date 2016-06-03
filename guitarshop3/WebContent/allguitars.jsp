<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="main.bll.GuitarBll"%>
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
			<td>delate</td>
		</tr>
		<c:forEach var="guitar" items="${GuitarBll.inventory().getGuitars()}">
				<tr>
					<td>${guitar.getSerialNumber()}</td>
					<td>${guitar.getPrice()}</td>
					<td>${guitar.getSpec().getBuilder()}</td>
					<td>${guitar.getSpec().getModel()}</td>
					<td>${guitar.getSpec().getType()}</td>
					<td>${guitar.getSpec().getTopWood()}</td>
					<td>${guitar.getSpec().getBackWood()}</td>
					<td><a href="http://localhost:8080/guitarshop3/DelateGuitar?SerialNumber=${guitar.getSerialNumber()}">删除</a></td>
				</tr>
		</c:forEach>
	</table>
	<form action="AddGuitar">
	SerialNumber<input type="text" name="serialnumber"/></br>
	Price<input type="text" name="price"/></br>
	type<input type="text" name="type"/></br>
	model<input type="text" name="model"/></br>
	builder<input type="text" name="builder"/></br>
	topwood<input type="text" name="topwood"/></br>
	backwood<input type="text" name="backwood"/></br>
	<input type="submit" value="增加"/>
	</form>
	<a href="index.jsp">返回主页</a>
</body>
</html>