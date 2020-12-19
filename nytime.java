package ankit;


//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.TimeZone;

//public class nytime {

//  public static void main(String[] args) {
//      SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
//      Date d = new Date();
//      sdf.setTimeZone(TimeZone.getTimeZone("America/New_York"));
//      System.out.println("Current Time in New York City is " + sdf.format(d));
//  }

//}

//Write a Java program to get the current time in New York.

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class nytime {
 public static void main(String[] args) {

     ZoneId zone_id = ZoneId.of("America/New_York");
     LocalDateTime now = LocalDateTime.now(zone_id);
     ZonedDateTime there = now.atZone(ZoneId.of("UTC-05:00"));
     System.out.printf("when it's " + now + " here,it's " + there + " in New York ");
     System.out.println(now.getHour() + " : " + now.getMinute());
 }
}
