<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>match</title>
</head>
<body>
<a href="index.jsp">返回</a>

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
	<c:forEach items="${matchingGuitars}" var="guitars" varStatus="status">
			<td>${guitars.getSerialNumber()}</td>
				<td>${guitars.getPrice()}</td>
				<td>${guitars.getSpec().getBuilder()}</td>
				<td>${guitars.getSpec().getModel()}</td>
				<td>${guitars.getSpec().getType()}</td>
				<td>${guitars.getSpec().getTopWood()}</td>
				<td>${guitars.getSpec().getBackWood()}</td>
			</tr>
	</c:forEach>
	</table>
</body>
</html>