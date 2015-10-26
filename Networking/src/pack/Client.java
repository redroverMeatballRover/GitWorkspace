package pack;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args)
	{
		try(Socket server = new Socket("localhost", 1234))
		{
			// listen for messages from server
			Thread listen = new Thread(new SocketListener(server, false));
			listen.start();
			
			Scanner scan = new Scanner(System.in);
			ObjectOutputStream out = new ObjectOutputStream(server.getOutputStream());
			
			while(Thread.currentThread().isInterrupted() == false)
			{
				Datagram data = new Datagram(scan.nextLine());
				
				try
				{
					out.writeObject(data);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
				
				if(data.getData() == null)
				{
					listen.interrupt();
					break;
				}
			}
			
			scan.close();
			out.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}