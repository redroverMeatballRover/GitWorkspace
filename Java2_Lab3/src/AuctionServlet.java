

import java.io.IOException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuctionServlet
 */
@WebServlet("/Item")
public class AuctionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AuctionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String message = "Hello World";
//		request.setAttribute("message", message);
		request.getRequestDispatcher("/WebContent/WEB-INF/main.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void contextInitialized(ServletContextEvent arg0) 
	{
	    System.out.println("Servlet Context is initialized....");
	}
	
	public void contextDestroyed(ServletContextEvent arg0) 
	{
	    System.out.println("Servlet Context is destroyed....");
	}
	
	
	
}
