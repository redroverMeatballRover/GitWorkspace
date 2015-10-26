package hospital;

/*-------------------------------------------------------------
 * The janitor class represents a janitor.
 ------------------------------------------------------------*/

public class Janitor extends Employee {
//INHERITS AN ABSTRACT CLASS FROM EMPLOYEE
void checksIn()
{
	System.out.println("checks in");
}
//CLEANS UP
public void cleansUpMesses()
{
	System.out.println("cleans up messes.");
}
//CARRIES KEYS
public void carriesKeys()
{
	System.out.println("carries keys");
}
//MAINTAINS WORKPLACES
public void maintainsWorkPlace()
{
	System.out.println("helps maintain workplace.");
}


}
