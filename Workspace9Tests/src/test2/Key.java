package test2;

public class Key {
	  //instance variables
	   String cipher;
	   String plain;



	public Key(String cipher, String plain) {
	 this.cipher = cipher;
	 this.plain = plain;
	}
	 /**
	 * getCipher - returns cipher
	 * 
	 * @return     cipher
	 */

	  public String getCipher() {
	     return cipher;
	 }
	 /**
	 * setCipher - updates cipher name
	 * 
	 * @param  newCipher   new value of cipher 
	 */

	  public void setCipher(String newCipher) {
	      cipher = cipher;
	  }
	  /**
	 * getPlain - returns plain
	 * 
	 * @return     plain
	 */

	  public String getPlain(){
	      return plain;
	  }
	  /**
	 * setPlain - updates plain name
	 * 
	 * @param  newPlain   new value of plain 
	 */

	  public void setPlain(String newPlain){
	      plain = plain;
	  }
	  /**
	 * toString - returns contents of object
	 * 
	 * @return    result
	 */

	  public String toString() {
	      String result;
	      result ="Ciphered text = " + cipher;
	      result +="Plain text = " + plain;
	      return result;
	    }}
