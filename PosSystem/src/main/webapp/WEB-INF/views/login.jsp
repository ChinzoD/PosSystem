<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include.jsp" %>
<div class="content">
	<!-- BEGIN LOGIN FORM -->
	<%-- <c:url value="/j_spring_security_check" var="loginUrl"/>   --%>
	<%-- <form:form method="POST" class="login-form" action="${loginUrl}" method="post"> --%>
	<div class="panel-body">
 
	<form:form method="post" action="postLogin" modelAttribute="loginUser" class="login-form" >
		<h3 class="form-title">Sign In</h3>

		<c:if test="${not empty error}">
			<div class="alert alert-danger">
				<spring:message code="AbstractUserDetailsAuthenticationProvider.badCredentials"/><br />
			</div>
		</c:if>
		<div class="form-group">
			<!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
			<form:label path="username" class="control-label visible-ie8 visible-ie9">Username</form:label>
			<form:input class="form-control form-control-solid placeholder-no-fix" type="text" autocomplete="off" placeholder="Username" id="username" name="username" path="username" />
		</div>
		<div class="form-group">
			<form:label path="password" class="control-label visible-ie8 visible-ie9">Password</form:label>
			<form:input class="form-control form-control-solid placeholder-no-fix" type="password" id="password" name="password" path="password" autocomplete="off" placeholder="Password" />
		</div>
		<div class="form-actions">
			<button type="submit" class="btn btn-success uppercase">Login</button>
		</div>
		<div class="create-account">
			<p>
				<a href="javascript:;" id="register-btn" class="uppercase">Create an account</a>
			</p>
		</div>
	</form:form>
	<!-- END LOGIN FORM -->
	<!-- BEGIN REGISTRATION FORM -->
	<form:form method="POST" class="register-form" action="login/add"  modelAttribute="loginUser">
		<h3>Sign Up</h3>
		<p class="hint">
			 Enter your personal details below:
		</p>
		<div class="form-group">
			<form:label path="firstName" class="control-label visible-ie8 visible-ie9">First Name</form:label>
			<form:input path="firstName" class="form-control placeholder-no-fix" type="text" placeholder="First Name"  name="firstName" />
		</div>
		<div class="form-group">
			<form:label path="lastName" class="control-label visible-ie8 visible-ie9">Last Name</form:label>
			<form:input path="lastName" class="form-control placeholder-no-fix" type="text" placeholder="Last Name"  name="lastName" />
		</div>
		<div class="form-group">
		    <form:label path="gender" class="control-label visible-ie8 visible-ie9">Gender</form:label>
			<form:select path="gender" name="gender" class="form-control">
				<option value="1">Male</option>
				<option value="0">Female</option>
			</form:select>
		</div>
		
		<div class="form-group">
			<form:label path="email" class="control-label visible-ie8 visible-ie9">Email</form:label>
			<form:input path="email" class="form-control placeholder-no-fix" type="text" placeholder="Email" name="email"/>
		</div>
		
		<p class="hint">
			 Enter your account details below:
		</p>
		<div class="form-group">
			<form:label path="username" class="control-label visible-ie8 visible-ie9">Username</form:label>
			<form:input path="username" class="form-control placeholder-no-fix" type="text" autocomplete="off" placeholder="Username" name="username"/>
		</div>
		<div class="form-group">
			<form:label path="password" class="control-label visible-ie8 visible-ie9">Password</form:label>
			<form:input path="password" class="form-control placeholder-no-fix" id="register_password" type="password" autocomplete="off" placeholder="Password" name="password"/>
			<span id="pwd-error" style="display:none;color:#a94442;">At least 6 letters and have at least one capital letter, one small letter, one number</span>
		</div>
		<div class="form-group">
			<label class="control-label visible-ie8 visible-ie9">Re-type Your Password</label>
			<input class="form-control placeholder-no-fix" type="password" autocomplete="off" placeholder="Re-type Your Password" name="rpassword"/>
		</div>
		<div class="form-actions">
			<button type="button" id="register-back-btn" class="btn btn-default">Back</button>
			<button type="submit" id="register-submit-btn" class="btn btn-success uppercase pull-right">Submit</button>
		</div>
	</form:form>
	<!-- END REGISTRATION FORM -->
</div>
</div>