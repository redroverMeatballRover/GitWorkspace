package pack;

import java.text.NumberFormat;
import java.util.Random;

public class GreetingCard {
	
private int indexNum;
private String greet, backPic;
private double cost;

//private String[] paperAndEnv;

public GreetingCard(int idNum, String sentimentText, String picture,
		double price) {// String[] paperEnv{
	indexNum = idNum;
	greet = sentimentText;
	backPic = picture;
	cost = price;
	// String[] paperEnv1 = {"blue", "pink"};
}

public String toString() {
	NumberFormat fmt = NumberFormat.getCurrencyInstance();
	String description;
	description = fmt.format(cost) + "\t" + indexNum + "\t";
	description += backPic + "\t" + greet;

	return description;

}
}

//-----------------------------------------------------------------------
//ATTEMPT WITH CARD COLOR AND ENVELOPE ARRAY

//private int indexNum;
//private String greet, backPic;
//private double cost;
//private String[] paperAndEnv = {"blue","red"};
//
//public GreetingCard(int idNum, String sentimentText, String picture, double price, String[] cover ) {// String[] paperEnv{
//	indexNum = idNum;
//	greet = sentimentText;
//	backPic = picture;
//	cost = price;
//	paperAndEnv = cover;
//}
//
//public String toString() {
//	NumberFormat fmt = NumberFormat.getCurrencyInstance();
//	String description;
//	description = fmt.format(cost) + "\t" + indexNum + "\t" + paperAndEnv[1];
//	description += backPic + "\t" + greet + "\t" + paperAndEnv[0];
//
//	return description;
//
//}
//
//public String[] getPaperAndEnv() {
//	Random rand = new Random();
//	int i = rand.nextInt(1);
//	String[] paperAndEnv = "blue";
//	return paperAndEnv;
//}
//
//public void setPaperAndEnv(String[] paperAndEnv) {
//	this.paperAndEnv = paperAndEnv;
//}