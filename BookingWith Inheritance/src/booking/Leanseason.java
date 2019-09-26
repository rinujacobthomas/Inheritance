package booking;

public class Leanseason extends SeasonBooking {
	double discount;
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	double roomBooking(int persons, int total_Days, double tariff, String roomType ,double d) {
		return super.roomBooking(persons, total_Days, tariff-(tariff*(d/100)), roomType);
	}
}
