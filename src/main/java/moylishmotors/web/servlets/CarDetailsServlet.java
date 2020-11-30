package moylishmotors.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import moylishmotors.repositories.CarTableDB;
import moylishmotors.Cartable;
import moylishmotors.Lastpreviousowners;
import moylishmotors.Salespeople;
import moylishmotors.Salespeoplelisting;
import moylishmotors.repositories.SalesPeopleDB;
import moylishmotors.repositories.SalespeoplelistingDB;
import moylishmotors.repositories.LastpreviousowersDB;
/**
 *
 * @author Ruchi Devi <https://github.com/Ruchi992>
 */
@WebServlet(name = "CarDetails", urlPatterns =
{
	"/CarDetails"
})
public class CarDetailsServlet extends HttpServlet
{
    private final String idKey = "id";
	private final String imageDirectory = "images/large/";
	private final String thumbDirectory = "images/large/";

	/**
	 * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
	 * methods.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html;charset=UTF-8");
		String idString = request.getParameter(idKey);
		String address = "/carDetails.jsp";
         int requestId =0;
		try
		{
		
			int listingNumber = Integer.parseInt(request.getParameter("listingNumber"));
			
			
			HttpSession session = request.getSession();
			session.setAttribute("requestId", requestId);
			  Cartable car = CarTableDB.getByLinstingNumber(listingNumber);
			
			request.setAttribute("car", car);
			//request.setAttribute("propertytypes", pt);
			Salespeoplelisting listing = SalespeoplelistingDB.getByLinstingNumber(listingNumber);
			Salespeople salesPerson = SalesPeopleDB.getByEmail(listing.getSalesPersonEmail());
			request.setAttribute("salesPerson", salesPerson);
			Lastpreviousowners listed = LastpreviousowersDB.getByLinstingNumber(listingNumber);
			Lastpreviousowners previousowner = LastpreviousowersDB.getByName(listed.getLastPreviousOwnersName());
			request.setAttribute("previousowner", previousowner);
		}
		catch (NumberFormatException ex)
		{
//				address = "/error.jsp";
//				ex.printStackTrace();
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
		return "Car Details";
	}// </editor-fold>

}
