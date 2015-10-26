import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Test {

	//http://localhost:31415/http/question
	//http://localhost:31415/http/user/user1
	
	public static String currentUser = null;
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Starting Server...");
		ServerSocket listener = new ServerSocket(31415);
		
		try {
			PrintWriter out = null;
			BufferedReader in = null;
			
			boolean billabong = true;
			
			while(billabong)
			{
				Socket s = listener.accept();
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				out = new PrintWriter(s.getOutputStream(), true);
				String inputLine;
				String getNewLine;
//				String usernameURL = "GET http/user/user1 HTTP/1.1";
				
				
				inputLine = in.readLine();
				parseUserName(inputLine);
				String usernameURL = "GET http/user/" + currentUser + " HTTP/1.1";
				boolean going = true;
				
				while(going)
				{
					if (inputLine != null && inputLine.equals(usernameURL))
					{
						System.out.println("SUCCESS");
						System.out.println("CLIENT: " + inputLine);
						going = false;
					}
					else {
						going = false;
					}
				}
				out.flush();
				billabong = false;
			}
		}
		finally {
			listener.close();
		}
		
		
	}
	
	
//	http://localhost:31415/user/user1
	static void parseUserName(String input)
	{
		String[] paths = input.split("/");
		System.out.println("PATH 2 == " + paths[3]);
		
		String[] exes = paths[3].split(" ");
		currentUser = exes[0];
			
		System.out.println("current user " + currentUser);	    
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	System.out.println("Starting Server...");
//	ServerSocket listener = new ServerSocket(31415);
//	
//	try {
//		PrintWriter out = null;
//		BufferedReader in = null;
//		
//		while(true)
//		{
//			Socket s = listener.accept();
//			
//			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
//			out = new PrintWriter(s.getOutputStream(), true);
//
//			//http://localhost:31415/http/user/user1
//			//GET /http/user/ " + httpQuestionURL + "HTTP/1.1
//			
//			String inputLine;
//			
//			String parsedURL = null;
//			String getUserName = parsedURL;
////			String userName = getUserName.matches(".*[A-Za-z].*");
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			String weGotThisBefore = "GET /http/user/" + getUserName + " HTTP/1.1";
//			String getNewLine;
//			boolean going = true;
//			boolean stupid = true;
//			
//			while(going)
//			{
//				inputLine = in.readLine();
//				out.println(inputLine);
//				
//				
//				
////				http://localhost:31415/user/user1
//				//"[^GET][^ /http/][^/s]([A-Za-z0-9]*)[^ HTTP/1.1]"
//				
//				
//				while(stupid)
//				{
//					 String pattern = "([user1].*)";
//				     Pattern r = Pattern.compile(pattern);
//				     Matcher m = r.matcher(inputLine);
//				     if(m.find())
//				     {
//				    	 System.out.println("SECURED: " + m.group(1));
//				    	 stupid = false;
//				     }
//				}
//		
//				if (inputLine != null && inputLine.equals("user/user1 HTTP/1.1"))
//				{
//					System.out.println("CLIENT: " + inputLine);
////					out.println(inputLine);
//					going = false;
//				}
//				else {
//					
//					System.out.println("this is the inputline: " + inputLine);
//					System.out.println(weGotThisBefore);
//					
//					System.out.println("GOT SOMETHING ELSE");	
////					getNewLine = inputLine;
////					
////					if(getNewLine != "")
////					{
////						out.println(getNewLine);
////						System.out.println("SERVER: " + getNewLine);
////					}
////					else {
////						going = false;
////					}	
//					going = false;
//				}
//			}
//			out.flush();
//		}
//	}
//	finally {
//		listener.close();
//	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
