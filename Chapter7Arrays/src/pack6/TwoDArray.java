package pack6;

import java.util.Arrays;

//********************************************************************
//TwoDArray.java       Java Foundations
//
//Demonstrates the use of a two-dimensional array.
//********************************************************************

public class TwoDArray
{
//-----------------------------------------------------------------
//  Creates a 2D array of integers, fills it with increasing
//  integer values, then prints them out.
//-----------------------------------------------------------------
public static void main (String[] args)
{
 AnInt[][] iArray = new AnInt[3][5];
 Arrays.toString(iArray);
 System.out.println(Arrays.toString(iArray));
 
 
 for (int i = 0; i< iArray.length; i++)
 {
	 for (int j = 0; j<iArray.length; j++)
	 {
		 	iArray[i][j] = new AnInt(100*i +j);
	 }
	 System.out.println(Arrays.deepToString(iArray));
 }
}
}


//int[][] table = new int[5][10];
//
//// Load the table with values
//for (int row=0; row < table.length; row++)
//   for (int col=0; col < table[row].length; col++)
//      table[row][col] = row * 10 + col;
//
//// Print the table
//for (int row=0; row < table.length; row++)
//{
//   for (int col=0; col < table[row].length; col++)
//      System.out.print (table[row][col] + "\t");
//   System.out.println();
//}