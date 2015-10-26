package pack;

/**
 * 
 * @author cody schaffer
 *
 *This program shows the heirachy between all the classes. The heirarchy is this:
 *
 *CLASSCLASS - main parent for all classes
 *	-Math
 *		--algebra
 *		--Sets
 *
 *	-National
 *		--Finance
 *		--Government
 *
 *	-SocialSciences
 *		--Leadership
 *		--ASSClass
 *		--psychology
 *
 *	-Computers
 *		--ticks
 *		--IntroToJava
 *		--OOP
 *
 *CLASSES INHERIT CONSTRUCTORS
 *ALL METHODS ARE SELF-EXPLANETORY
 */

public class SchoolDriver {

	public static void main(String[] args) {
		
	//-------------------------------------------------------------------------------------------------------------------------------------	
		Leadership lea = new Leadership(10222, "Leadership Class", "This course is about Leadership in the business world", 
				"Social Sciences Department", 300, 0, 50, 20, "The focus of this class is to strengthen leadership skills", 3);
		
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println("Class number: " + lea.getClassNum() + ".\n Title of the course: " +  lea.getTitle() + ".\n Course description: " 
				+ lea.getDescription() + ".\n Department who teaches it: " + lea.getDepartment());//INHERITENCE FROM CLASSCLASS
	
		lea.problemSolving();
		System.out.println("Number of homework assignments: " + lea.getHomework());
		System.out.println("Number of Discussions for the course: " + lea.getDiscuss());
		System.out.println("Number of journals: " + lea.getJournals());
		System.out.println("Number of presentations: " + lea.getPres());
		
	//------------------------------------------------------------------------------------------------------------------------------------	
		ASSCLass ass = new ASSCLass(10201, "ASSCLass", "This course is about Business Psychology.", "Scocial Sciences Department", 
				500, 1, 40, 70, "The focus of this class is to develop business awareness.", 6, 2);
	
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println("Class number: " + ass.getClassNum() + ".\n Title of the course: " +  ass.getTitle() + ".\n Course description: " 
				+ ass.getDescription() + ".\n Department who teaches it: " + ass.getDepartment());//INHERITENCE FROM CLASSCLASS
		
		ass.problemSolving();//INHERITENCE FROM LEADERSHIP
		ass.makePresentation();
		System.out.println("Number of homework assignments: " + ass.getHomework());
		System.out.println("Number of Discussions for the course: " + ass.getDiscuss());
		System.out.println("Number of journals: " + ass.getJournals());
		System.out.println("Number of essays in this course: " + ass.getEssay());
		System.out.println("Number of presentations: " + ass.getPres());
		
	//-------------------------------------------------------------------------------------------------------------------------------------
		
		Psychology psy = new Psychology(30404, "Human Relations", "This course is about Human Relations", "Social Sciences Department",
				500, 3, 4, 20, "The focus of the class is to understand each other.", 4, 3, 2);
		
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println("Class number: " + ass.getClassNum() + ".\n Title of the course: " +  ass.getTitle() + ".\n Course description: " 
				+ ass.getDescription() + ".\n Department who teaches it: " + ass.getDepartment());//INHERITENCE FROM CLASSCLASS
		
		psy.readEnergyBus();
		psy.makePresentation();//INHERITENCE FROM ASSCLASS
		psy.problemSolving();//INHERITENCE FROM LEADERSHIP
		System.out.println("Number of homework assignments: " + psy.getHomework());
		System.out.println("Number of Discussions for the course: " + psy.getDiscuss());
		System.out.println("Number of journals: " + psy.getJournals());
		System.out.println("Number of essays in this course: " + psy.getEssay());
		System.out.println("Number of presentations: " + psy.getPres());
		
	//-------------------------------------------------------------------------------------------------------------------------------------
		Algebra alg = new Algebra(11111, "Algebra Class", "This is a revising course in math.", "Math Department", 20, 2, 1, 2, 10);
		
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println("Class number: " + ass.getClassNum() + ".\n Title of the course: " +  ass.getTitle() + ".\n Course description: " 
				+ ass.getDescription() + ".\n Department who teaches it: " + ass.getDepartment());//INHERITENCE FROM CLASSCLASS
		
		alg.computeRecVSPages();
		System.out.println("Number of homework loads in the course: " + alg.getHomework());
		System.out.println("Number of problems per page: " +  alg.computePagesProbs());
		
	//-------------------------------------------------------------------------------------------------------------------------------------
		Sets set = new Sets(40505, "Sets Class", "This is a course on Probability", "Math Department", 45, 23, 3, 2, 1, 10);
		
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println("Class number: " + set.getClassNum() + ".\n Title of the course: " +  set.getTitle() + ".\n Course description: " 
				+ set.getDescription() + ".\n Department who teaches it: " + set.getDepartment());//INHERITENCE FROM CLASSCLASS
		
		System.out.println("{Pages to read in the book: " + set.pages);
		System.out.println("Number of problems in the course: " + set.getProb());
		System.out.println("Number of problems per pages: " + set.computePagesProbs());//INHERITENCE FROM ALGEBRA
		System.out.println("Recorrections per page: " + set.computeRecVSPages());
		
	//--------------------------------------------------------------------------------------------------------------------------------------
		
		Finance fi = new Finance(22222, "Personal Finance", "This is an accounting class", "Social Studies Department", 20, 30, 40, 3, 1, 2);
		
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println("Class number: " + fi.getClassNum() + ".\n Title of the course: " +  fi.getTitle() + ".\n Course description: " 
				+ fi.getDescription() + ".\n Department who teaches it: " + fi.getDepartment());//INHERITENCE FROM CLASSCLASS
		
		fi.Accounting();
		fi.getCalculator();
		fi.getStock();
		fi.useRealLifeMathSkills();
		System.out.println("Number of quizzes in the course" + fi.getQuiz());
		
	//-------------------------------------------------------------------------------------------------------------------------------------
		
		Government gov = new Government(919191, "Government", "This is a history course", "Social Studies Department", 3, 3, 2, 3, 4, 5, 6);
		
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println("Class number: " + gov.getClassNum() + ".\n Title of the course: " +  gov.getTitle() + ".\n Course description: " 
				+ gov.getDescription() + ".\n Department who teaches it: " + gov.getDepartment());//INHERITENCE FROM CLASSCLASS
		
		gov.Accounting();//INHERITENCE FROM ACCOUNTING
		gov.getHist();
		gov.learnHistory();
		System.out.println("Number of government stock in this course: " + gov.getStock());
		
	//----------------------------------------------------------------------------------------------------------------------------------------
		
		
		IntroToJava itj = new IntroToJava(222223, "COMP110", "This is an intro to java", "Computer Science Department", 3, 11, 22, 4, 
				"This class is focusing on JAVA", 2, 2, 1);
		
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println("Class number: " + itj.getClassNum() + ".\n Title of the course: " +  itj.getTitle() + ".\n Course description: " 
				+ itj.getDescription() + ".\n Department who teaches it: " + itj.getDepartment());//INHERITENCE FROM CLASSCLASS
		
		itj.projector();
		itj.designUserInteraction();
		itj.readJavaBook();
		System.out.println("Number of attributes in this course: " + itj.getAttrib());
		
	//----------------------------------------------------------------------------------------------------------------------------------------
		TopicsInComputers tics = new TopicsInComputers(66666, "TICS", "This course is about HTML", "Computer Science Department", 
				2, 3, 4, 4, "This class focuses on web design", 3, 2);//INHERITENCE FROM CLASSCLASS
		
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println("Class number: " + tics.getClassNum() + ".\n Title of the course: " +  tics.getTitle() + ".\n Course description: " 
				+ tics.getDescription() + ".\n Department who teaches it: " + tics.getDepartment());

		tics.designUserInteraction();//INHERITENCE FROM CLASSCLASS
		System.out.println("Languages covered in this course: "+ tics.getLangCov());
		System.out.println("Number of discussions in this course: " + tics.getDiscuss());
		
	//----------------------------------------------------------------------------------------------------------------------------------------
		OOP oop = new OOP(686868, "Object Oriented Programming", "This course is about JAVA", "Computer Science Department", 30, 30,
				110, 1, "This class is about object oriented programming", 4, 3, 2, 10);
		
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println("Class number: " + oop.getClassNum() + ".\n Title of the course: " +  oop.getTitle() + ".\n Course description: " 
				+ oop.getDescription() + ".\n Department who teaches it: " + oop.getDepartment());//INHERITENCE FROM CLASSCLASS
		
		oop.createGUI();
		System.out.println("The number of homework assignments per weekend: "+ oop.getWeekendHomeWork());
		System.out.println("This is how many authorship attribute assignments there are in this class: " + oop.getAttrib());
		System.out.println("This is the description of the class: " +  oop.getDescription());
		
		
		
		
		
		
		
	}

}
