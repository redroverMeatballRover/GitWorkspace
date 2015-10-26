package pack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Files {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File file = new File("test.txt");
		//file.exists();
		System.out.println(file.exists());
//		for (String path : file.list())
//		{
//			//create your own file looker thingy
//			System.out.println(path);
//		}
		
		FileReader input = new FileReader(file);
		BufferedReader buffer = new BufferedReader(input);
		buffer.readLine();
		
		String line = "";
		//while(line != null) same
			while (buffer.ready())
		{
			line = buffer.readLine();
			System.out.println(line);
		
		}
		try {
			input = new FileReader(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//char[] data = new char[200];
//		try {
//			input.read(data);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		for (char c : data)
//		{
//			System.out.println(c);
//		}
		
	}

}
