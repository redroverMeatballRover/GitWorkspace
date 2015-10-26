package test.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static String ITEM1_JSP = "/Item1.jsp";
	private static String ITEM2_JSP = "/Item2.jsp";
	private static String SHOWALL_JSP = "/ShowAll.jsp";
  
	
	
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward = "";
		
		
		// Get a map of the request parameters
	    Map parameters = request.getParameterMap();
	    
	    if (parameters.containsKey("item1"))
	      forward = ITEM1_JSP;
	    else if (parameters.containsKey("item2"))
	      forward = ITEM2_JSP;
	    else     
	      forward = SHOWALL_JSP;
	
	    RequestDispatcher view = request.getRequestDispatcher(forward);
	    view.forward(request, response);
	}
}
