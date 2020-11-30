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
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Add Fav</h1>
        
		<table width='1000' border='1'>
			<tr>
               <td> Listing Number</td>
            </tr>
			
            <c:forEach items="${list}" var="fev">
				<tr>
				<td>${fev.listingNumber}</td>
			</tr>
			</c:forEach>
		</table>
	
    </body>
</html>
