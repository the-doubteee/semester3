package ankit;

import java.util.Scanner;

public class doubleArrayQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] da = new double[1];
        System.out.println("Enter a double value");
        da[0] = sc.nextDouble();

        for (double d : da) {
            System.out.println(d);
        }

        sc.close();
    }
}
