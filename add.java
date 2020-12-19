package ankit;

public class add{
public static void main(String[] args) {
    if (args.length == 1)
        System.out.println("Error cant add single no.");
    else {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("Sum = " + sum);
    }
}
}