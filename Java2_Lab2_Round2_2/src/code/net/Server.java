package code.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import edu.neumont.servlet.*;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class Server //implements HttpRequest, HttpResponse, HttpHandler {
{
	
//	private Map<String, HttpHandler> handlers = new HashMap<String, HttpHandler>();
//	
//	public static void main(String[] args) 
//	{
//		Server server = new Server();
//        server.registerHandler(new MyHandlerImp());
//
//        while (true) {
//            // if request comes get input stream
//            server.handlerServerRequest(inputStream);
//        }
//	}
//
//	public void registerHandler(String path, HttpHandler handler) 
//	{
//       handlers.put(path, handler);
//	}
//
//	
//	public void handleServerRequest(InputStream is) {
//        // parse the input stream
//        String path = ""; // get from stream
//        String requestType = ""; // get from stream
//        HttpHandler handler = handlers.get(path);
//        HttpRequest request = new HttpRequest();
//        // set request properties.
//        HttpResponse response = new HttpResponse();
//        if ("GET".equals(requestType)) 
//        {
//            handler.doGet(request, response);
//        } 
//        else if ("POST".equals(requestType)) 
//        {
//            handler.doPost(request, response);
//        } 
//        else 
//        {
//           // throws new BadRequestException(..);
//        }
//    }
	
	
	
	
	//OTHER CODE EXAMPLE
	//--------------------------------------------------------------------------//
	
	@SuppressWarnings("restriction")
	public static void main(String[] args) throws Exception {
		HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/test", new MyHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
    }

    @SuppressWarnings("restriction")
	static class MyHandler implements HttpHandler {
        public void handle(HttpExchange t) throws IOException {
            String response = "This is the response";
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void run()
	{
		
	}
	
	
//	@Override
//	public void doGet(HttpRequest request, HttpResponse response) {
//		
//	}
//
//	@Override
//	public int getStatusCode() {
//		return 0;
//	}
//
//	@Override
//	public void setStatusCode(int code) {
//	}
//
//	@Override
//	public String getContentType() {
//		return null;
//	}
//
//	@Override
//	public void setContentType(String contentType) {
//	
//	}
//
//	@Override
//	public OutputStream getOutputStream() {
//		return null;
//	}
//
//	@Override
//	public void flush() throws IOException {
//		
//	}
//
//	@Override
//	public String getUri() {
//		return null;
//	}

}

































//public class Server implements HttpRequest, HttpResponse, HttpHandler {
//
//	
//	HttpRequest request = new HttpRequest();
//	HttpResponse response = new HttpResponse();
//	
//	ServerSocket serversocket;
//	Socket socket;
//	BufferedReader bufferedReader;
//	
//	
//	public static void main(String[] args) 
//	{
//		Server server = new Server();
//		
//		
//		
//		
//		
//	}
//
//	public void run()
//	{
//		
//	}
//	
//	
//	@Override
//	public void doGet(HttpRequest request, HttpResponse response) {
//		
//	}
//
//	@Override
//	public int getStatusCode() {
//		return 0;
//	}
//
//	@Override
//	public void setStatusCode(int code) {
//	}
//
//	@Override
//	public String getContentType() {
//		return null;
//	}
//
//	@Override
//	public void setContentType(String contentType) {
//	
//	}
//
//	@Override
//	public OutputStream getOutputStream() {
//		return null;
//	}
//
//	@Override
//	public void flush() throws IOException {
//		
//	}
//
//	@Override
//	public String getUri() {
//		return null;
//	}
//
//}
