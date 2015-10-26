package pack;



// basically: regex can be seperated by (), and each one can be called 1,2,3,4 and so on
name can be m1.group(1);
name = m1.group(1);



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class GodTest {

	String name;
	int phoneNum;
	String email;
	String bDay;
	
	public GodTest(String name, int phoneNum, String email, String bDay)
	{
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
		this.bDay = bDay;	
	}	
	
	public GodTest(int i, int j, String string) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getbDay() {
		return bDay;
	}
	public void setbDay(String bDay) {
		this.bDay = bDay;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bDay == null) ? 0 : bDay.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + phoneNum;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Melo other = (Melo) obj;
		if (bDay == null) {
			if (other.bDay != null)
				return false;
		} else if (!bDay.equals(other.bDay))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNum != other.phoneNum)
			return false;
		return true;
	}
	
	
	public static void listStuff() throws IOException
	{
		
		FileReader fileRead = new FileReader("Contacts.csv");
		BufferedReader reader = new BufferedReader(fileRead);
		final ArrayList<String> list = new ArrayList<String>(50);

		String line = "";
		while (reader.ready()) {
			line = reader.readLine();
			// System.out.println(line);
			String[] split = line.split(",");
			
			for (String s : split) {
				list.add(s);
				// System.out.println("Split: " + s);
			}
		}
		
		Collections.sort(list);
		Iterator<String> it = list.iterator();
		
		while (it.hasNext())
		{
			Object element = it.next();
			System.out.println(element + "\n");
		}
	
	}
	
	
	public static void main(String[] args) throws IOException 
	{
		
	listStuff();	
		
	}

}
