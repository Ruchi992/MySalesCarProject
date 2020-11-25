<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
    <head><title>Limerick Motor </title>
 </head>
    <body>
          <h1>Drill Down on ${salesstock.listingNumber}</h1>
        <table  width='200' >
            <tr><td>Account ID</td><td>${salesstock.year}</td>  </TR>
            <tr><td>First Name</td><td>${salesstock.reg}</td>  </TR>
            <tr><td>Last Name</td><td>${salesstock.make}</td></TR>
            <tr><td>Sort Code</td><td>${salesstock.model}</td></TR>
            <tr><td>Balance</td><td>${salesstock.description}</td></TR>
        </table>
        
        <a href="index.jsp">Home</a>
      
    </body>
</html>
    </body>
</html>


