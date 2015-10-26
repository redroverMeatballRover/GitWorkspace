//package pack;
//
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.TreeSet;
//
//	public static class Contact implements Comparable<Contact>
//	{
//		public String name;
//		public int phoneNum;
//		public String email;
//		public String birthday;
//		
//		public Contact(String name, int phoneNum, String Email, String birthday)
//		{
//			this.name = name;
//			this.phoneNum = phoneNum;
//			this.email = email;
//			this.birthday = birthday;
//		}
//		
//		//@Override
////		public int compareTo(Contact obj)
////		{
////			//System.out.println("compare " + name + " to something " + obj.name); 
////			//return name.compareTo(obj.name);
////			
////		//	return name.compareToIgnoreCase(obj.name);
////			//return age - obj.name;
////		}
//		
//		public String getName() {
//			return name;
//		}
//		public void setName(String name) {
//			this.name = name;
//		}
//		public int getPhoneNum() {
//			return phoneNum;
//		}
//		public void setPhoneNum(int phoneNum) {
//			this.phoneNum = phoneNum;
//		}
//		public String getEmail() {
//			return email;
//		}
//		public void setEmail(String email) {
//			this.email = email;
//		}
//		public String getBirthday() {
//			return birthday;
//		}
//		public void setBirthday(String birthday) {
//			this.birthday = birthday;
//		}
//		@Override
//		public int compareTo(Contact o) 
//		{
//			return 0;
//		}
//
//		@Override
//		public int hashCode() {
//			final int prime = 31;
//			int result = 1;
//			result = prime * result
//					+ ((birthday == null) ? 0 : birthday.hashCode());
//			result = prime * result + ((email == null) ? 0 : email.hashCode());
//			result = prime * result + ((name == null) ? 0 : name.hashCode());
//			result = prime * result + phoneNum;
//			return result;
//		}
//
//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			Contact other = (Contact) obj;
//			if (birthday == null) {
//				if (other.birthday != null)
//					return false;
//			} else if (!birthday.equals(other.birthday))
//				return false;
//			if (email == null) {
//				if (other.email != null)
//					return false;
//			} else if (!email.equals(other.email))
//				return false;
//			if (name == null) {
//				if (other.name != null)
//					return false;
//			} else if (!name.equals(other.name))
//				return false;
//			if (phoneNum != other.phoneNum)
//				return false;
//			return true;
//		}
//		
//		private static class Comp1Comparator implements Comparable<Contact>
//		{
//			public int compare(Contact c1, Contact c2) 
//			{
//				Integer phoneNum = c1.getPhoneNum();
//				return phoneNum.compareTo(c2.getPhoneNum());
//			}
//		}
//		
//		private static class CountryCodeComparator implements Comparator<Contract>
//		{
//			public int compare(Contact item1, Contact item2)
//				{
//					Integer age = item1.getAge();
//					return age.compareTo(item2.getAge());
//				}
//		}
//	
//	
//	public static void main(String[] args) {
//		
//		TreeSet<Contact> tree = new TreeSet<>();
//		Contact c1 = new Contact();
//		Contact c2 = new Contact();
//		tree.add(c1);
//		tree.add(c2);
//		
//		
//		for (Contact c : tree)
//		{
//			System.out.println(c.name);
//		}
//		
//		//Collections.sort(list, new Comp1());
//	}
//
//}