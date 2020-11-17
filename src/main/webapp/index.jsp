<%-- 
    Document   : index
    Created on : 17 Nov 2020, 17:20:32
    Author     : Ruchi Devi <https://github.com/Ruchi992>
--%>

<html>
    <head>
        <LINK REL=STYLESHEET HREF="assets/css/style.css" TYPE="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>	
    </head>
    <body>
        <form name="getSalesStockByID" action="SalesStockDrillDown">
            
            Enter Motor Price  <input type="text" name="id" value="" /> <input type="submit" value="Get motor" name="btn1" />
        </form>
         <form name="stock" action="stock">
             <br><br> 
           <input type="submit" value="Get All Price" name="btn2" />
           <br>
        </form>
    </body>
</html>