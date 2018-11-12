<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${name} Registration</title>
<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
<link href="<c:url value='/static/css/custom.css' />" rel="stylesheet"></link>
</head>
<body>
	<div class="form-container">
        <form:form action="register" method="post" commandName="regUser" class="form-horizontal">

					<div class="row">
						<div class="form-group col-md-12">
							<h2>${name}Registration Form</h2>
						</div>
					</div>

					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-3 control-lable" for="name">User Name</label>
							<div class="col-md-7">
								<form:input path="name" />
								<div class="has-error">
									<form:errors path="name" class="help-inline" />
								</div>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-3 control-lable" for="designation">Designation</label>
							<div class="col-md-7">
								<form:input path="designation" />
								<div class="has-error">
									<form:errors path="designation" class="help-inline" />
								</div>
							</div>
						</div>
					</div>
                
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-3 control-lable" for="email">Email</label>
							<div class="col-md-7">
								<form:input path="email" />
								<div class="has-error">
									<form:errors path="email" class="help-inline" />
								</div>
							</div>
						</div>
					</div>
                
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-3 control-lable" for="dob">Date Of Birth(mm/dd/yyyy)</label>
							<div class="col-md-7">
								<form:input path="dob" />
								<div class="has-error">
									<form:errors path="dob" class="help-inline" />
								</div>
							</div>
						</div>
					</div>
              
                    <h2>Address</h2>
                
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-3 control-lable" for="address.addressType">Address Type</label>
							<div class="col-md-7">
								<form:select path="address.addressType">
										<form:options items= "${addressTypes}"/>
									</form:select>
								<div class="has-error">
									<form:errors path="address.addressType" class="help-inline" />
								</div>
							</div>
						</div>
					</div>
				
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-3 control-lable" for="address.street">Street</label>
							<div class="col-md-7">
								<form:input path="address.street" />
								<div class="has-error">
									<form:errors path="address.street" class="help-inline" />
								</div>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-3 control-lable" for="address.city">City</label>
							<div class="col-md-7">
								<form:input path="address.city" />
								<div class="has-error">
									<form:errors path="address.city" class="help-inline" />
								</div>
							</div>
						</div>
					</div>
				
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-3 control-lable" for="address.state">State</label>
							<div class="col-md-7">
								<form:input path="address.state" />
								<div class="has-error">
									<form:errors path="address.state" class="help-inline" />
								</div>
							</div>
						</div>
					</div>
				
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-3 control-lable" for="address.country">Country</label>
							<div class="col-md-7">
								<form:input path="address.country" />
								<div class="has-error">
									<form:errors path="address.country" class="help-inline" />
								</div>
							</div>
						</div>
					</div>
				     
                    <input align="center" type="submit" value="Register" />
        </form:form>
	</div>
	
</body>
</html>