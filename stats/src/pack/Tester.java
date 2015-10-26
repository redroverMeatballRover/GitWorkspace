package pack;

/** 
 * @Natalie Watts
 * Neumont University
 * This class is written to test the methods in the IntegerSet class.
 * */
 public class Tester
{
    //This method creates a set and prints it out
    public static void testSetCreation()
    {
        IntegerSet firstSet = new IntegerSet("A", 10);
        firstSet.add(6);
        firstSet.add(9);
        firstSet.add(11);
        firstSet.displaySet();
    }

    //This method creates a set and checks two different values to see if they are in the set
    public static void testContains()
    {
        IntegerSet firstSet = new IntegerSet("A", 10);
        firstSet.add(6);
        firstSet.add(9);
        firstSet.add(11);
        firstSet.displaySet();

        boolean fiveInSet = firstSet.contains(5);
        boolean sixInSet = firstSet.contains(6);

        if(fiveInSet)
            System.out.println("5 is in Set " + firstSet.getName()  );
        else
            System.out.println("5 is not in Set " + firstSet.getName() );
        System.out.println("5 should not be in the set\n");

        if(sixInSet)
            System.out.println("6 is in Set " + firstSet.getName() );
        else
            System.out.println("6 is not in Set " + firstSet.getName());
        System.out.println("6 should be in the set\n");
    }
    
    // This method creates 2 sets and checks if the first is a subset of the second.
    // The first set should not be a subset of the second
    public static void subsetTest1()
    {
        IntegerSet firstSet = new IntegerSet("A", 10);
        firstSet.add(6);
        firstSet.add(9);
        firstSet.add(11);
        firstSet.displaySet();

        IntegerSet secondSet = new IntegerSet("B", 10);
        secondSet.add(10);
        secondSet.add(14);
        secondSet.add(19);
        secondSet.displaySet();

        boolean subset = firstSet.isSubset(secondSet);
        if(subset)
            System.out.println("Set " + firstSet.getName() + " is a subset of " + secondSet.getName());
        else
            System.out.println("Set " + firstSet.getName() + " is not a subset of " + secondSet.getName());
        System.out.println("This should not be a subset\n");
    }
    
    // This method creates 2 sets and checks if the first is a subset of the second.
    // The first set should be a subset of the second
    public static void subsetTest2()
    {
        IntegerSet firstSet = new IntegerSet("A", 10);
        firstSet.add(3);
        firstSet.add(7);
        firstSet.displaySet();

        IntegerSet secondSet = new IntegerSet("B", 10);
        secondSet.add(3);
        secondSet.add(7);
        secondSet.add(77);
        secondSet.displaySet();

        boolean subset = firstSet.isSubset(secondSet);
        if(subset)
        {
            System.out.println("Set " + firstSet.getName() + " is a subset of " + secondSet.getName());
        System.out.println(subset);
        }
        else
        {
        	System.out.println(subset);
            System.out.println("Set " + firstSet.getName() + " is not a subset of " + secondSet.getName());
        System.out.println("This should  be a subset \n");
        }
    }
    
    // This method creates 2 sets and checks if the first is a subset of the second.
    // Although the second set is a subset of the first, the value returned should be false because
    // The first set should not be a subset of the second
    public static void subsetTest3()
    {
        IntegerSet firstSet = new IntegerSet("A", 10);
        firstSet.add(15);
        firstSet.add(31);
        firstSet.add(60);
        firstSet.displaySet();

        IntegerSet secondSet = new IntegerSet("B", 10);
        secondSet.add(60);
        secondSet.add(15);
        secondSet.displaySet();

        boolean subset = firstSet.isSubset(secondSet);
        if(subset)
            System.out.println("Set " + firstSet.getName() + " is a subset of " + secondSet.getName());
        else
            System.out.println("Set " + firstSet.getName() + " is not a subset of " + secondSet.getName());
        System.out.println("This should not be a subset \n");
    }
    // This method creates 2 sets and calls the method that unions them. It creates a new variable 
    // that will reference the IntegerSet returned and calls a method to display it
    public static void testUnion()
    {
        IntegerSet firstSet = new IntegerSet("A", 10);
        firstSet.add(6);
        firstSet.add(9);
        firstSet.add(11);
        firstSet.displaySet();

        IntegerSet secondSet = new IntegerSet("B", 10);
        secondSet.add(10);
        secondSet.add(14);
        secondSet.add(19);
        secondSet.displaySet();

        IntegerSet intersectingSet = firstSet.union(secondSet);
        System.out.println("The union of " + firstSet.getName() + " and " + secondSet.getName() + " is:");
        intersectingSet.displaySet();
    }
    // This method creates 2 sets and calls the method that intersects them. It creates a new variable 
    // that will reference the IntegerSet returned and calls a method to display it
    public static void testIntersection()
    {
        IntegerSet firstSet = new IntegerSet("A",10);
        firstSet.add(6);
        firstSet.add(9);
        firstSet.add(11);
        firstSet.displaySet();

        IntegerSet secondSet = new IntegerSet("B",10);
        secondSet.add(10);
        secondSet.add(6);
        secondSet.add(19);
        secondSet.displaySet();

        IntegerSet intersectingSet = firstSet.intersect(secondSet);
        System.out.println("The intersection of " + firstSet.getName() + " and " + secondSet.getName() + " is:");
        intersectingSet.displaySet();
    }

    // You may uncomment and comment these method calls to test the methods you are writing in the
    // IntegerSet class.
    public static void main(String[]args)
    {
        //Part A
//        Tester.testSetCreation();
//        Tester.testContains();
        
        //Part B
        Tester.subsetTest1();
        Tester.subsetTest2();
        Tester.subsetTest3();
//        Tester.testUnion();
//        Tester.testIntersection();
    }
}