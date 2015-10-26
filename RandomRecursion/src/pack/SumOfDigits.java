package pack;

import java.util.Scanner;

public class SumOfDigits {

//	public class DigitExtractor{  
		int toBeBroken;  
		/** 
		Constructs a digit extractor that gets the digits in reverse order. 
		@param anInteger - the integer to break up into digits 
		*/  
		public SumOfDigits(int anInteger){  
		toBeBroken = anInteger;  
		}  
		/** 
		Returns the next digit to be extracted. 
		@return the next digit 
		*/  
		public int nextDigit(){  
		int temp = -1;  
		if(toBeBroken!=0)  
		{  
		temp = toBeBroken % 10;  
		toBeBroken = toBeBroken / 10;  
		}  
		else  
		{  
		System.out.println("No more digits to extract");  
		}  
		return temp;  
		}  
}
