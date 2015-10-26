package Book;

/**
 * Author Cody Schaffer
 * 
 * This program's purpose is to show inheritence between all the classes. In this program, we
 * show inheritence passed down through the classes as well as method overridding. The classes
 * in this program inherit each other's constructors.
 */
public class BookDriver {

	/*-------------------------------------------------------------------------
	 * This driver takes in the stats from the inherited constructors and creates
	 * material from the classes. 
	 ------------------------------------------------------------------------*/
	
	public static void main(String[] args) {
		
		Novel nov = new Novel(3000, "Jack and Jill", "Jack was a strong lad who loved climbing hills.", "Jill was a beautiful girl who loved Jack.", 100 );
		
		TextBook txt = new TextBook(600, "The Rise of the United States", "George Washington was the Commander of the continental army and the first President of the United States", 
				"King George was the English King who oppressed the Colonies.", 12, "How America was made.", 330, "The American Revolution", 30);
		
		Magazine mag = new Magazine(100, "Sports Illustrated", "Sports Illustrated Swimsuit Edition: Ekaterina Linkova", 400, 20);
		
		TechJournal tech = new TechJournal(300, "SpaceJournal SuperTech", "BlackHoles: Studying with Ekaterina Linkova", 5000, 30, 2000, 10);
		
		//NOVEL//
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("Name of the novel: " + nov.getTitle());//INHERITENCE FROM BOOK
		System.out.println("The number of words in the novel: " + nov.pages);//INHERITENCE FROM BOOK
		System.out.println("Character description: " + nov.getJack());
		System.out.println("Character description: "+ nov.getJill());
		nov.dedication();
		nov.story();
		
		//TEXTBOOK//
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("Name of the Textbook: " + txt.getTitle());//INHERITENCE FROM BOOK
		System.out.println("Number of pages in the textbook: " + txt.getPages());//INHERITENCE FROM BOOK
		System.out.println("Subject of the textbook: " + txt.getSubject());
		System.out.println("Description of one of the main characters in the book: " + txt.getJack());//INHERITENCE FROM NOVEL
		System.out.println("Number of definitions in the book: " + txt.getDefinitions());
		System.out.println("Number of definitions per page: " + txt.computeDefinitionsPerPage());
		
		//MAGAZINE//
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("Name of the magazine: " + mag.getTitle());//INHERITENCE FROM BOOK
		System.out.println("Magazine subject: " + mag.getSubject());
		System.out.println("Number of articles in magazine: " + mag.getArticles());
		System.out.println("Number of authors in the magazine: " + mag.getAuthors());
		System.out.println("articles per page: " + mag.computeArticlesPerPage());
		System.out.println("Authors per page: " + mag.computeAuthorsPerPage());
		mag.editor(); //THIS METHOD WILL BE OVERRIDDEN BY
		mag.contest();
		
		//TECHJOURNAL//
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("Name of Magazine: " + tech.title);//INHERITENCE FROM BOOK
		System.out.println("Number of pages: " + tech.pages);//INHERITENCE FROM BOOK
		System.out.println("Magazine subject: " + tech.getSubject());//INHERITENCE FROM MAGAZINE
		System.out.println("Number of authors in the magazine: " + tech.computeArticlesPerPage());//INHERITENCE FROM MAGAZINE
		System.out.println("Number of NASA authors in the magazines: " + tech.computeNasaAuthorsPerPage()); 
		tech.editor();//INHERITENCE FROM MAGAZINE //ALSO AN EXAMPLE OF OVERRIDING METHODS
		
		
		
	}

}
