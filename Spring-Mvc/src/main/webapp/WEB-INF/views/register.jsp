<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Add New User</title>
</head>
<body>
    <h2>Add New User</h2>
    <form:form method="post" action="register" modelAttribute="obj">
    	<form:label path="id">Id</form:label>
        <form:input path="id"/>
        <br>
    	<form:label path="name">Name</form:label>
        <form:input path="name"/>
        <br>
        <form:label path="phone">Phone number</form:label>
        <form:input path="phone"/>
        <br>
        <form:label path="email">Email</form:label>
        <form:input path="email"/>
        <br>
        <form:label path="password">Password</form:label>
        <form:input path="password"/>
        <br>
        <form:button>Submit</form:button>
    </form:form>
</body>
</html>
