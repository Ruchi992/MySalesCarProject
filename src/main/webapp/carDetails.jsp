<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
    <head><title>Limerick Motor </title>
		<LINK REL=STYLESHEET HREF="assets/css/style.css" TYPE="text/css">
	</head>
    <body>
		<a href="index.jsp">Home</a>
		<h1>${car.listingNumber} Details</h1>
        <table>
			<tr>
				<td>Image</td>
				<td>Year</td>
				<td>Registration</td>
				<td>Make</td>
				<td>Model</td>
				<td> Engine</td>
				<td>Body</td>
				<td> Fuel</td>
				<td> Transmission</td>
			</tr> 
			<tr>
				<td>
					<c:forEach items="${images}" var="image">
				    <img src="/moylishmotors/${image}" width="150" height="100" />
			    </div>
		     </c:forEach>
				<img src="assets/Images/Thumbs/${car.listingNumber}.JPG">
				
				</td>
				<td>${car.year}</td> 
				<td>${car.reg}</td> 
				<td>${car.make}</td>
				<td>${car.model}</td>
				<td>${car.engine}</td>
				<td>${car.body}</td>
				<td> ${car.fuel}</td>
				<td> ${car.transmission}</td>
				</tr>
        </table>
				 <table width='1000' border='1'>
            <tr>
               <td>Sales Person</td>
                <td>Sales Person Phone</td>
                <td>Sales Person Email</td>
                <td>Sales Person Fax</td> 
			</tr>
          
							
                <tr>
					 <td>${salesPerson.salesPerson}</td>
                     <td>${salesPerson.salesPersonPhone}</td>
                    <td>${salesPerson.salesPersonEmail}</td>
                    <td>${salesPerson.salesPersonFax}</td>
                  </tr>
				  
				  ${previousowner.listingNumber}
				 ${previousowner.lastPreviousOwnersName}
				 ${previousowner.lastPreviousOwnerAddress}
				 ${previousowner.lastPreviousOwnerPhone}
				 ${previousowner.fullServiceHistory}
				  
        </table>
	</body>
</html>
</body>
</html>

