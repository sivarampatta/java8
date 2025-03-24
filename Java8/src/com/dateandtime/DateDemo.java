package com.dateandtime;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args)  throws Exception {
		Date d=new Date();
		System.out.println(d);
		
		         // Converting Date to String
				SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
				String format1 = sdf1.format(d);
				System.out.println(format1);

				SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
				String format2 = sdf2.format(d);
				System.out.println(format2);

				// Convert String to Date
				SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
				Object parsedDate = sdf3.parse("2025-01-20");
				System.out.println(parsedDate);
				

		

	}

}
