package studio8;

import java.util.LinkedList;

public class Calander {
	
	private LinkedList<Appointment> cal = new LinkedList<Appointment>();
	
	public void add(Appointment app)
	{
		cal.add(app);
	}
	
	public void printCal()
	{
		System.out.println(cal);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calander cal = new Calander();
		
		Date d1 = new Date(1, 2, 1900, false);
		Date d2 = new Date(3, 31, 1989, false);
		Date d3 = new Date(10, 18, 2023, true);
		
		Time t1 = new Time(12, 30, true);
		Time t2 = new Time(13, 30, false);
		Time t3 = new Time(15, 15, true);
		
		Appointment a1 = new Appointment(d1, t3, "Doctor");
		Appointment a2 = new Appointment(d2, t1, "Oil Change");
		Appointment a3 = new Appointment(d3, t2, "Vet");
		
		cal.add(a3);
		cal.add(a2);
		cal.add(a1);
		cal.printCal();
	}

}
