package test;

public class Employee implements Comparable {

    int EmpID;
    String Ename;
    double Sal;
    int prior;
    static int i;

    public Employee() {
        EmpID = i++;
        Ename = "dont know";
        Sal = 0.0;
        prior = 0;
        
    }

    public Employee(String ename, double sal, int p) {
        EmpID = i++;
        Ename = ename;
        Sal = sal;
        prior = p;
    }

    public String toString() {
        return "EmpID " + EmpID + "\n" + "Ename " + Ename + "\n" + "Sal" + Sal + "Priority" + prior;
    }

//    public int compareTo(Object o1) {
//        if (this.Sal == ((Employee) o1).Sal)
//            return 0;
//        else if ((this.Sal) > ((Employee) o1).Sal)
//            return 1;
//        else
//            return -1;
//    }
    
    public int compareTo(Object Emp1) {
        if (this.prior == ((Employee) Emp1).prior)
            return 0;
        else if ((this.prior) > ((Employee) Emp1).prior)
            return 1;
        else
            return -1;
    }
}