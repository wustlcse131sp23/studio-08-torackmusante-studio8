package studio8;

import java.util.Objects;

public class Time {

	private int hour;
	private int minute;
	private boolean twelve;
	
	/**
	 * 
	 * @param hr
	 * @param min
	 * @param typ
	 */
	public Time(int hr, int min, boolean typ)
	{
		this.hour = hr;
		this.minute = min;
		this.twelve = typ;
	}
	
	/**
	 * Returns string
	 */
	public String toString()
	{
		if(this.twelve == true)
		{
			if(this.hour>12)
			{
				int temp = this.hour-12;
				return temp +":" +this.minute;
			}
		}
		return this.hour +":" +this.minute;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

	public static void main(String[] args) {
 
    	
    	
    }

}