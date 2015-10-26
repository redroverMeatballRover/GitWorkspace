import beans.PersonBean;
 
/**
 * Class <code>TestPersonBean</code>.
 */
public class TestPersonBean {
    /**
     * Tester method <code>main</code> for class <code>PersonBean</code>.
     * @param ARGS
     */
    public static void main(String[] ARGS) {
        PersonBean PERSON = new PersonBean();
 
        PERSON.setName("Bob");
        PERSON.setDeceased(false);
 
        // Output: "Bob [alive]"
        System.out.print(PERSON.getName());
        System.out.println(PERSON.isDeceased() ? " [deceased]" : " [alive]");
    }
}
