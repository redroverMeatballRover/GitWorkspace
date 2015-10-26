package pack;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionsRevisited2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
	
		File file  = new File("test.txt");
		
//		FileWriter writer = new FileWriter(file);
//		BufferedWriter buffer = new BufferedWriter(writer);
		
		FileWriter writer = null;
		BufferedWriter buffer = null;
		
		try
		{
			writer = new FileWriter(file, true);
			buffer = new BufferedWriter(writer);
			
			buffer.append("stuff");
			buffer.write("Testingstuff");
			buffer.write("Testingstuff");
			buffer.write("Testingstuff");
			buffer.write("Testingstuff");
			//buffer.flush();//to get rid of it
			//buffer.close();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally
		{
			buffer.close();
		}
		
	}

}
