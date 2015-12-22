package com.hSenidMobile.DateTimeApp;

import org.joda.time.LocalDate;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import java.util.Scanner;
import org.joda.time.DateTimeZone;
import org.joda.time.DateTime;
import java.util.Set;
import java.util.TimeZone;
import org.joda.time.Period;
public class App {

    public static void main(String[] sm) {
       	

	DateTime now = new DateTime();
	LocalDate currentDate = now.toLocalDate();	
	
	DateTime dt = new DateTime();
	DateTime dt2 = currentDate.toDateTimeAtStartOfDay(now.getZone());
        
	DateTimeFormatter fmt = DateTimeFormat.forPattern("dd,MM,yyyy");
	
	
	int option = 0;
	Scanner reader = new Scanner(System.in);
	
	System.out.println(" Input 1 if you want to figure out the Day of the week of a given date \n Input 2 if you want to find the difference between a date with the current local date \n Input 3 to exit ");

	option = reader.nextInt();
	
	while (option != 3)
	
	{
	
		if (option == 1){
	
		
		System.out.println("Find day of the week \n\"DD,MM,YYYY\" \nEnter Date in the given format ");
		reader.nextLine();
		String date = reader.nextLine();
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


		
		System.out.println("Day Of the week of the given date :"+date+" is "+Day );
    		option = 3;
			}
		//end of day of week calculator 
		if (option == 2){
	
	
		System.out.println("\"DD,MM,YYYY\" \nEnter Date in the given format ");
		reader.nextLine();
		String date = reader.nextLine();
		dt = fmt.parseDateTime(date);

		int d=Days.daysBetween(dt,dt2).getDays();
		System.out.println("The difference between the current date and the given date is :"+ d+" days");
		option = 3;


		
			}
		}
	}
}
