package pack;

import java.text.NumberFormat;

public class Inventory {

private GreetingCard[] collection;
private int count;
private double totalCost;

// cCONSTRUCTOR
public Inventory() {
	collection = new GreetingCard[30];
	count = 0;
	totalCost = 0;
}

public void addGreetingCard(int indexNum, String greet, String backPic,
		double cost) // addInventory?
{
	if (count == collection.length)
		increaseSize();

	collection[count] = new GreetingCard(indexNum, greet, backPic, cost);
	totalCost += cost;
	count++;
}

//public void modifyGreetingCard(int indexNum, String greet, String backPic,
//		double cost, String envelope, String cardColor) // addInventory?
//{
//	if (count == collection.length)
//		increaseSize();
//
//	collection[count] = new GreetingCard(indexNum, greet, backPic, cost, envelope, cardColor);
//	totalCost += cost;
//	count++;
//}

public String toString() {
	NumberFormat fmt = NumberFormat.getCurrencyInstance();

	// String //report = "..........~\n";
	String report = "My Inventory \n\n";

	report += "Number of Greeting Cards: " + count + "\n";
	report += "Total cost: " + fmt.format(totalCost) + "\n";
	report += "Average cost: " + fmt.format(totalCost / count);

	report += "\n\nCard List:\n\n";

	for (int card = 0; card < count; card++)
		report += collection[card].toString() + "\n";

	return report;
}

private void increaseSize() {
	GreetingCard[] temp = new GreetingCard[collection.length * 2];
	for (int card = 0; card < collection.length; card++) {
		temp[card] = collection[card];
	}
	collection = temp;
}
}

//-----------------------------------------------------------------------
//ATTEMPT WITH CARD COLOR AND ENVELOPE ARRAY

//private GreetingCard[] collection;
//private int count;
//private double totalCost;
//
//// cCONSTRUCTOR
//public Inventory() {
//	collection = new GreetingCard[30];
//	count = 0;
//	totalCost = 0;
//}
//
//public void addGreetingCard(int indexNum, String greet, String backPic,
//		double cost, String[] paperAndEnv) // addInventory?
//{
//	if (count == collection.length)
//		increaseSize();
//
//	collection[count] = new GreetingCard(indexNum, greet, backPic, cost, paperAndEnv);
//	totalCost += cost;
//	count++;
//}
//
//public String toString() {
//	NumberFormat fmt = NumberFormat.getCurrencyInstance();
//
//	
//	String report = "My Inventory \n\n";
//
//	report += "Number of Greeting Cards: " + count + "\n";
//	report += "Total cost: " + fmt.format(totalCost) + "\n";
//	report += "Average cost: " + fmt.format(totalCost / count);
//
//	report += "\n\nCard List:\n\n";
//
//	for (int card = 0; card < count; card++)
//		report += collection[card].toString() + "\n";
//
//	return report;
//}
//
//private void increaseSize() {
//	GreetingCard[] temp = new GreetingCard[collection.length * 2];
//	for (int card = 0; card < collection.length; card++) {
//		temp[card] = collection[card];
//	}
//	collection = temp;
//}