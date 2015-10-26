package net.code;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SATANServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//Way 1 - super easy and not HTML
		//response.getWriter().println("Hello, !");

		
		//Way 2 - use printwriter to do html.
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>Hello, !</h1>");
		out.println("</body></html>");
			
		// Way 3 - IMPLICITLY grab the actual HTML file through the Servlet
		//htmlFile = HelloServlet.class.getResourceAsStream("HelloHTML.html");
	}
}
