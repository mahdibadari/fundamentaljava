package datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;

public class TestRun {

	   public static void main(String args[]) {
	      // Instantiate a Date object
	      Date date = new Date();

	      // display time and date using toString()
	      //System.out.println(date.toString());
	      
	      Date dNow = new Date( );
	      //SimpleDateFormat ft = 
	      //new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	      //SimpleDateFormat ft = new SimpleDateFormat("'Today is' D 'day of year' yyyy G");

	      //System.out.println("Current Date: " + ft.format(dNow));
	      //System.out.println("Current Date: " + ft.format(dNow));
	      
	      // Instantiate a Date object
	  
	      // display time and date
	      //System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
	      //System.out.println("");
	      //System.out.printf("%s %tB %2$te, %<tY", "Due date:", date);
	      
	      SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
	      String input = args.length == 0 ? "1964-9-1" : args[0]; 

	      System.out.print(input + " Parses as "); 
	      Date t;
	      try {
	         t = ft.parse(input); 
	         //System.out.println(t); 
	      } catch (ParseException e) { 
	         //System.out.println("Unparseable using " + ft); 
	      }
	      
	      try { 
	    	  //Instant start = Instant.now();
	    	  long start = System.currentTimeMillis( );
	    	  System.out.println(new Date( ) + "\n"); 
	    	  Duration gap = Duration.ofSeconds(10);
	          Thread.sleep(4000);  //it is in ms
	          //System.out.println(new Date( ) + "\n");
	          //Instant later = start.plus(gap);
	          //System.out.println(later.toString());
	          long end = System.currentTimeMillis( );
	          long diff = end - start;
	          System.out.println("Waiting time in ms: "+diff);
	       } catch (Exception e) {
	          System.out.println("Got an exception!"); 
	       }
	      
	      Period tenDays = Period.ofDays(10); 
	        System.out.println(tenDays.getDays()); //10

	        Period oneYearTwoMonthsThreeDays = Period.of(1, 2, 3);
	        System.out.println(oneYearTwoMonthsThreeDays.getYears());   //1
	        System.out.println(oneYearTwoMonthsThreeDays.getMonths());  //2
	        System.out.println(oneYearTwoMonthsThreeDays.getDays());    //3

	        System.out.println("\n--- Period.between --- ");
	        LocalDate oldDate = LocalDate.of(1982, Month.AUGUST, 31);
	        LocalDate newDate = LocalDate.of(2016, Month.NOVEMBER, 9);

	        System.out.println(oldDate);
	        System.out.println(newDate);

	        // check period between dates
	        Period period = Period.between(oldDate, newDate);

	        System.out.print(period.getYears() + " years,");
	        System.out.print(period.getMonths() + " months,");
	        System.out.print(period.getDays() + " days");

	}
}
