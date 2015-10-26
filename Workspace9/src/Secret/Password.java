package Secret;

import java.util.Random;

/**
 * Author Cody Schaffer
 * 
 *  The purpose of this class is to create a cipher program that uses both the password and secret classes.
 *  In this class, we show that we can use multiple inheritence, as well as pull methods from different classes.  
 */

public class Password extends Secret implements Encryptable
{
private String message;
private boolean encrypted;
//private int shift;
private int flipper;
private Random generator;

//-----------------------------------------------------------------
//  Constructor: Stores the original message. 
//-----------------------------------------------------------------
public Password(String msg) 
{
	super (msg);
  message = msg;
  encrypted = false;
  generator = new Random();
 // shift = generator.nextInt(1) - 1;
  flipper = generator.nextInt(10);
}

//-----------------------------------------------------------------
//  Encrypts this password. In this code, we use 
//a flipper to scramble the code. We use the carot ^ sign in order
//to flip the A to a Z.  XOR opperator
//-----------------------------------------------------------------
public void encrypt ()
{
  if (!encrypted)
  {
     String masked = "";
     for (int index=0; index < message.length(); index++)
     //   masked = masked + (char)(message.charAt(index)+shift);
     masked = masked + (char)(message.charAt(index)^flipper);
     message = masked;
     encrypted = true;
  }
}

//-----------------------------------------------------------------
//  Decrypts and returns the password. 
//-----------------------------------------------------------------
public String decrypt()
{
  if (encrypted)
  {
     String unmasked = "";
     for (int index=0; index < message.length(); index++)
        unmasked = unmasked + (char)(message.charAt(index)^flipper);
     message = unmasked;
     encrypted = false;
  }

  return message;
}

//-----------------------------------------------------------------
//  Returns true if this password is currently encrypted.
//-----------------------------------------------------------------
public boolean isEncrypted()
{
  return encrypted;
}

//-----------------------------------------------------------------
//  Returns this password (may be encrypted).
//-----------------------------------------------------------------
public String toString()
{
  return message;
}

@Override
public void ecnrypt() {
	// TODO Auto-generated method stub
	
}
}

