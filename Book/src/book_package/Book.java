/**
 * @author Cody Schaffer
 */
package book_package;

/**
 * The purpose of this Class is to make instance variables for a book. The
 * variables are initialized and accepted in the constructor. We provide getters
 * and setters for every instance variable. Finally, we print out a description
 * of the book.
 */
public class Book {

	private String bookTitle;
	private String bookAuthor;
	private String bookPublisher;
	private String bookCopyRightDate;

	// Constructor// Constructs instance variables for the object.
	public Book(String title, String author, String publisher, String copyright) {
		bookTitle = title;
		bookAuthor = author;
		bookPublisher = publisher;
		bookCopyRightDate = copyright;
	}

	// Getters & Setters //
	// --------------------------------------------------------------------
	// returns bookTitle
	public String getTitle() {
		return bookTitle;
	}

	// Sets a new title for bookTitle
	public void setTitle(String newTitle) {

		bookTitle = newTitle;
	}

	// returns bookAuthor
	public String getAuthor() {
		return bookAuthor;
	}

	// Sets a new Author
	public String setAuthor(String newAuthor) {
		bookAuthor = newAuthor;
		return bookAuthor;
	}

	// returns bookPublisher
	public String getPublisher() {
		return bookPublisher;
	}

	// Sets a new Publisher
	public String setPublisher(String newPublisher) {
		bookPublisher = newPublisher;
		return bookPublisher;
	}

	// Returns the CopyRightDate
	public String getCopyRightDate() {
		return bookCopyRightDate;
	}

	// sets a new copyrightdate.
	public String setCopyRightDate(String newCopyRightDate) {
		bookCopyRightDate = newCopyRightDate;
		return bookCopyRightDate;
	}

	// toString Method // prints out a description of the book.
	// ----------------------------------------
	public String toString() {
		return "The book \"" + bookTitle + "\" is written by " + bookAuthor
				+ ". the book is published by " + bookPublisher
				+ " and is copyrighted " + bookCopyRightDate + ".";
	}
}
