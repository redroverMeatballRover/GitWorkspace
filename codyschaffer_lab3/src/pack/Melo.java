package pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Melo 
{
//	int number;
//	int age;
	String name;
	int phoneNum;
	String email;
	//Date bDay;
	String bDay;
	
	public Melo(String name, int phoneNum, String email, String bDay)
	{
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
		this.bDay = bDay;	
	}	
	public Melo(int i, int j, String string) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getbDay() {
		return bDay;
	}
	public void setbDay(String bDay) {
		this.bDay = bDay;
	}


	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bDay == null) ? 0 : bDay.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + phoneNum;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Melo other = (Melo) obj;
		if (bDay == null) {
			if (other.bDay != null)
				return false;
		} else if (!bDay.equals(other.bDay))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNum != other.phoneNum)
			return false;
		return true;
	}

//	private static class CountryCodeComparator implements Comparator<Melo>
//	{
//		public int compare(Melo item1, Melo item2)
//			{
//				String name = item1.getName();
//				return name.compareTo(item2.getName());
//			}
//	}

	private static class CountryCodeComparator1 implements Comparator<Melo>
	{
		public int compare(Melo item1, Melo item2)
			{
				Integer phoneNum = item1.getPhoneNum();
				return phoneNum.compareTo(item2.getPhoneNum());
			}
	}
	
	private static class CountryCodeComparator2 implements Comparator<Melo>
	{
		public int compare(Melo item1, Melo item2)
			{
				String email = item1.getEmail();
				return email.compareTo(item2.getEmail());
			}
	}
	private static class CountryCodeComparator3 implements Comparator<Melo>
	{
		public int compare(Melo item1, Melo item2)
			{
				String bDay = item1.getbDay();
				return bDay.compareTo(item2.getbDay());
			}
	}
	
	public static void main(String[] args) 
	{
		//List<Melo> countryCodeList = new ArrayList<Melo>();
		TreeSet<Melo> countryCodeList = new TreeSet<Melo>();
		//HashSet<Melo> countryCodeList = new HashSet<Melo>();
		Melo item1 = new Melo("Fletcher", 503-665-9898, "fletch@gmail.com", "11/01/1990");
		Melo item2 = new Melo("Corey", 605-324-5432, "corey@gmail.com", "12/24/1995");
		
		countryCodeList.add(item1);
		countryCodeList.add(item2);
		
		for (Melo c : countryCodeList)
			{
				System.out.println(c.name);
			}	
		
		Collections.sort(countryCodeList, new CountryCodeComparator1());
	}
}
