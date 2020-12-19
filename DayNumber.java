package ankit;

import java.util.Scanner;

public class DayNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Date(dd)");
        int d = sc.nextInt();
        System.out.println("Enter Month(mm)");
        int m = sc.nextInt();
        System.out.println("Enter Year(yyyy)");
        int y = sc.nextInt();

        boolean leap;
        if (y % 400 == 0)
            leap = true;
        else if (y % 4 == 0 && y % 100 != 0)
            leap = true;
        else
            leap = false;

        if (m > 12 || m < 1 || d > 31 || d < 1) {
            System.out.println("Error");
            System.exit(0);
        }

        int days = 0;
        for (int i = 1; i < m; i++) {
            days += monthDays(i, leap);
        }
        days += d;

        System.out.println("Day No.: " + days);
    }

    static int monthDays(int x, boolean leap) {
        switch (x) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 2:
                return leap ? 29 : 28;
            default:
                return 30;

        }
    }
}


