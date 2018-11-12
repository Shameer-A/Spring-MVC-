<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirm Registration</title>
<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
<link href="<c:url value='/static/css/custom.css' />" rel="stylesheet"></link>
</head>
<body>
	<div class="form-container">
		 <form:form action="confirmRegistration" method="post" commandName="regUser" class="form-horizontal">
					<div class="row">
						<div class="form-group col-md-12">
							<h2>Confirm Registration</h2>
						</div>
					</div>
					
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-3 control-lable" for="name">User Name</label>
							<div class="col-md-7">
								<form:input path="name" value="${regUser.name}" />
							</div>
						</div>
					</div>
					
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-3 control-lable" for="age">Age</label>
							<div class="col-md-7">
								<label class="col-md-3 control-lable">${regUser.age}</label>
							</div>
						</div>
					</div>
					
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-3 control-lable" for="designation">Profession</label>
							<div class="col-md-7">
								<form:input path="designation" value="${regUser.designation}" />
							</div>
						</div>
					</div>
					
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-3 control-lable" for="email">Email</label>
							<div class="col-md-7">
								<form:input path="email" value="${regUser.email}"/>
							</div>
						</div>
					</div>
					
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-3 control-lable" for="email">Date Of Birth</label>
							<div class="col-md-7">
								<form:input path="dob" value="${regUser.dob}" />
							</div>
						</div>
					</div>
					
					<div class="row">
						<div class="form-group col-md-12">
							<h4>Address Details</h4>
						</div>
					</div>
					
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-3 control-lable" for="address.addressType">Address Type</label>
							<div class="col-md-7">
								<form:input path="address.addressType" value="${regUser.address.addressType}" />
							</div>
						</div>
					</div>
					
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-3 control-lable" for="address.street">Street</label>
							<div class="col-md-7">
								<form:input path="address.street" value="${regUser.address.street}" />
							</div>
						</div>
					</div>
					
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-3 control-lable" for="address.street">City</label>
							<div class="col-md-7">
								<form:input path="address.city" value="${regUser.address.city}" />
							</div>
						</div>
					</div>
					
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-3 control-lable" for="address.state">State</label>
							<div class="col-md-7">
								<form:input path="address.state" value="${regUser.address.state}" />
							</div>
						</div>
					</div>
					
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-3 control-lable" for="address.country">Country</label>
								<div class="col-md-7">
								<form:input path="address.country" value="${regUser.address.country}" />
							</div>
						</div>
					</div>
					
					<input align="center" type="submit" value="Confirm" />
		</form:form>
	</div>
</body>
</html>