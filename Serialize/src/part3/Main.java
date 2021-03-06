package part3;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public void writeObject(ArrayList<Object> listAccount) throws IOException {
       
    	//Create FileOutputStream to write file
        FileOutputStream fos = new FileOutputStream("Serializable2.txt");
        //Create ObjectOutputStream to write object
        ObjectOutputStream objOutputStream = new ObjectOutputStream(fos);
        //Write object to file
        for (Object obj : listAccount) {

            objOutputStream.writeObject(obj);
            objOutputStream.reset();
        }
        objOutputStream.close();
    }

    public ArrayList<Account> readObject() throws ClassNotFoundException, IOException {
        ArrayList<Account> listAccount = new ArrayList();
        //Create new FileInputStream object to read file
        FileInputStream fis = new FileInputStream("Serializable2.txt");
        //Create new ObjectInputStream object to read object from file
        ObjectInputStream obj = new ObjectInputStream(fis);
        try {
            while (fis.available() != -1) {
                //Read object from file
                Account acc = (Account) obj.readObject();
                listAccount.add(acc);
            }
        } catch (EOFException ex) {
            //ex.printStackTrace();
        }
        return listAccount;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            // TODO code application logic here
            ArrayList<Object> listAcc = new ArrayList<Object>();
            listAcc.add(new Account(1, "John", 1000));
            listAcc.add(new Account(2, "Smith", 2000));
            listAcc.add(new Account(3, "Tom", 3000));
            Main main = new Main();
            main.writeObject(listAcc);
            ArrayList<Account> listAccount = main.readObject();
            System.out.println("listisze:" + listAccount.size());
            if (listAccount.size() > 0) {
                for (Account account : listAccount) {
                    System.out.println(((Account) account).toString());
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}