package booking;

class Booking {
	int persons;
	int total_Days;
	double tariff;
	public double getTariff() {
		return tariff;
	}
	public void setTariff(double tariff) {
		this.tariff = tariff;
	}
	static String roomTyp;
	public int getPersons() {
		return persons;
	}
	public void setPersons(int persons) {
		this.persons = persons;
	}
	public int getTotal_Days() {
		return total_Days;
	}
	public void setTotal_Days(int total_Days) {
		this.total_Days = total_Days;
	}
	
	public String getRoomTyp() {
		return roomTyp;
	}
	public void setRoomTyp(String roomTyp) {
		this.roomTyp = roomTyp;
	}
	double  roomBooking(double tariff, String roomType)
	{
		 return tariff;
	}
}

