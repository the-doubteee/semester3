/*Question 3. You are required to maintain your own record that includes your name,
 *  father's name, date of birth, age (computed with respect to the current date).
 *   The age includes years, months and days. You are required to show your record 
 *   on the display screen such as: for displaying your name, it should display like
 *    \Name of the student:" followed by its value. Display of each entity should starts with
 *     new line. Use scanner class for getting the input from keyboard. */
package ankit;
import java.time.LocalDate;
import java.util.*;
public class Q3_Test {

    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = an.nextLine();
        System.out.print("Enter Your Father's Name: ");
        String fname = an.nextLine();
        System.out.print("Enter Your Date of Birth(dd MM yyyy): ");
        int dd = an.nextInt();
        int mm = an.nextInt();
        int yyyy = an.nextInt();

        LocalDate now = LocalDate.now();
        int agedd = now.getDayOfMonth() - dd;
        int agemm = now.getMonthValue() - mm;
        int ageyyyy = now.getYear() - yyyy;

        System.out.println("Name of the Student: " + name);
        System.out.println("Father's Name: " + fname);
        System.out.println("Age: " + agedd + " day(s) " + agemm + " month(s) " + ageyyyy + " Years");
    }
}

//Ankit Raj Biswal
// 1941012238 CSE-D

