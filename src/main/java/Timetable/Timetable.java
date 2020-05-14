package Timetable;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Timetable {
	private Map<DaysEnum, TimeSlot> timetable;

	public Timetable(TimeSlot TimeSlot) {
		timetable = new LinkedHashMap<DaysEnum, TimeSlot>();
		timetable.put(DaysEnum.MONDAY, TimeSlot);
		timetable.put(DaysEnum.TUESDAY, TimeSlot);
		timetable.put(DaysEnum.WEDNESDAY, TimeSlot);
		timetable.put(DaysEnum.THURSDAY, TimeSlot);
		timetable.put(DaysEnum.FRIDAY, TimeSlot);
		timetable.put(DaysEnum.SATURDAY, TimeSlot);
		timetable.put(DaysEnum.SUNDAY, TimeSlot);
	}

	@Override
	public String toString() {
		String returnValue = "";

		Set<DaysEnum> DaysSet = timetable.keySet();
		for (DaysEnum day : DaysSet) {
			returnValue = returnValue + day + " : " + timetable.get(day).toString() + "\n";
		}
		return returnValue;
	}

	public void modifyTimetable(TimeSlot timeslot, DaysEnum day) {
		timetable.replace(day, timeslot);
	}
}