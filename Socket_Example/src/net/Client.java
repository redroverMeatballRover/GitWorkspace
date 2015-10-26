package net;

import model.Box;

import java.io.*;
import java.net.Socket;

/**
 * User: Sean Yergensen
 */
public class Client {

	private Socket socket;

	public Client() throws IOException {
		this.socket = new Socket("localhost", 12345);
	}

	public static void main(String[] args) {
		try {
			new Client().startup();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void startup() throws IOException, ClassNotFoundException {
		ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(socket.getOutputStream()));
		int count = 1;

		Box box = new Box();
		box.addItem("Client Item " + count);
		out.writeObject(box);
		out.flush();
		count++;

		ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));
		Object object;
		while ((object = in.readObject()) != null) {
			box = (Box) object;
			box.addItem("Client Item " + count);
			out.writeObject(box);
			out.flush();
			count++;
		}

		box.printItems();

		this.socket.close();
	}
}





//package net;
//
//import model.Box;
//
//import java.io.*;
//import java.net.Socket;
//
///**
// * User: Sean Yergensen
// */
//public class Client {
//
//	private Socket socket;
//
//	public Client() throws IOException {
//		this.socket = new Socket("localhost", 12345);
//	}
//
//	public static void main(String[] args) {
//		try {
//			new Client().startup();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void startup() throws IOException, ClassNotFoundException {
//		ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(socket.getOutputStream()));
//		int count = 1;
//
//		Box box = new Box();
//		box.addItem("Client Item " + count);
//		out.writeObject(box);
//		out.flush();
//		count++;
//
//		ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));
//		Object object;
//		while ((object = in.readObject()) != null) {
//			box = (Box) object;
//			box.addItem("Client Item " + count);
//			out.writeObject(box);
//			out.flush();
//			count++;
//		}
//
//		box.printItems();
//
//		this.socket.close();
//	}
//}
