package ankit;

import java.time.LocalDate;
import java.time.LocalTime;

public class date {
    public static void main(String[] args) {
        LocalDate ObjDate = LocalDate.now();
        LocalTime Objtime = LocalTime.now();
        // Format will be Year month date
        System.out.println("Today's date  " + ObjDate);
        System.out.println("Current Time  " + Objtime);

    }
}