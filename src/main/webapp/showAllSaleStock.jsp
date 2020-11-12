<%-- 
    Document   : showAllSaleStock
    Created on : 11 Nov 2020, 12:42:54
    Author     : Ruchi Devi <https://github.com/Ruchi992>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<LINK REL=STYLESHEET HREF="assets/css/style.css" TYPE="text/css">

<html>
    <head><title>All Sales stock</title></head>

 s   <body>
        <h1>All Sales Stock</h1>
        <br><br>
        <table width='1000' border='2'>
            <tr>
                <td>Listing Number</td>
                <td>Year</td>
                <td>Reg</td>
                <td>Make</td>
                <td>Model</td>
                <td>Colour</td>
                <td>Description</td>
                <td>Buy Price</td>
                <td>List Price</td>
                <td>Odometer</td>
                <td>(KPH)</td>
                <td>Engine</td>
                <td>Fuel</td>
                <td>Transmission</td>
                <td>Body</td>
                <td>Isofix</td>
                <td>Motor Tax</td>
                <td>Previous Owners</td>
                <td>Sales Person</td>
                <td>Sales Person Phone</td>
                <td>Sales Person Email</td>
                <td>Sales Person Fax</td>
                <td>Last Previous Owners Name</td>
                <td>Last Previous Owner Address</td>
                <td>Last Previous Owner Phone</td>
                <td>Full Service History</td>
                <td> Note</td>
            </tr>
            <c:forEach items="${list}" var="anStock">
                <tr>
                    <td><a href="AccountDrillDown?id=${anStock.listingNumber}">${anStock.listingNumber}</a></td>
                    <td>${anStock.year}</td>
                    <td>${anStock.reg}</td>
                    <td>${anStock.make}</td>
                    <td>${anStock.model}</td>
                    <td>${anStock.colour}</td>
                    <td>${anStock.description}</td>
                    <td>${anStock.buyPrice}</td>
                    <td>${anStock.listPrice}</td>
                    <td>${anStock.odometerKPH}</td>
                    <td>${anStock.kph}</td>
                    <td>${anStock.engine}</td>
                    <td>${anStock.fuel}</td>
                    <td>${anStock.transmission}</td>
                    <td>${anStock.body}</td>
                    <td>${anStock.isofix}</td>
                    <td>${anStock.motorTax}</td>
                    <td>${anStock.previousOwners}</td>
                    <td>${anStock.salesPerson}</td>
                    <td>${anStock.salesPersonPhone}</td>
                    <td>${anStock.salesPersonEmail}</td>
                    <td>${anStock.salesPersonFax}</td>
                    <td>${anStock.lastPreviousOwnersName}</td>
                    <td>${anStock.lastPreviousOwnerAddress}</td>
                    <td>${anStock.lastPreviousOwnerPhone}</td>
                    <td>${anStock.fullServiceHistory}</td>
                    <td>${anStock.note}</td>



                    <c:choose> 
                        <c:when test="${anAccount.balance < 0}">
                            <td bgcolor=#FF0000><fmt:formatNumber value="${anAccount.balance}" type="currency" currencySymbol="&euro;" maxFractionDigits="2"/> 
                            </td>
                        </c:when> 
                        <c:otherwise>
                            <td><fmt:formatNumber value="${anAccount.balance}" type="currency" currencySymbol="&euro;" maxFractionDigits="2"/> 
                            </td>
                        </c:otherwise>     
                    </c:choose>        
                </tr>
            </c:forEach>  
        </table>


    </body>
</html>

