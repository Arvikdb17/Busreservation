package busreservation;

import java.util.ArrayList;
import java.util.Scanner;

public class busdemo {
	public static void main(String[] args) {
		ArrayList<bus> buses=new  ArrayList<bus>();
		ArrayList<booking> bookings=new ArrayList<booking>();
		buses.add(new bus(1,true,45));
		buses.add(new bus(2,false,45));
		buses.add(new bus(3,true,45));
	
		int useropt=1;
		Scanner sc1=new Scanner(System.in);
		for(bus b:buses)
		{
			b.displaybusinfo();
		}
		while(useropt==1) {
		System.out.println("enter 1 to book 2 to exit");
		useropt=sc1.nextInt();
		if(useropt==1) {
			booking booking=new booking();
			if(booking.isAvailable(bookings,buses)) {
				bookings.add(booking);
				System.out.println("Your Booking is confirmed");
			}
			else {
				System.out.println("Bus is full please try another Bus or Date");
			}
		}
		}

	}


}
