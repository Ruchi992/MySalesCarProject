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
				<td> Fuel</td>
				<td>Odometer KPH</td>
				<td>Transmission</td>
				
			</tr> 
			<c:forEach items="${list}" var="salesstock">
				<td>
					<a href="CarDetails?listingNumber=${salesstock.listingNumber}">
						<img src="assets/Images/Thumbs/${salesstock.listingNumber}.JPG">
					</a>
				</td>
				<td>${salesstock.year}</td> 
				<td>${salesstock.reg}</td> 
				<td>${salesstock.make}</td>
				<td>${salesstock.model}</td>
				<td>${salesstock.engine}</td>
				<td>${salesstock.body}</td> 
				<td>${salesstock.fuel}</td>
				<td>${salesstock.odometerKPH}</td>
				<td>${salesstock.transmission}</td>
			</c:forEach>
        </table>
	<td><a href="SalesStockDrillDown?listingNumber=${salesstock.listingNumber}"><img src="assets/Images/Thumbs/${salesstock.listingNumber}.JPG"></a></td>
	<div class="SalesCar">
		${salesstock.fuel}                        
	</div> 


	<a href="index.jsp">Home</a>

</body>
</html>
</body>
</html>


