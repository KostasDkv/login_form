<%-- 
    Document   : login_fomr
    Created on : 5 Απρ 2018, 3:27:50 πμ
    Author     : user
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Form</title>
    </head>
    <body>
        <h1>Please insert your Credentials</h1>

        <form:form 
            method="POST" 
            modelAttribute="user" 
            action="${pageContext.request.contextPath}/users/loginwelcome" >

            <form:label path="username">Username:</form:label>
            <form:errors path="username"/>
            <form:input path="username"/> 

            <form:label path="password">Password:</form:label>
            <form:errors path="password"/>
            <form:password path="password"/>

            <input type="submit" value="Log In">

        </form:form>

    </body>
</html>
