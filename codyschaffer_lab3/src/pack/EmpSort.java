//package pack;
//
//import java.util.*;
//public class EmpSort 
//
//	{
////    static final Comparator<Employee> SENIORITY_ORDER = new Comparator<Employee>() {
////            public int compare(Employee e1, Employee e2) 
////            {
////                return e2.hireDate().compareTo(e1.hireDate());
////            }
////    };
//    
//    static final Comparator<Employee> SENIORITY_ORDER = new Comparator<Employee>() {
//
//    	public int compare(Employee e1, Employee e2) 
//    	{
//    	int dateCmp = e2.hireDate().compareTo(e1.hireDate());
//    	if (dateCmp != 0)
//    	{
//    	return dateCmp;
//    	}
//
//    	return (e1.number() < e2.number() ? -1 : (e1.number() == e2.number() ? 0 : 1));
//    	}
//    	};
//
//    // Employee database
//    static final Collection<Employee> employees
//
//    public static void main(String[] args) {
//        List<Employee> e = new ArrayList<Employee>(employees);
//        Collections.sort(e, SENIORITY_ORDER);
//        System.out.println(e);
//    }
//}
//
