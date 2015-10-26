package CheckBoxes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.List;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author dmaldonado
 * 
 */
public class QuizScore extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	JTextArea area;
	JPanel quiz;
	JLabel quizScore;
	JLabel grade, exp;
	protected int score1;
	protected String c;
	protected String ic;

	public QuizScore(int s1, String correct, String incorrect) {
		
		setLayout (new GridLayout(5,5));
		//setLayout (new BoxLayout(this, BoxLayout.Y_AXIS));
		//setLayout(new BorderLayout());
		
		StyleOptionsPanel sop = new StyleOptionsPanel();
		setPreferredSize(new Dimension(200, 150));

		score1 = s1;
		c = correct;
		ic = incorrect;

	//	area = new JTextArea("Quiz Score");
		
		quizScore = new JLabel("Quiz Score: " + (getScore1()));
		quizScore.setFont(new Font("Helvetica", Font.PLAIN, 20));
		//add(new JLabel("quiz score: " + (getScore1())));
		calculate();
		// BUILD AN ERROR MESSAGE INTO THE CODE FOR BUGS

//		area.setEditable(false);
//		add(area);
		add(grade);
		add (quizScore);
		add(exp);
	}


	public void calculate() {
		
		ArrayList<String> gradeList = new ArrayList<String>(6);
		gradeList.add("Grade: F");
		gradeList.add("Grade: D");
		gradeList.add("Grade: C");
		gradeList.add("Grade: B");
		gradeList.add("Grade: A");
		gradeList.add("Grade: A+");
		
		
		
		
		
		if (getScore1() < 2) {
			grade = new JLabel(gradeList.get(0));
			grade.setFont(new Font("Helvetica", Font.PLAIN, 20));
			
			exp = new JLabel("You did not pass. Please try again.");
			exp.setFont(new Font("Helvetica", Font.PLAIN, 12));
			
		} else if (getScore1() == 2) {
			grade = new JLabel(gradeList.get(1));
			grade.setFont(new Font("Helvetica", Font.PLAIN, 20));
			exp = new JLabel("Grade is insufficient: 60% ACCURACY ");
			exp.setFont(new Font("Helvetica", Font.PLAIN, 12));
		} else if (getScore1() == 3) {
			grade = new JLabel(gradeList.get(2));
			grade.setFont(new Font("Helvetica", Font.PLAIN, 20));
			exp =new JLabel("You passed, but could use some work: 70% ACCURACY ");
			exp.setFont(new Font("Helvetica", Font.PLAIN, 12));
		} else if (getScore1() == 4) {
			grade = new JLabel(gradeList.get(3));
			grade.setFont(new Font("Helvetica", Font.PLAIN, 20));
			exp = new JLabel("You passed: 80% ACCURACY ");
			exp.setFont(new Font("Helvetica", Font.PLAIN, 12));
		} else if (getScore1() == 5) {
			grade = new JLabel(gradeList.get(4));
			grade.setFont(new Font("Helvetica", Font.PLAIN, 20));
			exp = new JLabel("You passed: 90% ACCURACY ");
			exp.setFont(new Font("Helvetica", Font.PLAIN, 12));
		} else if (getScore1() == 6) {
			grade = new JLabel(gradeList.get(5));
			grade.setFont(new Font("Helvetica", Font.PLAIN, 20));
			exp = new JLabel("EXCELLENT: 100% ACCURACY ");
			exp.setFont(new Font("Helvetica", Font.PLAIN, 12));
		}
	}

	public int getScore1() {
		return score1;
	}
	public String getC() {
		return c;
	}
	public String getIC() {
		return ic;
	}
}
