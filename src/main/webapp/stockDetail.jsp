<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
    <head><title>Limerick Motor </title>
	<LINK REL=STYLESHEET HREF="assets/css/style.css" TYPE="text/css">
 </head>
    <body>
          <h1>Drill Down on ${salesstock.listingNumber}</h1>
        <table>
			<tr>
				<td>Image</td>
				<td>Year</td>
				<td>Registration</td>
				<td>Make</td>
				<td>Model</td>
				<td> Engine</td>
				<td>Body</td>
			</TR> 
			<c:forEach items="${list}" var="salesstock">
				<tr><td><img src="assets/Images/Thumbs/${salesstock.listingNumber}.JPG"></td>
			 <td>${salesstock.year}</td> 
            <td>${salesstock.reg}</td> 
            <td>${salesstock.make}</td>
            <td>${salesstock.model}</td>
			<td>${salesstock.engine}</td>
			<td>${salesstock.body}</td></TR>  
			</c:forEach>
        </table>
        
        <a href="index.jsp">Home</a>
      
    </body>
</html>
    </body>
</html>


