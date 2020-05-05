package Timetable;

import java.util.HashMap;
import java.util.Set;

public class Timetable {
	private HashMap<Days,TimeSlot> timetable;
	TimeSlot closed = new TimeSlot(0,0);
	public Timetable(TimeSlot TimeSlot) {
		timetable.put(Days.MONDAY, TimeSlot);
		timetable.put(Days.TUESDAY, TimeSlot);
		timetable.put(Days.WEDNESDAY, TimeSlot);
		timetable.put(Days.THURSDAY, TimeSlot);
		timetable.put(Days.FRIDAY, TimeSlot);
		timetable.put(Days.SATURDAY,closed);
		timetable.put(Days.SUNDAY, closed);

	}
	public String toString() {
		String return_value = "";
		
		Set<Days> DaysSet = timetable.keySet();
		for(Days day:DaysSet) {
			return_value = return_value + day + " : " + timetable.get(day) + "\n";
		}
		return return_value;
	}
	public void modify_timetable(TimeSlot timeslot, Days day) {
		timetable.replace(day,timeslot);
	}
}
