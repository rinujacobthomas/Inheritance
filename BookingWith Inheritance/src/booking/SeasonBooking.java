package booking;
import java.util.Scanner;
public class SeasonBooking extends Booking {

	int month;
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	 double roomBooking(int persons,int total_Days, double tariff, String roomType)
		{
		 return super.roomBooking(persons*total_Days*tariff, roomType);
		}
	 
}
