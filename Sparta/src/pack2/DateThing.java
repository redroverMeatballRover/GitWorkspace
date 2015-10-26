package pack2;

//import java.sql.Date;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateThing {

	
	public static void main(String[] args) {
	
		Date date = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		String dateToday = df.format(date);
		System.out.println(dateToday);
		
		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.set(Calendar.MONTH, 8); //8 = september, not 9!
		
		System.out.println(df.format(cal.getTime()));
	}
}
