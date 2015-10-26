package pack;

/**
 * 
 * @author cschaffer
 * This interface builds the key.
 */

public interface Lockable {

	void setKey(int key);
	void lock(int key);
	void unlock(int key);
	boolean lockable();

}

