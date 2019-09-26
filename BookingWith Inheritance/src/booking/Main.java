package booking;

import java.util.Scanner;

public class Main {
	public static void main(String []args)
	{ 
		Scanner s = new Scanner(System.in);
		PeakSeason p= new PeakSeason();
		Leanseason l = new  Leanseason();
		System.out.println("Booking");
		 System.out.println("Enter the number of persons");
		 p.setPersons(s.nextInt());
		 System.out.println("Enter the number of days");
		 p.setTotal_Days(s.nextInt());
		 System.out.println("Enter the room type");
		 p.setRoomTyp(s.next());
		 System.out.println("Enter the month");
		 int month= s.nextInt();
		 if(month==4||month==5||month==6||month==9||month==11||month==12)
		 {
			 System.out.println("Enter the peakCharge");
			 p.setPeakCharges(s.nextInt());
		 System.out.println("Enter the tariff for single person");
		 p.setTariff(s.nextDouble());
		 System.out.println("Total Tariff: "+(int)(p.roomBooking(p.getPersons(),p.getTotal_Days(),p.getTariff(),p.getRoomTyp(),p.getPeakCharges()))+"/-");
		 
		 }
		 else
		 {
		System.out.println("Enter the discount");
		l.setDiscount(s.nextDouble());
		 System.out.println("Enter the tariff for single person");
		 p.setTariff(s.nextDouble());
         System.out.println("Total Tariff: "+(int)(l.roomBooking(p.getPersons(),p.getTotal_Days(),p.getTariff(),p.getRoomTyp(),l.getDiscount()))+"/-");
		 
			 
		 }
		 

}}
