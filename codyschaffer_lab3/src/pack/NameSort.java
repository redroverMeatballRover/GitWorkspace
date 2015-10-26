package pack;

import java.util.*;

public class NameSort {
    public static void main(String[] args) {
        Test2 nameArray[] = {
            new Test2("John", "Smith"),
            new Test2("Karl", "Ng"),
            new Test2("Jeff", "Smith"),
            new Test2("Tom", "Rich")
        };

        List<Test2> names = Arrays.asList(nameArray);
        Collections.sort(names);
        System.out.println(names);
    }
}