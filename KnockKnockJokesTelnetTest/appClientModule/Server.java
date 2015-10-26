import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

	public static void main(String[] args) throws IOException {
		try (ServerSocket s = new ServerSocket(80)) {
			
			PrintWriter pw = new PrintWriter();
			
		}
	}
	
//	public void runServer() throws IOException {
//		  ServerSocket ss = new ServerSocket(80);
//		  try {
//		    while (!shutdownRequested) {
//		      Socket s = ss.accept();
//		      try {
//		        processConnection(s);
//		      } finally {
//		        s.close();
//		      }
//		    }
//		  } finally {
//		    ss.close();
//		  }
//		}

}
