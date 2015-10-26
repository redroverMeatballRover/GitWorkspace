package Priority2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author cschaffer
 * 
 *         This program stores an bunch of tasks that make up a list. It uses an
 *         interface called priority that extends a getter and setter. This time
 *         it also calls a comparable object in order the order the chores in
 *         order of importance.
 */

public class PriorityDriver2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		List task = new ArrayList();
		task.add(new Task2("Stuff the classifieds into the ads", 2));
		task.add(new Task2("Unload the newspaper truck", 1));
		task.add(new Task2("Stuff the newspapers.", 3));
		task.add(new Task2("Get magazines", 4));
		task.add(new Task2("Deliver Newspapers", 5));
		//page 492 has a sorting algorithm in it
		Collections.sort(task);
		Iterator it = task.iterator();

		while (it.hasNext()) {
			Object element = it.next();
			System.out.println(element + "\n");

		}

	}
}

// ALSO WORKS

// Task2 t2 = new Task2("Should be second", 2);
// Task2 t1 = new Task2("Should be first",1);
// Task2 t3 = new Task2("Should be third", 3);
//
// t1.getPriority2();
// t2.getPriority2();
// t3.getPriority2();
//
// List tlist = new ArrayList();
// tlist.add(t3.getPriority2() + t3.getPriority2One());
// tlist.add(t2.getPriority2()+ t2.getPriority2One());
// tlist.add(t1.getPriority2() + t1.getPriority2One());
//
// Collections.sort(tlist);
// Iterator it = tlist.iterator();
//
// while(it.hasNext()){
// Object element = it.next();
// System.out.println(element + "\n");