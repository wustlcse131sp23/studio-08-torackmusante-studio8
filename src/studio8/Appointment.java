package studio8;

import java.util.Objects;

public class Appointment {

	private Date dayOf;
	private Time timeOf;
	private String whatFor;
	
	public Appointment(Date d, Time t, String who)
	{
		this.dayOf = d;
		this.timeOf = t;
		this.whatFor = who;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dayOf, timeOf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(dayOf, other.dayOf) && Objects.equals(timeOf, other.timeOf);
	}

	public static void main(String[] args) {
		Date d1 = new Date(1, 2, 1900, false);
		Date d2 = new Date(3, 31, 1989, false);
		Date d3 = new Date(10, 18, 2023, true);
		
		Time t1 = new Time(12, 30, true);
		Time t2 = new Time(13, 30, false);
		Time t3 = new Time(15, 15, true);
		
		Appointment a1 = new Appointment(d1, t3, "Doctor");
		Appointment a2 = new Appointment(d2, t1, "Oil Change");
		Appointment a3 = new Appointment(d3, t2, "Vet");
		

	}

}
