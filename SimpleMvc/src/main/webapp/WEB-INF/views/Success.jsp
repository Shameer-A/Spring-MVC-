<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${title}</title>
<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
<link href="<c:url value='/static/css/custom.css' />" rel="stylesheet"></link>
</head>
<body>
	<div class="form-container">
		<div class="row">
			<div class="form-group col-md-12">
				<h2>${message}</h2>
			</div>
		</div>
	</div>
	
</body>
</html>