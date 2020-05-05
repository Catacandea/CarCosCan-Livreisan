package Timetable;

public class TimeSlot {
	private int from;
	private int to;
	private boolean status;
	public TimeSlot(int from, int to) {
		this.from = from;
		this.to = to;
		if( from == to) {
			status = false;
		}else
			status = true;
	}
	public int getFrom() {
		return from;
	}
	public void setFrom(int from) {
		this.from = from;
	}
	public int getTo() {
		return to;
	}
	public void setTo(int to) {
		this.to = to;
	}
	public String toString() {
		String return_value ="";
		if(status == true)
		{	return_value = return_value + from +":00 - " + to + ":00"; 
		}else {
			return_value = "CLOSED";
		}
		 return return_value;
	}
}
