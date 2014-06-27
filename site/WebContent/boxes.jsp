<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
div {
	display: inline-table;
}
</style>
<title>Colored Boxes</title>
</head>
<body>
	<h1>Colored Boxes</h1>
	<br>
	<c:forEach var="box" items="${boxes}">
		<div id="${box.id}"
			style="border: solid ${box.borderWidth}px ${box.borderColor}; background-color: ${box.color}; height: ${box.height}px; width: ${box.width}px;">
		</div>
	</c:forEach>
</body>
</html>