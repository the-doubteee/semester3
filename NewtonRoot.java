package ankit;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NewtonRoot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("##.000000");

        System.out.println("Enter power of Root: ");
        int r = sc.nextInt();
        System.out.println("Enter a number under root: ");
        double n = sc.nextDouble();

        System.out.println("The " + r + " root of " + n + " is " + d.format(getRoot(n, r)));
    }

    public static double getRoot(double n, int r) {
        double sqr = 0;
        double t = n / 2;
        int c = 0;
        while (c++ <= 100 && n > 0) {
            // no. - f(x)/f`(x) where f(x)=no^r
            sqr = t - (Math.pow(t, r) - n) / (r * Math.pow(t, r - 1));
            double x;
            x = Math.abs(t - sqr);

            if (x < .000001)
                return sqr;
            else
                t = sqr;
        }
        if (n < 0) {
            System.out.println("Error!");
            System.exit(1);
        }
        return sqr;
    }
}