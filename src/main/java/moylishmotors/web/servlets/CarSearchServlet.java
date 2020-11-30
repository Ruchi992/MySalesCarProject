package moylishmotors.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import moylishmotors.repositories.CarTableDB;
import moylishmotors.repositories.FuelTableDB;

/**
 *
 * @author Ruchi Devi <https://github.com/Ruchi992>
 */
@WebServlet(name = "CarSearch", urlPatterns =
{
	"/CarSearch"
})
public class CarSearchServlet extends HttpServlet
{

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html;charset=UTF-8");
		int BuyPrice = 0;
		String address;

		try (PrintWriter out = response.getWriter())
		{
			address = "/search.jsp";
			System.out.println("This is it");

			try
			{

				List<String> model = CarTableDB.getModel();
				if (model == null)
				{
					model = new ArrayList();
				}
				request.setAttribute("model", model);
				System.out.println("moylishmotors.Search.processRequest() + model" + model);
				//storing favourite in session
				//String favourite =request.getParameter("favourite");
				//HttpSession session=request.getSession(); 
				//session.setAttribute("favourite", favourite);

				List<String> make = CarTableDB.getMake();

				if (make == null)
				{
					make = new ArrayList();
				}
				request.setAttribute("make", make);
				System.out.println("moylishmotors.Search.processRequest() +make" + make);

				List<String> year = CarTableDB.getYear();
				if (year == null)
				{
					year = new ArrayList();
				}
				request.setAttribute("year", year);

				List<String> colour = CarTableDB.getColour();
				if (colour == null)
				{
					colour = new ArrayList();
				}
				request.setAttribute("colour", colour);

				List<String> fuel = FuelTableDB.getFuelType();
				if (fuel == null)
				{
					fuel = new ArrayList();
				}
				request.setAttribute("fuel", fuel);
			}
			catch (Exception ex)
			{
				address = "/error.jsp";
				System.out.println(ex);
			}

			// list =StockDB.getStockByMakeAndBuyPrice( minprice, maxprice);
//                for(Properties p : list)
//                    System.out.println("GetAllProperties p: " + p.toString());
			//end catch
			RequestDispatcher dispatcher = request.getRequestDispatcher(address);
			dispatcher.forward(request, response);
		}
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
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
		return "Short description";
	}// </editor-fold>

}
