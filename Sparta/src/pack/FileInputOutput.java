package pack;

import java.awt.event.InputEvent;
import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputOutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File file = new File("testy.txt");
		try {
			FileInputStream fs = new FileInputStream(file);
			int data = 0; 
			//String d;
			while (data!= -1)
			{
				//data = InputEvent.read();
				//data = inputRead.re
				
				System.out.println(data);
			}
		} 
		catch (IOException e) {
			System.out.println("file not found!");
		}

	}

}
