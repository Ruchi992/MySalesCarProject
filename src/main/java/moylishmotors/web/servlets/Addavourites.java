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
import javax.servlet.http.HttpSession;
import moylishmotors.Car;
import moylishmotors.Favouritelist;
import moylishmotors.repositories.CarTableDB;
import moylishmotors.repositories.FavouriteDB;

/**
 *
 * @author Ruchi Devi <https://github.com/Ruchi992>
 */
@WebServlet(name = "Addavourites", urlPatterns =
{
	"/Addavourites"
})
public class Addavourites extends HttpServlet
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
		try
		{
			  HttpSession httpsession = request.getSession(false);
			  int listingNumber = Integer.parseInt(request.getParameter("listingNumber"));
			  int userId = 1; // TODO get userId from logged in user
			  System.out.println("moylishmotors.web.servlets.Addavourites.processRequest()" + listingNumber);
			  Favouritelist favourite = new Favouritelist();
			  favourite.setUserId(userId);
			  favourite.setListingNumber(listingNumber);
			  System.out.println("Favouite" + favourite);
			FavouriteDB.add(favourite);
			
			
			Car car = CarTableDB.getByLinstingNumber(listingNumber);
            
			address = "/favourite.jsp";
			request.setAttribute("car", car);
			System.out.println(" here ");
		}
		catch(Exception ex)
		{
			address = "/error.jsp";
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(address);
		dispatcher.forward(request, response);
	}
	// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
	/**
	 * Handles the HTTP <code>GET</code> method.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
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

