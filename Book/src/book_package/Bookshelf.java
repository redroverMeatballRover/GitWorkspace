/**
 * @author Cody Schaffer
 */
package book_package;

/**
 * The purpose of this class is to use the BOOK class to create a description of
 * a couple books.
 */
public class Bookshelf {

	/**
	 * The main creates four books and gives them a title, author, a publisher,
	 * and copyright. It also provides a way to change all of the instance
	 * variables via the getters and the setters. finally, it prints the
	 * description of each of the books.
	 */
	public static void main(String[] args)

	{
		Book book1 = new Book("The Power of One", "Garth Williams",
				"Pinehouse Publishing", "November 9, 2001");
		Book book2 = new Book("Avenged Seven", "Manny Worsnop",
				"The Holy Guile Publishing", "December 12, 1999");
		Book book3 = new Book("The Bled", "Fronz Wilkerson",
				"Attila Publishing", "December 10, 2003");
		Book book4 = new Book("Upon A Burning Body", "Orion Gath",
				"The Holy Guile Publishing", "January 12, 2012");

		System.out.println("Book 1: " + book1 + "\n");

		System.out.println("First Instance of Book 2: " + book2);
		book2.setTitle("Heaven Avenged");
		book2.setPublisher("Christian Soldiers Publishing");
		book2.setCopyRightDate("Janaury 25th, 2001");
		System.out.println("Second Instance of Book 2 " + book2 + "\n");

		System.out.println("Book 3: " + book3 + "\n");

		System.out.println("First Instance of Book 4: " + book4);
		book4.setTitle("The Black Murder");
		System.out.println("Second Instance of Book 4: " + book4 + "\n");

	}

}
