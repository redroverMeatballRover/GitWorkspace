

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	Hashtable users = new Hashtable();
	
	
	private static final long serialVersionUID = 1L;
       
//	public void init(ServletConfig config) throws ServletException {
//	    super.init(config);
//	    users.put("Wallace:cheese",     "allowed");
//	    users.put("Gromit:sheepnapper", "allowed");
//	    users.put("Penguin:evil",       "allowed");
//	  }
	
	
//    public Servlet1() {
//        super();
//        // TODO Auto-generated constructor stub
//    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out = response.getWriter();
//		
//		//get Auth header
//		String auth = request.getHeader("Authorization");
//		if(!allowUser(auth))
//		{
//			response.setHeader(("WWW-Authenticate", "BASIC realm=\"users\"");
//			response.sendError(arg0)
//		}
//		
//		<form method=post action="j_security_check" >
//		    <input type="text"  name= "j_username" >
//		    <input type="password"  name= "j_password" >
//	    </form>
//		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		RequestDispatcher rd = request.getRequestDispatcher(web-inf/jsp file);
		rd.forward(arg0, arg1);
		
		
	}

}
