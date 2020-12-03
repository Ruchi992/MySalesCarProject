<%-- 
    Document   : index
    Created on : 17 Nov 2020, 17:20:32
    Author     : Ruchi Devi <https://github.com/Ruchi992>
--%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<LINK REL=STYLESHEET HREF="assets/css/style.css" TYPE="text/css">
        <title>Moylish Motor</title>
	<h1> Welcome to the Moylish Motor's</h1>
	<p> Fill All the Search field According to the database then it will land you in search result page</p>
</head>
<body>
	<form method="get" action="CarSearchResults">
		<label>Enter the Model</label>
		<select name="model">
			<option value=""></option>                
			<c:forEach  items="${model}" var="m">
                <option value="${m}">${m}</option>
			</c:forEach>
		</select>
		<label> Make</label>
		<select name="make">
			<option value=""></option>
			<c:forEach items="${make}" var="mk">
				<option value="${mk}">${mk}</option>
			</c:forEach>
		</select>
		<label> Year</label>
		<select name="year">
			<option value=""></option>
			<c:forEach items="${year}" var="yr">
				<option value="${yr}">${yr}</option>
			</c:forEach>
		</select>
		<label> Colour</label>
		<select name="colour">
			<option value=""></option>
			<c:forEach items="${colour}" var="cl">
				<option value="${cl}">${cl}</option>
			</c:forEach>
		</select> 
		<label> Fuel Type</label>
		<select name="fuel">
			<option value=""></option>
			<c:forEach items="${fuel}" var="fl">
				<option value="${fl}">${fl}</option>
			</c:forEach>
		</select>

		

		<button type="submit">Search</button>
	</form>
	<form name="stock" action="stock">
	</form>          


	<c:forEach items="${list}" var="mrk">
	<tr>
		<td><a href="SalesStockDrillDown?listingNumber=${mrk.id}"><img src ="assets/Images/Thumbs/${mrk.listingNumber}"/></a></td>
		<td>${mrk.fuel}, ${mrk.price}</td>                  



	</tr>
</c:forEach> 



</body>
</html>