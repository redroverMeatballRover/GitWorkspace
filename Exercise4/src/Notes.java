import java.util.TreeSet;


public class Notes {

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
		
		public static class Comp1 implements Comparable<Contact>
		{

			public int compare(Contact c1, Contact c2) 
			{
				Integer phoneNum = c1.getAge();
				return 0;
			}

			@Override
			public int compareTo(Contact o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		}
		
		public static class Comp2 implements Comparable<Contact>
		{

			@Override
			public int compareTo(Contact arg0) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		}
		
		public static class Comp3 implements Comparable<Contact>
		{

			@Override
			public int compareTo(Contact arg0) {
				// TODO Auto-generated method stub
				return 0;
			}
			
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

//		@Override
//		public int compareTo(Contact obj)
//		{
//			//0 = this object is equal to obj
//			//> 1 = this object is greater tha onj
//			//< 0 = this object is less than obj
//			
//			
//			//System.out.println("compare " + name + " to something " + obj.name);
//			
//			//return name.compareTo(obj.name);
//			return name.compareToIgnoreCase(obj.name);
//			//return age - obj.name;
//		
//		}
	}
	
	public static void main(String[] args) {
		
		TreeSet<Contact> tree = new TreeSet<>();
		Contact c1 = new Contact("Blake", 0, "bob@myplace.com", null);
		Contact c2 = new Contact("AJ", 0, "bob@myplace.com", null);
		Contact c3 = new Contact("Corey", 0, "bob@myplace.com", null);
		Contact c4 = new Contact("Taylor", 0, "bob@myplace.com", null);
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




//INTERFACESE
//
//set = organizes shit in a sequence
//list
//queue
//deque
//map
//
//hash array tree linked link+hash implementations
//
//hashset	   treeset     linkedhashset
//
//Arraylist
//
//
//linked list = points to the item that was most recently added. num1 then points down to num2, and so on and so forth. put in between by saying that the pointers are changed. 
//
//dif beyween array and linked = linked random acces is not as fast
//
//deque = a double ended queue = access/add items to front and back of queue
//makes use of this: ARrayDeqe and linkedList
//
//treeLists = if there is a 7 in your list, and a 5 is coming in, its going to check itself to see that it is lower, and then form a branch. 

























//import java.util.TreeSet;
//
//
//public class Notes {
//
//	
////	INTERFACESE
////	
////	set = organizes shit in a sequence
////	list
////	queue
////	deque
////	map
////	
////	hash array tree linked link+hash implementations
////	
////	hashset	   treeset     linkedhashset
////	
////	Arraylist
////	
////	
////	linked list = points to the item that was most recently added. num1 then points down to num2, and so on and so forth. put in between by saying that the pointers are changed. 
////	
////	dif beyween array and linked = linked random acces is not as fast
////	
////	deque = a double ended queue = access/add items to front and back of queue
////	makes use of this: ARrayDeqe and linkedList
////	
////	treeLists = if there is a 7 in your list, and a 5 is coming in, its going to check itself to see that it is lower, and then form a branch. 
//	
//	
//	public static class Contact implements Comparable<Contact>
//	{
//		public String name;
//		public int phoneNum;
//		public String email;
//		public String birthday;
//		
//		
//		public Contact(String name, int phoneNum, String Email, String birthday)
//		{
//			this.name = name;
//			this.phoneNum = phoneNum;
//			this.email = email;
//			this.birthday = birthday;
//		}
//		
//		@Override
//		public int compareTo(Contact obj)
//		{
//			//0 = this object is equal to obj
//			//> 1 = this object is greater tha onj
//			//< 0 = this object is less than obj
//			System.out.println("compare " + name + " to something " + obj.name);
//			//return name.compareTo(obj.name);
//			return name.compareToIgnoreCase(obj.name);
//			//return age - obj.name;
//		
//		}
//	}
//	
//	public static void main(String[] args) {
//		
//		TreeSet<Contact> tree = new TreeSet<>();
//		Contact c1 = new Contact("Af", 0, "bob@myplace.com", null);
//		Contact c2 = new Contact("Bob", "bob@myplace.com");
//		Contact c3 = new Contact("jenifar", "bob@myplace.com");
//		Contact c4 = new Contact("clush", "bob@myplace.com");
////		Contact c5 = new Contact("Bob", 9);
////		Contact c6 = new Contact("Bob", 56);
//		tree.add(c1);
//		tree.add(c2);
//		tree.add(c3);
//		tree.add(c4);
//
//		for (Contact c : tree)
//		{
//			System.out.println(c.name);
//		}
//	}
//
//}
