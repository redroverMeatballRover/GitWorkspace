package pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomWords {

	// public static void main(String[] args) {

	public static void wordCreator() {

		Random rand = new Random();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		List<String> li = new ArrayList<String>();

		
		final int C = 5;
		StringBuilder sb = new StringBuilder();

		for (int j = 0; j < 5; j++) 
		{
			for (int i = 0; i < C; i++) 
			{
				sb.append(alphabet.charAt(rand.nextInt(alphabet.length())));
			}
			String randomWord = sb.toString();
			li.add(randomWord);

//			Iterator<String> it = li.iterator();
//			// Object element = it.next();
//			Object element = randomWord;
		}
//		System.out.println(li);

		// System.out.println(list);

	}

}
