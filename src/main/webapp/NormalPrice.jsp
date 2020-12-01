<%-- 
    Document   : NormalPrice
    Created on : 1 Dec 2020, 11:27:41
    Author     : Ruchi Devi <https://github.com/Ruchi992>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <c:forEach items="${list}" var="anStock">
		   <td>${anStock.buyPrice}</td>
                    <td>${anStock.listPrice}</td>
	   </c:foreach>
    </body>
</html>
