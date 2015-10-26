package Pack1;

/**
 * 
 * @author cschaffer
 *this interface creates a key section. This allows the user to open the safe.
 */
public interface Lockable {

	void setKey(int key);
	void lock(int key);
	void unlock(int key);
	boolean lockable();

}

