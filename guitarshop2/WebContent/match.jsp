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
	<c:forEach items="${aaa}" var="bbb" varStatus="status">
			<td>${bbb.getSerialNumber()}</td>
				<td>${bbb.getPrice()}</td>
				<td>${bbb.getSpec().getBuilder()}</td>
				<td>${bbb.getSpec().getModel()}</td>
				<td>${bbb.getSpec().getType()}</td>
				<td>${bbb.getSpec().getTopWood()}</td>
				<td>${bbb.getSpec().getBackWood()}</td>
			</tr>
	</c:forEach>
	</table>
</body>
</html>