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
			</tr> 
			<tr>
				<td>
					<a href="CarDetails?listingNumber=${car.listingNumber}">
						<img src="assets/Images/Thumbs/${car.listingNumber}.JPG">
					</a>
				</td>
				<td>${car.year}</td> 
				<td>${car.reg}</td> 
				<td>${car.make}</td>
				<td>${car.model}</td>
				<td>${car.engine}</td>
				<td>${car.body}</td> 
				<td>${car.fuel}</td>
			</tr>
        </table>
	</body>
</html>
</body>
</html>


