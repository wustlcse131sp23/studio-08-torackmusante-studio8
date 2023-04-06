package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

/**
 * @author jtora
 *
 */
/**
 * @author jtora
 *
 */
public class Date {
	
	private int month;
	private int day;
	private int year;
	private boolean isHoliday;
	
	/**
	 * 
	 * @param mon
	 * @param d
	 * @param y
	 * @param hol
	 */
	public Date(int mon, int d, int y, boolean hol)
	{
		this.month = mon;
		this.day = d;
		this.year = y;
		this.isHoliday = hol;
	}
	
	/**
	 * Returns String
	 */
	public String toString()
	{
		if(this.isHoliday== true)
		{
			return this.month +"/" +this.day +"/" +this.year +" is a holiday!";
		}
		return this.month +"/" +this.day +"/" +this.year +" is not a holiday.";
	}

	
    @Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	public static void main(String[] args) {

		Date today = new Date(4, 6, 2023, true);
		Date birth = new Date(4, 6, 2004, false);
		Date xMas = new Date (12, 25, 2023, true);
		Date birth2 = new Date(4, 6, 2004, false);
		
		System.out.println(today.toString());
		System.out.println(birth.toString());
		System.out.println(xMas.toString());
		System.out.println(today.equals(xMas));
		System.out.println(birth.equals(birth));
		System.out.println(birth.equals(today));
		System.out.println(birth == birth2);
		System.out.println(birth.equals(birth2));
		
		
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(today);
		list.add(birth);
		list.add(xMas);
		list.add(birth2);
		list.add(birth);
		System.out.println(list);
		
		HashSet<Date> set = new HashSet<Date>();
		set.add(birth);
		set.add(birth2);
		set.add(birth);
		System.out.println(set);
		
		
		
		
    }

}
