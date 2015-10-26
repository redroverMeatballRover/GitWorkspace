import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class GoogleClass {

	public static void main(String[] args) {
		try (Socket s = new Socket("google.com", 80))
		{
			PrintWriter pw = new PrintWriter (s.getOutputStream(), true);
			BufferedReader Br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
