package ankit;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class time {
    public static void main(String[] args) {
        LocalDateTime Objtimedate = LocalDateTime.now();
        DateTimeFormatter dformat = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
        // Format will be Year month date
        System.out.println("Current Time before formatting " + Objtimedate);
        System.out.println("Current Time after formating " + Objtimedate.format(dformat));

    }
}