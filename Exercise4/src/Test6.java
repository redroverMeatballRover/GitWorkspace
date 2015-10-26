
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Test6 {

	public static class Contact implements Comparable<Contact>
	{
		public String name;
		public int phoneNum;
		public String email;
		public String birthday;
		
		
		public Contact(String name, int phoneNum, String email, String birthday)
		{
			this.name = name;
			this.phoneNum = phoneNum;
			this.email = email;
			this.birthday = birthday;
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

		public String getBirthday() {
			return birthday;
		}

		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((birthday == null) ? 0 : birthday.hashCode());
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
			Contact other = (Contact) obj;
			if (birthday == null) {
				if (other.birthday != null)
					return false;
			} else if (!birthday.equals(other.birthday))
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

		@Override
		public int compareTo(Contact o) 
		{
			return 0;
		}
		
		private static class Comp1Comparator implements Comparable<Contact>
		{
			public int compare(Contact c1, Contact c2) 
			{
				String name = c1.getName();
				return name.compareTo(c2.getName());
			}
		}
		
//		private static class Comp2 implements Comparable<Contact>
//		{
//			public int compare(Contact c1, Contact c2) 
//			{
//				Integer phoneNum = c1.getPhoneNum();
//				return phoneNum.compareTo(c2.getPhoneNum());
//			}
//		}
//		
//		public abstract class Comp3 implements Comparable<Contact>
//		{
//			public int compare(Contact c1, Contact c2) 
//			{
//				String email = c1.getEmail();
//				return email.compareTo(c2.getEmail());
//			}
//		}
	}
	
	public static void main(String[] args) 
	{
		List<Contact> list = new ArrayList<Contact>();
		
		Contact c1 = new Contact("Blake", 503-449-4498, "blakes@gmail.com", "01/03/1990");
		Contact c2 = new Contact("AJ", 503-605-1118, "AlexJ@gmail.com", "02/03/1991");
		
		Collections.sort(list, new Comp1());
		
	}

}
