<%-- 
    Document   : people
    Created on : 18 Nov 2020, 13:47:04
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
		 <h1>Sales People list</h1>
        <br><br>		
        <table width='1000' border='1'>
            <tr>
               <td>Sales Person</td>
                <td>Sales Person Phone</td>
                <td>Sales Person Email</td>
                <td>Sales Person Fax</td> 
			</tr>
            <c:forEach items="${list}" var="person">
							
                <tr>
					 <td>${person.salesPerson}</td>
                     <td>${person.salesPersonPhone}</td>
                    <td>${person.salesPersonEmail}</td>
                    <td>${person.salesPersonFax}</td>
                  </tr>
            </c:forEach>
        </table>
    </body>
</html>
     
