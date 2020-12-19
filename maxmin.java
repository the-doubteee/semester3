package ankit;

import java.text.NumberFormat;

public class maxmin {

    public static void main(String[] args) {

        NumberFormat nf1 = NumberFormat.getInstance();

        System.out.println("Default format: " + nf1.format(1232317.748));

        nf1.setMaximumIntegerDigits(3);
        System.out.println("minimum integer digit to 3: " + nf1.format(234567.243));

        NumberFormat nf2 = NumberFormat.getInstance();
        nf2.setMaximumFractionDigits(4);
        System.out.println("maximum fraction digit to 4: " + nf2.format(123231.378));

        NumberFormat nf3 = NumberFormat.getInstance();
        nf3.setMinimumFractionDigits(2);
        System.out.println("minimum fraction digit to 2: " + nf3.format(5323117.982));

    }
}
