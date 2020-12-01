
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<LINK REL=STYLESHEET HREF="assets/css/style.css" TYPE="text/css">

<html>
    <head>
		<title>All Sales stock</title>
	</head>
	<body>
        <h1>All Sales Stock</h1>
        <br><br>
        <table width='1000' border='2'>
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