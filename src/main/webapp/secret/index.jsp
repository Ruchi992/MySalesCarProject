<%-- 
    Document   : index
    Created on : 26 Nov 2020, 22:09:13
    Author     : Ruchi Devi <https://github.com/Ruchi992>
--%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h3>This is secret content</h3>
        <br>
		    <shiro:principal/>
        <h3>It should be visible to authenticated users only</h3> 
        <br>
       <a href="/moylishmotors/logout">Log Out</a>
    </body>
</html>
