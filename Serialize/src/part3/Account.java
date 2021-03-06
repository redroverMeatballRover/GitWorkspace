package part3;

import java.io.Serializable;

public class Account implements Serializable {

    private int accountNo;
    private String custName;
    private int balance;

    /** Creates a new instance of Account    */
    public Account(int accNo, String name, int bal) {
        this.accountNo = accNo;
        this.custName = name;
        this.balance = bal;
    }

    @Override
    public String toString() {
        String str = "Account No:" + this.accountNo;
        str += "\nCustomer name:" + this.custName;
        str += "\nBalance:" + this.balance;
        return str;
    }
}