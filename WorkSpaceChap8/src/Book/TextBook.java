package Book;

public class TextBook extends Novel {
	
	private String concept;
	private int references;
	private String subject;
	private int definitions;
		
		/*-------------------------------------------------------------------------
		 * This class inherits from Novel and inherits from Novel's constructor.
		 * It uses methods from novel and also has its own set of methods. 
		 ------------------------------------------------------------------------*/
		public TextBook(int numPages, String nameTitle, String character1, String character2, int bookChapters, String historyConcept, int historyReferences, String subSubject, int subDefinitions) {
			super (numPages, nameTitle, character1, character1, bookChapters);
			concept = historyConcept;
			references = historyReferences;
			subject = subSubject;
			definitions = subDefinitions;
		}

		//METHODS//--------------------------------------------------------
		//OUTLINES FOCUS OF THE BOOK//
		public void focus()
		{
		System.out.println("This Textbook outlines the history of America.");
		}
		//OUTLINES LEVEL OF READING FOR THE BOOK//
		public void gradeLevel ()
		{
			System.out.println("This is a twelfth-grade reading level textbook.");
		}
		//COMPUTES DEFINITIONS PER PAGE//
		public int computeDefinitionsPerPage ()
		{
			return definitions/pages;
		}
		//COMPUTES REF PER PAGE//
		public int computeReferencesPerPage ()
		{
			return references/pages;
		}
		
		
		//GETTERS AND SETTERS//------------------------
		//SET CONCEPT
		public void setConcept(String historyConcept)
		{
			concept = historyConcept;
		}
		//GET CONCEPT
		public String getConcept()
		{
			return concept;
		}
		//SET REFERENCE
		public void setReferences(int historyReferences)
		{
			references = historyReferences;
		}
		//GET REFERENCE
		public int getReferences()
		{
			return references;
		}
		//SET SUBJECT
		public void setSubject(String subSubject)
		{
			subject = subSubject;
		}
		//GET SUBJECT
		public String getSubject()
		{
			return subject;
		}
		//SET DEF
		public void setDefinitions(int subDefinitions)
		{
			definitions = subDefinitions;
		}
		//GET DEF
		public int getDefinitions()
		{
			return definitions;
		}
}
