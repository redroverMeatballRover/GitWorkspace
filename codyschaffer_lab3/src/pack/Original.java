package pack;


import java.util.TreeSet;


public class Original {

		
	public static class Contact implements Comparable<Contact>
	{
		public String name;
		public int phoneNum;
		public String email;
		public String birthday;
		
		
		public Contact(String name, int phoneNum, String Email, String birthday)
		{
			this.name = name;
			this.phoneNum = phoneNum;
			this.email = email;
			this.birthday = birthday;
		}
		
		@Override
		public int compareTo(Contact obj)
		{
			//System.out.println("compare " + name + " to something " + obj.name);
			//return name.compareTo(obj.name);
			return name.compareToIgnoreCase(obj.name);
			//return age - obj.name;
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
	}
	
	public static void main(String[] args) {
		
		TreeSet<Contact> tree = new TreeSet<>();
		Contact c1 = new Contact("Af", 666, "bob@myplace.com", null);
		Contact c2 = new Contact("Bob", 0, "bob@myplace.com", null);
		Contact c3 = new Contact("jenifar", 0, "bob@myplace.com", null);
		Contact c4 = new Contact("clush", 0, "bob@myplace.com", null);
//		Contact c5 = new Contact("Bob", 9);
//		Contact c6 = new Contact("Bob", 56);
		tree.add(c1);
		tree.add(c2);
		tree.add(c3);
		tree.add(c4);

		for (Contact c : tree)
		{
			System.out.println(c.name);
		}
	}

}
