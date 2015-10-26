package pack;

import java.sql.Date;
import java.text.DateFormat;

public class Time {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		
		Date d = new Date();
		
		compare one moement with another moment
		
		bool inThePast(Date d)
		{
			return d.before(new Date());
			
			for specific date: use calandar class
			
			
			Calendar.getInstance();
			
			Calendar date = new GregorianCalendar()
			date.set(Calendar.MONTH, CALANDAR.MAY);
			DATE.SET (CALENDAR.DATE, 19)

			get calendar info
			
			calendar.get method
			int birthmonth = myBirthday.get(Calendar.MONTH)
			
			use the add() and roll() methods
			
			Calendar.add(Calendar.MoNTH,1) = incrimends the current date by one month
			
			calendar.roll = used to effect a particular field like the month without changing the year
			
			getTime() retuenrs a date
			getTimeInMillis() returns a long
			
			dateformat
			
			string formatshortdatestring(date d)
			df = DateFormat.getDateInstance(DateFormat.SHORT) // short = 12/12/15, medium = jan 12 2009, long  is date with time and full is full
			return df.fomat(d)
					
					to parse dates use DateFormat.parse()
			
		}

	}

}
