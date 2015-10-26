package test;

import java.util.*;

public class ComparableDemo{

    @SuppressWarnings("unchecked")
	public static void main(String[] args) {

        List ts1 = new ArrayList();
        ts1.add(new Employee ("Tom",40000.00, 5));
        ts1.add(new Employee ("Harry",20000.00, 3));
        ts1.add(new Employee ("Maggie",50000.00, 20));
        ts1.add(new Employee ("Chris",70000.00, 40));
        Collections.sort(ts1);
        Iterator itr = ts1.iterator();

        while(itr.hasNext()){
            Object element = itr.next();
            System.out.println(element + "\n");
            
        }

    }
}