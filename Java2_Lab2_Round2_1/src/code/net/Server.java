package code.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import edu.neumont.servlet.*;

public class Server implements HttpRequest, HttpResponse, HttpHandler {
	
	private static final String CONTENT_TYPE = "text/html; charset=windows-1252";
	
	public static void main(String[] args) throws IOException {
		
		//Client asks(REQUESTS) for ITEM page - so if request = request URL, SERVER responds with that 
		//HTML Response.
		//server responds with a header (which contains the HTML)	
		 		
		Server server = new Server(); // do not support HTTP - use TCP
		ServerSocket serversocket = new ServerSocket(8080);
		Socket socket = serversocket.accept();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		String line = bufferedReader.readLine();
		System.out.println(line);
		
		
		
		if(line.equals("GET / HTTP/1.1"))
		{
			System.out.println("WORKS!!");
			//doGet(request, response);
		}
		
		OutputStream out = socket.getOutputStream();
		PrintWriter pw = new PrintWriter(out, true);
		
		//finally {
		out.flush();
		out.close();
		socket.close();
		serversocket.close();
		//}
	}

	//need run method
	// while loop = 
	
	//split the GET request from the browser
//	if the URI looks like get/lab2/item HTTP/1.1 ... then do this
	
	
	@Override
	public void doGet(HttpRequest request, HttpResponse response) 
	{
		//neede to parse the http request
		// A: implement HTTP itself
		
		
		String id_value = request.getUri();
		
		String var0show = "";
		try 
		{
			var0show = request.getUri();
			System.out.println("Here is var0show: " + var0show);
		}
		catch(Exception e) {}
		
		//response
		finally {
			response.getContentType();
			PrintWriter pw = response.getWriter();
			pw.println("<html><body>");
			pw.println("<h1>Auction Item #1234</h1>");
			//pw.println("<img width="200" src="http://localhost:8080/lab2/image"/>");
			pw.println("<dl><dt>Current Bid:</dt><dd>$1.00</dd><dt>Time Left</dt><dd>2 Days</dd><dt><input/></dt><dd><input type='submit' value='Place a bid'/></dd></dl>");
			pw.println("</body></html>");
			pw.close();
		}
	}

	@Override
	public int getStatusCode() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setStatusCode(int code) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getContentType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setContentType(String contentType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public OutputStream getOutputStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getUri() {
		return null;
	}

	
//	private MyHttpResponse response()
//	{
//		response.getContentType();
//		PrintWriter pw = response.getWriter();
//		pw.println("<html><body>");
//		pw.println("<h1>Auction Item #1234</h1>");
//		//pw.println("<img width="200" src="http://localhost:8080/lab2/image"/>");
//		pw.println("<dl><dt>Current Bid:</dt><dd>$1.00</dd><dt>Time Left</dt><dd>2 Days</dd><dt><input/></dt><dd><input type='submit' value='Place a bid'/></dd></dl>");
//		pw.println("</body></html>");
//		pw.close();
//		return 
//	}
	
	
}

//you will enhance the server class you created to read 
//in an entire HTTP request, interpret it and generate a 
//complete HTTP response that the browser will accept 
//and render the resulting HTML.


//The workflow is as follows:
//1.	The server has a ServerSocket and gets a new Socket from 
//		a new connection.
//2.	The server instantiates an HttpRequest and HttpResponse 
//		based on the socket input and output streams
//3.	The server invokes HttpHandler.doGet(request, response) 
//		which contains the application-specific logic 
//		(writing the requested HTML page or image to the 
//		output stream).

//At a minimum, the HTML returned should be:
//<html>
//    <body>
//        <h1>Auction Item #1234</h1>
//        <img width="200" src="http://localhost:8080/lab2/image"/>
//        <dl>
//            <dt>Current Bid:</dt>
//            <dd>$1.00</dd>
//            <dt>Time Left</dt>
//            <dd>2 Days</dd>
//            <dt>
//                <input/>
//            </dt>
//            <dd>
//                <input type="submit" value="Place a bid"/>
//            </dd>
//        </dl>
//    </body>
//</html>



