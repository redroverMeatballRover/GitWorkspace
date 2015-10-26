package Pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		
		//start this, listens for client
		ServerSocket ss = new ServerSocket(1125);
		Socket s = ss.accept();
		InputStream is = s.getInputStream();
		
		
		InputStreamReader reader = new InputStreamReader(is);
		BufferedReader readerBuff = new BufferedReader(reader);
		System.out.println(readerBuff.readLine());
		System.out.println("Here!");
		
		
		//sending PONG
		//-----------------------------------------------//
		OutputStream os = s.getOutputStream();
		PrintWriter pw = new PrintWriter(os, true);
		pw.println("PONG");	
	}
}
