package pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{
	public static void main(String[] args) throws IOException 
	{
		ServerSocket ss = new ServerSocket(30000);
		Socket s = ss.accept();
		InputStream is = s.getInputStream();
		
		InputStreamReader reader = new InputStreamReader(is);
		BufferedReader readerBuff = new BufferedReader(reader);
		
		String stringFromClient = readerBuff.readLine();
		
		OutputStream oos = s.getOutputStream();
		PrintWriter pl = new PrintWriter(oos, true);
		 
		pl.println("Hello, " + stringFromClient + "!");
		oos.flush();
		oos.close();
	}
}


