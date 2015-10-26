package Quiz;

import java.util.Scanner;

public class Quiz {

	private String[] quiz1 = {"What does the finally block do?","Answer is Mario","Answer is Mario","Answer is Mario","Answer is Mario","Answer is Mario","Answer is Mario","Answer is Mario","Answer is Mario","Answer is Mario","mario"};
    private String[] quizAnswer = {"run code no matter what","mario","mario","mario","mario","mario","mario","mario","mario","mario","mario"};
    private String answer;
    private Scanner scan;
    private double points = 0.0;
    private String grade;
    
    public void ask()
    {
        scan = new Scanner(System.in);
        for(int counter = 0; counter <quiz1.length; counter++)
        {
            System.out.println(quiz1[counter]);
            answer = scan.nextLine();
            quiz();
        }
        calculate();
    }
    
    public void quiz()
    {
        for(int counter = 0; counter <quiz1.length; counter++)
        {
            if(answer.equalsIgnoreCase(quizAnswer[counter]))
            {
                points++;
            }
        }
    }
    
    public void calculate()
    {
        points = points/quiz1.length;
        
        if(points >=9)
            grade = "A";
        if(points>=8 && points <9)
            grade = "B";
        if(points>=7 && points <8)
            grade = "C";
        if(points>=6 && points <7)
            grade = "D";
        if(points < 6)
            grade = "F";
        System.out.println(grade);
    }
}
	

