package Bench;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MrFile {

    public String readTextFile(String fileName) 
    
    {
    String returnValue = "";
    FileReader file;
    String line = "";
    try {
        
    	file = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(file);
        
        while ((line = reader.readLine()) != null) 
        {
            returnValue += line + "\n";
        }
        
        
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found");
        } catch (IOException e) {
            throw new RuntimeException("IO Error occured");
        }
      
    return returnValue;
    }
}