package busreservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class booking {
	String passengerName;
	int busNo;
	Date date;
	booking(){
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter name of passenger");
		passengerName=sc1.next();
		System.out.println("enter bus no");
		busNo=sc1.nextInt();
		System.out.println("enter date dd-mm-yyyy");
		String dateInput=sc1.next();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date= dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public boolean isAvailable(ArrayList<booking> bookings,ArrayList<bus> buses) {
		int capacity=0;
		for(bus bus:buses) {
			if(bus.busno()==busNo) 
				capacity=bus.getcapacity();
			
		}
		int booked=0;
		for (booking b:bookings)
		{
			if(b.busNo==busNo&& b.date.equals(date)) {
				booked++;
			}
			
			}
		return booked<capacity?true:false;
		}


}
