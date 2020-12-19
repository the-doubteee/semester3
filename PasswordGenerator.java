package ankit;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Full Name");
        String name = sc.nextLine().toLowerCase();

        String lname = name.contains(" ") ? name.split(" ")[1] : name;

        System.out.println("Enter your Date of Birth(mm/dd/yyyy)");
        String dob = sc.nextLine();

        System.out.println("Generating Password...!");
        String pass = (lname.length() > 3 ? lname.substring(0, 3) : lname) + "" + dob.split("/")[1] + ""
                + dob.split("/")[0];

        System.out.println("Your Password is: " + pass);
        sc.close();
    }
}
