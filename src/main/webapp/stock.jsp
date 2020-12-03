
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<LINK REL=STYLESHEET HREF="assets/css/style.css" TYPE="text/css">

<html>
    <head>
		<title> Display All Car Price</title>
	</head>
	<body>
        <h1>Display All Car Price</h1>
        <br><br>
		<form name="People" action="People">

		<br><br> 
		<input type="submit" value=" Get Lis Of People" name="btn2" />
		<br><br>
		</form>
		<form name="SaleCarServlet" action="SaleCarServlet">
          	<input type="submit" value=" SaleCar" name="btn2" />
			</br>

	</form>
        <table width='1000' border='1'>
            <tr>
                <td>Listing Number</td>
                 
                <td>Buy Price</td>
                <td>List Price</td>                
                <td>(KPH)</td>                
                <td>Isofix</td>
                <td>Motor Tax</td>
                <td> Note</td>
            </tr>
            <c:forEach items="${list}" var="item">
                <tr>
                    <td>${item.listingNumber}</td>
                     <td>${item.buyPrice}</td>
                    <td>${item.listPrice}</td>
                    <td>${item.kph}</td>
                     <td>${item.isofix}</td>
                    <td>${item.motorTax}</td>              
                     <td>${item.note}</td>
					
                   
                </tr>
            </c:forEach>
        </table>
    </body>
</html>