package pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

import javax.servlet.AsyncContext;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

public class AuctionServlet extends HttpServlet{

	
	@webServelet"/item/*"
	public void doGet(HttpServletRequest request, hrrpservletresponse response,)
	{
		//this is the controller
		System.out.println(request.getRequestURI());
		
		//we need to retrieve the model
		
		//and provide it to the view
		try {
		response.getWrite().append("<h1>Hello world</h1>");
		}
		catch {
			throw new ServeletException(e);
		}
	}
	
}
