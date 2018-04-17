<%-- 
    Document   : login_welcome
    Created on : 5 Απρ 2018, 4:57:22 πμ
    Author     : user
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>
        <h1>Welcome, ${loggedUser.name} ! Today is <%= new Date() %></h1>
    </body>
</html>
