package code.net;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import edu.neumont.servlet.*;

public class Server implements Runnable{

	public static Socket socket;
	public static int PORT = 8000;
	public boolean running = false;
	MyHttpRequest req = new MyHttpRequest();
	MyHttpResponse res = new MyHttpResponse();
	MyHttpHandler handle = new MyHttpHandler();
		
	public Server(Socket socket)
	{
		this.socket = socket;
	}
	
	public static void main(String[] args) 
	{
		try
		{
			ServerSocket serversocket = new ServerSocket(PORT);
			while(true)
			{
				Server server = new Server(serversocket.accept());
				//HttpServer httpserver = HttpServer.create(new InetSocketAddress(8000), 0);
				if(true) {System.out.println("OPENED CONNECTION -- PORT " + PORT);}
				Thread threadRunner = new Thread(server);
				threadRunner.start();
			}
		}
		catch(IOException e)
		{
			System.err.println("Server error: " + e);
		}
		finally 
		{
//			server.close();
//			serversocket.close(); //this closes????
		}
	}

	@Override
	public void run() 
	{
		BufferedReader in = null;
	    PrintWriter out = null;
	    OutputStream outToBrowser = null;
	    
		try 
		{
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		    out = new PrintWriter(socket.getOutputStream());		  
		    String input = in.readLine();
		    
		    if(input.equals("GET / HTTP/1.1"))
		    {
		    	out.println("FUCKING WORKING");
		    	out.println("SATAN");
		    	
		    }
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			out.flush();
			out.close();
			//outToBrowser.close();
			//socket.close();
			//serversocket.close();
		}
		
	}
	
}
