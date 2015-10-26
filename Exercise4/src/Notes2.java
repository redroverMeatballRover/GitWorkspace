
import java.util.HashSet;
import java.util.TreeSet;



public class Notes2 {

	
//	INTERFACESE
//	
//	set = organizes shit in a sequence
//	list
//	queue
//	deque
//	map
//	
//	hash array tree linked link+hash implementations
//	
//	hashset	   treeset     linkedhashset
//	
//	Arraylist
//	
//	
//	linked list = points to the item that was most recently added. num1 then points down to num2, and so on and so forth. put in between by saying that the pointers are changed. 
//	
//	dif beyween array and linked = linked random acces is not as fast
//	
//	deque = a double ended queue = access/add items to front and back of queue
//	makes use of this: ARrayDeqe and linkedList
//	
//	treeLists = if there is a 7 in your list, and a 5 is coming in, its going to check itself to see that it is lower, and then form a branch. 
	
	
	public static class Contact implements Comparable<Contact>
	{
		public String name;
		public String email;
		
		
		public Contact(String name, String Email)
		{
			this.name = name;
			this.email = email;
		}
		
		int id = 0;
		
		//count 
		
		public int hashCode()
		{
			return 0;
		}
		
		@Override
		public int compareTo(Contact obj)
		{
			//0 = this object is equal to obj
			//> 1 = this object is greater tha onj
			//< 0 = this object is less than obj
			System.out.println("compare " + name + " to something " + obj.name);
			//return name.compareTo(obj.name);
			return name.compareToIgnoreCase(obj.name);
			//return age - obj.name;
		
		}
	}
	
	public static void main(String[] args) {
		
		HashSet<Contact> tree = new HashSet<>();
		Contact c1 = new Contact("Af", "bob@myplace.com");
		Contact c2 = new Contact("Bob", "bob@myplace.com");
		Contact c3 = new Contact("jenifar", "bob@myplace.com");
		Contact c4 = new Contact("clush", "bob@myplace.com");
//		Contact c5 = new Contact("Bob", 9);
//		Contact c6 = new Contact("Bob", 56);
		tree.add(c1);
		tree.add(c2);
		tree.add(c3);
		tree.add(c4);

		for (Contact c : tree)
		{
			System.out.println(c.hashCode() + " : " + c.name);
		}
	}

}
