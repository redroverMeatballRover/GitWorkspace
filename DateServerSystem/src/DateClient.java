import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JOptionPane;


public class DateClient {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		String serverAddress = new String("0.0.0.0");
				
//				JOptionPane.showInputDialog("Enter IP Address of a machine that is\n" + "running the date service on port 9090:");
	        
			Socket s = new Socket(serverAddress, 9090);
	        BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
	        String answer = input.readLine();
	        System.out.println("this is the answer: " + answer);
//	        JOptionPane.showMessageDialog(null, answer);
	        System.exit(0);
		
	}

}
