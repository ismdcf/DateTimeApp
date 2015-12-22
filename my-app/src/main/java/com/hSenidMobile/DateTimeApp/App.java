package com.hSenidMobile.DateTimeApp;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import java.util.Scanner;
import org.joda.time.DateTimeZone;
import org.joda.time.DateTime;
import java.util.Set;
import java.util.TimeZone;
public class App {

    public static void main(String[] sm) {
       		
	
	
		DateTime dt = new DateTime();
		DateTimeFormatter fmt = DateTimeFormat.forPattern("dd,MM,yyyy");
		Scanner reader = new Scanner(System.in);
		System.out.println("Find day of the week \n\"DD,MM,YYYY\" \nEnter Date in the given format ");
		String date  = reader.nextLine();
		dt = fmt.parseDateTime(date); 

		int dayOfTheWeek = dt.getDayOfWeek();
		String Day = "";

		switch (dayOfTheWeek){
			case 1: Day="Monday";
				break;
			case 2: Day="Tuesday";
				break;
			case 3: Day="Wednesday";
                                break;
			case 4: Day="Thursday";
                                break;
			case 5: Day="Friday";
                                break;
			case 6: Day="Saturday";
                                break;
			case 7: Day="Sunday";
                                break;
			default: Day="";
				break;
			}


		LocalDate  currentDate =new LocalDate();
		System.out.println("Day of the given date :"+dt+" is "+Day+"\n And the Current Date is "+currentDate  );
    	
	}
}
