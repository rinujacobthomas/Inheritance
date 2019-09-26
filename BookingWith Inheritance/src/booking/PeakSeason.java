package booking;

public class PeakSeason extends SeasonBooking {

	
	int peakCharges;
	public int getPeakCharges() {
		return peakCharges;
	}
	public void setPeakCharges(int peakCharges) {
		this.peakCharges = peakCharges;
	}
	double roomBooking(int persons, int total_Days, double tariff, String roomType ,double peakcharge) {
		return super.roomBooking(persons, total_Days, tariff*peakcharge, roomType);
	}

}
