package ankit;
import java.text.*;

public class decimalAdd {
    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("##.00");

        if (args.length < 2) {
            System.err.println("ERROR: insufficient arguments for summation !");
        } else {
            int sum = 0;
            for (int i = 0; i < args.length; i++) {
                sum += Float.parseFloat(args[i]);
            }
            System.out.println(f.format(sum));

        }
    }
}

