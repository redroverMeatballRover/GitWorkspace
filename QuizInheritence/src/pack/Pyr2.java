package pack;

import pack3.Advice;
import pack3.Thought;

public class Pyr2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//public class Leadership extends SocialSciences {
//	
//	private int presentations;
//	
//	public Leadership(int classNumber, String titleName,
//			String descriptionCourse, String departmentTeach, int homeworkLoad,
//			int numBooks, int discusNum, int journalNum, String focusClass, int presNum) {
//		
//		super(classNumber, titleName, descriptionCourse, departmentTeach, homeworkLoad,
//				numBooks, discusNum, journalNum, focusClass);
//		
//		presentations = presNum;
//
//	}
//	//PROBLEM SOLVING-------------------------------------------------------//
//	public void problemSolving()
//	{
//		System.out.println("This class focuses a lot on problem solving.");
//	}
//	
//	//GETTERS AND SETTERS--------------------------------------------------//
//	public void setPres(int presNum)
//	{
//		presentations = presNum;
//	}
//	//GET PAGE
//	public int getPres()
//	{
//		return presentations;
//	}
//	






////********************************************************************
////Messages.java       Java Foundations
////
////Demonstrates the use of an overridden method.
////********************************************************************
//
//public class Messages
//{
////-----------------------------------------------------------------
////Creates two objects and invokes the message method in each.
////-----------------------------------------------------------------
//public static void main (String[] args)
//{
//Thought parked = new Thought();
//Advice dates = new Advice();
//
//parked.message();
//
//dates.message();  // overridden
//}
//}


////********************************************************************
////Thought.java       Java Foundations
////
////Represents a stray thought. Used as the parent of a derived
////class to demonstrate the use of an overridden method.
////********************************************************************
//
//public class Thought
//{
////-----------------------------------------------------------------
////Prints a message.
////-----------------------------------------------------------------
//public void message()
//{
//System.out.println ("I feel like I'm diagonally parked in a " +
//                    "parallel universe.");
//
//System.out.println();
//}
//}


////********************************************************************
////Advice.java       Java Foundations
////
////Represents some thoughtful advice. Used to demonstrate the use
////of an overridden method.
////********************************************************************
//
//public class Advice extends Thought
//{
////-----------------------------------------------------------------
////Prints a message. This method overrides the parent's version.
////-----------------------------------------------------------------
//public void message()
//{
//System.out.println ("Warning: Dates in calendar are closer " +
//                    "than they appear.");
//
//System.out.println();
//
//super.message();  // explicitly invokes the parent's version
//}
//}

