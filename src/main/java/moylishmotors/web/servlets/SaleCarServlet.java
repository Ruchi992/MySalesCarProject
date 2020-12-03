/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moylishmotors.web.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import moylishmotors.Salesstock;
import moylishmotors.repositories.StockDB;

/**
 *
 * @author Ruchi Devi <https://github.com/Ruchi992>
 */
@WebServlet(name = "SaleCarServlet", urlPatterns =
{
	"/SaleCarServlet"
})
public class SaleCarServlet extends HttpServlet
{

	/**
	 * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
	 * methods.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		
	
		response.setContentType("text/html;charset=UTF-8");
		 String address;
               	
        
           try{ 
			   Salesstock carPrice = StockDB.getByLinstingNumber(Integer.parseInt(request.getParameter("listingNumber")));
			   if(carPrice.getBuyPrice() <= 50000){
			   System.out.println("carPrice" + carPrice);
			  address = "/checkCarPrice.jsp";
			request.setAttribute("CheckPrice", carPrice);
		   } 
			   else if( carPrice.getBuyPrice() == 15000){
				   address = "/Salecar.jsp";
			        request.setAttribute("SaleCar", carPrice);
                              }
         
		   }catch(NumberFormatException ex) {
             address = "/error.jsp";
        //
	  RequestDispatcher dispatcher = request.getRequestDispatcher(address);
        dispatcher.forward(request, response);
        }
	} 
	
@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		processRequest(request, response);
	}
	/**
	 * Handles the HTTP <code>POST</code> method.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		processRequest(request, response);
	}
	/**
	 * Returns a short description of the servlet.
	 *
	 * @return a String containing servlet description
	 */
	@Override
	public String getServletInfo()
	{
		return "Sales Stock Servlet";
	}
	// </editor-fold>
}

	