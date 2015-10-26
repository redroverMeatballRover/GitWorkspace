package net;

import model.Box;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * User: Sean Yergensen
 */
public class Server {
	ServerSocket serverSocket;

	public Server() throws IOException {
		this.serverSocket = new ServerSocket(12345);
	}

	public static void main(String[] args) {
		try {
			new Server().startup();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void startup() throws IOException, ClassNotFoundException {
		Socket clientSocket = this.serverSocket.accept();

		ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(clientSocket.getInputStream()));
		int count = 1;

		Box box = (Box) in.readObject();
		ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(clientSocket.getOutputStream()));
		while (box != null) {
			if(box.getItems().size() >= Box.MAX_ITEMS) {
				// send null object to client to indicate termination
				out.writeObject(null);
				out.flush();
				break;
			}
			box.addItem("Server Item " + count);
			out.writeObject(box);
			out.flush();
			count++;

			box = (Box) in.readObject();
		}


		box.printItems();

		clientSocket.close();
		this.serverSocket.close();
	}
}












//
//
//
//package net;
//
//import model.Box;
//
//import java.io.*;
//import java.net.ServerSocket;
//import java.net.Socket;
//
///**
// * User: Sean Yergensen
// */
//public class Server {
//	ServerSocket serverSocket;
//
//	public Server() throws IOException {
//		this.serverSocket = new ServerSocket(12345);
//	}
//
//	public static void main(String[] args) {
//		try {
//			new Server().startup();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void startup() throws IOException, ClassNotFoundException {
//		Socket clientSocket = this.serverSocket.accept();
//
//		ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(clientSocket.getInputStream()));
//		int count = 1;
//
//		Box box = (Box) in.readObject();
//		ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(clientSocket.getOutputStream()));
//		while (box != null) {
//			if(box.getItems().size() >= Box.MAX_ITEMS) {
//				// send null object to client to indicate termination
//				out.writeObject(null);
//				out.flush();
//				break;
//			}
//			box.addItem("Server Item " + count);
//			out.writeObject(box);
//			out.flush();
//			count++;
//
//			box = (Box) in.readObject();
//		}
//
//
//		box.printItems();
//
//		clientSocket.close();
//		this.serverSocket.close();
//	}
//}