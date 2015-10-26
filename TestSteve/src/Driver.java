import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Driver {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		runSteve rs = new runSteve();
		rs.moar();
		
		 
//							   //(?<piece>q|k|b|p|n|r+)(?<color>l|d)(?<x>\\w)(?<y>\\d)
//		        String regex = "^(?<piece>q|k|b|p|n|r+)(?<color>l|d)(?<x>\\w)(?<y>\\d)$";
//		        ArrayList<String> list = new ArrayList<>();
//		        list.add("blc1");
//		        list.add("rla1 a3");
//		        list.add("nlb1");
//		        
//		        for (String s : list)
//		        {
//		            Matcher m = Pattern.compile(regex).matcher(s);
//		            
//		            if (m.find()) 
//		            {
//		              System.out.println(s);
//		              System.out.println(m.group("piece"));
//		              System.out.println(m.group("color"));
//		              System.out.println(m.group("x"));
//		              System.out.println(m.group("y"));
//		              System.out.println("---------------");
//		            }
//		        }
//		     }
	}
}
