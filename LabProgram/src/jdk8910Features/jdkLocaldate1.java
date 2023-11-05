package jdk8910Features;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
/*Local date is predefined class intriduced in jdb.This class is used to manipulate
 *dates in a much simpler way. 
 */
public class jdkLocaldate1 {

	public static void main(String[] args) {
		LocalDate today =LocalDate.now();
		LocalTime currentTime=LocalTime.now();
        System.out.println("today's date:"+today);
        System.out.println("Current time:"+currentTime);
        
        System.out.println("Day of month:"+today.getDayOfMonth());
        System.out.println("Day of year:"+today.getDayOfYear());
        System.out.println("Day of week:"+today.getDayOfWeek());
        
       LocalDate todayUs=LocalDate.now(ZoneId.of("America/Chicago"));
       System.out.println("Date in chicago:"+todayUs);
       LocalTime timeUs=LocalTime.now(ZoneId.of("America/Chicago"));
       System.out.println("Date in chicago:"+timeUs);
        
       LocalDate birthday=LocalDate.of(2001, 11, 27);
       
       Period age =Period.between(todayUs, birthday);
       System.out.println("Age of chaitali:"+age);
       System.out.println("chaitali was born on a:"+birthday.getDayOfWeek());
       
       Duration timeDiff=Duration.between(timeUs, currentTime);
       System.out.println("Time Differevce"+timeDiff);


	}

}
