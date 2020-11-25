<%-- 
    Document   : index
    Created on : 17 Nov 2020, 17:20:32
    Author     : Ruchi Devi <https://github.com/Ruchi992>
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<LINK REL=STYLESHEET HREF="assets/css/style.css" TYPE="text/css">
        <title>Moylish Motor</title>
	<h1> Welcome to the Moylish Motor's</h1>
    </head>
    <body>
        <form name="getSalesStockByID" action="SalesStockDrillDown">
            
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
            
            <label>favourites</label>
            <select name="favourites">
                <option value=""></option>                
                
            </select>

            <button type="submit">Search</button>
        </form>
            <form name="stock" action="stock">
			 
             <br><br> 
           <input type="submit" value="Get All Price" name="btn2" />
           <br>
		           <a href="people.jsp">List of people</a>

        </form>
		  <form name="Search" action="Search">
			 
             <br><br> 
           <input type="submit" value="Search Page" name="btn2" />
           <br>	           

        </form> 
		<form name="People" action="People">
			 
             <br><br> 
           <input type="submit" value="People Page" name="btn2" />
           <br>	           

        </form> 
          
            
            <c:forEach items="${list}" var="mk">
                <tr>
                    <td><a href="SalesStockDrillDown?=${mk.stockId}"><img src="images//thumbs/${mk.make}"/></a></td>
                    <td>${mk.model}, ${mk.year}</td>                  
                    
                    <td>${mk.colour}</td>
                            
                </tr>
            </c:forEach>  
		 
            
         
    </body>
</html>