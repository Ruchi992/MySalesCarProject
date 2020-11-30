<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
    <head><title>Limerick Motor </title>
		<LINK REL=STYLESHEET HREF="assets/css/style.css" TYPE="text/css">
	</head>
	    <body>
	<style>
	div {
  padding-left: 700px;
  
   }
   p{
	   padding-top: 2px;
   }
   dt{
	   padding-left: 400px;
	   padding-top: 0px;
   }
   section{
	   padding-left: 700px;
	   
   }
   </style>
	

		<a href="index.jsp">Home</a>
		<h1>${car.listingNumber} Details</h1>
        			
			<section>		
		    <img src="assets/Images/Thumbs/${car.listingNumber}.JPG "style="width: 350px; height: 350px">
						
				<p>${car.year}</p> 
				<p>${car.reg}</p> 
				<p>${car.make}</p>
				<p>${car.model}</p>
				<p>${car.engine}</p>
				<p>${car.body}</p>
				<p> ${car.fuel}</p>
				<p> ${car.transmission}</p>
				</section>  
			
          
							
			<div>
				<img src="assets/Images/SalePeople/Bianca Davies.jpg ALIGN="LEFT">
				<p> Sales Person Details: ${salesPerson.salesPerson}</p>
				<p> Sales Person Phone number:   ${salesPerson.salesPersonPhone}</p>
				<p> ${salesPerson.salesPersonEmail}</p>
				<p>${salesPerson.salesPersonFax}</p>
			</div>
				  
				  <p> Previous owner of this car: 
				  <p> Listing Number:  ${previousowner.listingNumber}</p>
				  <p>  Previous Owners Name: ${previousowner.lastPreviousOwnersName}</p>
				  
				  <p> Address: ${previousowner.lastPreviousOwnerAddress}</p>
				  <p> Phone number: ${previousowner.lastPreviousOwnerPhone}</p>
				 <p> Service History: ${previousowner.fullServiceHistory}</p>
				  
        </table>
	</body>
</html>
</body>
</html>

