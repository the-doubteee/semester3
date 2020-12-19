package ankit;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CarLoan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Purchase amount");
        double p = sc.nextDouble();
        System.out.println("Enter monthly Intrest rate");
        double i = sc.nextDouble() / 12 * 0.01;
        System.out.println("Enter total no. of payments you want to make");
        int n = sc.nextInt();

        double payments = (i * p) / (1 - Math.pow(1 + i, -n));
        DecimalFormat d = new DecimalFormat("##.00");
        System.out.println("Total Amount you Borrowed: " + p);
        System.out.println("Montly Payments: $" + d.format(payments));

        sc.close();
    }
}
