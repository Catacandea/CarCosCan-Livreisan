package User;

import Timetable.TimeSlot;
import Timetable.Timetable;

public class SupplierCompany extends User {
	private Timetable timetable;
	public SupplierCompany(String username,int to, int from, String phoneNumber,String address) {
		super(username)	;
		timetable = new Timetable(new TimeSlot(to,from));
		
	}

}
