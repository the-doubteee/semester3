package ankit;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SheetMusic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double newamt;
        System.out.println("Are You a teacher? (y/n)");
        boolean isTeacher = sc.nextLine().toLowerCase().charAt(0) == 'y' ? true : false;
        System.out.println("Total Amount of Purchase");
        double amt = sc.nextDouble();
        double dis = amt >= 100 ? 0.12 : 0.10;
        double tax = 0.05;

        DecimalFormat d = new DecimalFormat("##.00");
        newamt = amt;
        System.out.println("Total Purchase \t\t\t\t$" + d.format(amt));
        if (isTeacher) {
            System.out.println("Teacher's Discount(" + (dis * 100) + "%)\t\t" + d.format(amt * dis));
            newamt = amt - (amt * dis);
            System.out.println("Discounted Total \t\t\t" + d.format(newamt));
        }
        System.out.println("Sales Tax(" + (tax * 100) + "%)\t\t\t\t" + d.format(newamt * tax));
        System.out.println("Total \t\t\t\t\t$" + d.format(newamt + (newamt * tax)));

        sc.close();
    }
}
