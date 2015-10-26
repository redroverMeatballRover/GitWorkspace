package Aliens2;
/**
 * Cody schaffer
 * this program builds random alien words, called blurbs. 
 *  
 * 1 word = blurb
 * 
 * a blurb = whoozit followed by 1 - 3 whatzits
 * whoozit = xo, or xy, xyy, or xyyyy (x followed by any number of ys) ()
 * 
 * whatzit = qz or qd + whoozit
 * 
 * example of the alien language
 * blurb = xo qzxo qdxo, xoqzxy qdxy  
 * 			xy qzxo qdxyy, xyyy qzxy qzxo

 */
public class AliensDriver2 {

	//runs program
	public static void main(String[] args) {

		System.out.println("Five random alien blurbs: \n");
		for (int i = 0; i < 5; i++) {
			Aliens2 obj = new Aliens2();
			System.out.println(obj.blurb());
		}
	}

}
