package Pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		
		// run this, sends to server
		Socket socket = new Socket("localhost", 1125);
		OutputStream os = socket.getOutputStream();
		
		PrintWriter pw = new PrintWriter(os, true);
		pw.println("Ping");

		
		//--------------------------------------------//
		//recieving PONG
		InputStream is = socket.getInputStream();
		InputStreamReader reader = new InputStreamReader(is);
		BufferedReader readerBuff = new BufferedReader(reader);
		
		System.out.println(readerBuff.readLine());
		//System.out.println("Here!");
	}

}
