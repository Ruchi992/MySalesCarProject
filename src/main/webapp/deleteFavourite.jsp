<%-- 
    Document   : deleteFavourite
    Created on : 1 Dec 2020, 22:18:15
    Author     : Ruchi Devi <https://github.com/Ruchi992>
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<LINK REL=STYLESHEET HREF="/css/style.css" TYPE="text/css">



<html>
    <head><title>Lit Realty - Manage Properties</title>
    </head>
    <style>
      h1{  text-align: center;
         color: blue;
      }
    </style>

    <body>
        <h1>delete car</h1>
        <br><br>
    
        <c:if test = "${deleted == 1}"><p> car deleted</p></c:if>
        <c:if test = "${deleted != 1}"><p>It was not possible to delete the Favourite </p></c:if>
        
        <p><a href="/Addavourites?listingNumber=${car.listingNumber}">Return to properties list</a></p> 
		

    </body>
</html>
