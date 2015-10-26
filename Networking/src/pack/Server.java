package pack;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
	public static void main(String[] args)
	{
		try(ServerSocket server = new ServerSocket(1234))
		{
			// wait 15 seconds for a connection
			server.setSoTimeout(15000);
			System.out.println("Listening...");
			
			try(Socket client = server.accept())
			{
				// listen for messages from client
				Thread listen = new Thread(new SocketListener(client, true));
				listen.start();
				
				System.out.println("Client connected from: " + client.getInetAddress());
				
				// wait for listener to terminate
				listen.join();
			}
			catch (IOException | InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}



//bin
//java p/a/client.class
//java.exe
