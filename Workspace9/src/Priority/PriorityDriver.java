package Priority;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author cschaffer
 * 
 *         This program stores an bunch of tasks that make up a list. It uses an
 *         interface called priority that extends a getter and setter.
 */

public class PriorityDriver {

	public static void main(String[] args) {

		// WORKS//
		Task task1 = new Task("Unload the newspaper truck"); // 1st priority
		Task task2 = new Task("Stuff the classifieds into the ads");// 2nd
		Task task3 = new Task("Stuff the newspapers.");//3rd
		Task task4 = new Task("Get magazines");//4th
		Task task5 = new Task("Deliver newspapers");//5th

		System.out.println(task1.getPriority());
		System.out.println(task2.getPriority());
		System.out.println(task3.getPriority());
		System.out.println(task4.getPriority());
		System.out.println(task5.getPriority());

		// ---------------------------------------------------------------------------------------------------------------
		// WORKS//
		// Task task = new Task(null);
		// List<Task> taskList = new ArrayList<Task>();
		//
		// taskList.add(new Task("Unload the newspaper truck"));
		// taskList.add(new Task("Stuff the classifieds into the ads"));
		// taskList.add(new Task("Stuff the newspapers."));
		// taskList.add(new Task("Get magazines"));
		// taskList.add(new Task("Deliver newspapers"));
		//
		// Iterator<Task> newIt = taskList.iterator();
		//
		// while(newIt.hasNext()){
		// Object element = newIt.next();
		// System.out.println(element + "\n");
		// }

		// -----------------------------------------------------------------------------------------------------------------
	
	}

}
