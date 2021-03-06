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
import moylishmotors.repositories.CarTableDB;
import moylishmotors.Car;
import moylishmotors.Salesstock;

/**
 *
 * @author Ruchi Devi <https://github.com/Ruchi992>
 */
@WebServlet(name = "CarSearchResults", urlPatterns =
{
	"/CarSearchResults"
})
public class CarSearchResultsServlet extends HttpServlet
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
		{
			int stockId = 0;

			String address = "/carsearchresults.jsp";
			Salesstock s = null;

			try
			{
				//Car car = CarTableDB.getMake(request.getParameter(toString()));
				System.out.println("StockDrillDowm try");
				String model = request.getParameter("model");
				String make = request.getParameter("make");
				String year = request.getParameter("year");
				String colour = request.getParameter("colour");
				String fuel = request.getParameter("fuel");
				

				List<Car> list = CarTableDB.Search(model, make, year, colour, fuel);
				request.setAttribute("list", list);

//				ArrayList<String> images = new ArrayList<>();
//				String path = ("images/large/" + s.getListingNumber());
//				File dir = new File(request.getServletContext().getRealPath(path));
//				for (String file : dir.list())
//				{
//					if (!file.equals("thumbs.db"))
//					{
//						images.add(path);
//					}
//				}
//				request.setAttribute("images", images);
			}
			catch (Exception ex)
			{
				address = "/error.jsp";
				ex.printStackTrace();
			}

//			if (s == null)
//			{
//				System.out.println("SalesStockDrillDowm : s null");
//
//				address = "/error.jsp";
//			}
			//request.setAttribute("propertytypes", pt);
			request.setAttribute("salesstock", s);
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
