<%-- 
    Document   : favourite
    Created on : 30 Nov 2020, 18:06:54
    Author     : Ruchi Devi <https://github.com/Ruchi992>
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<LINK REL=STYLESHEET HREF="assets/css/style.css" TYPE="text/css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Add Fav</h1>
		<script>
        $( document ).ready(function() {
         $('#delete').on('click', function () { 
                return confirm('Are you sure you want to delete this favourite?'); 
            });
       });
    </script>
        
		<table width='1000' border='1'>
			<tr>
               <td> Listing Number</td>
            </tr>
			
            
				<tr>
				<td>${car.listingNumber}</td>
				<td>${car.make}</td>
				<td>${car.model}</td>
			</tr>
			<td><a href="DeleteFavourite?listingNumber=${car.listingNumber}">Delete</a></td>
			
		</table>
	
    </body>
</html>
