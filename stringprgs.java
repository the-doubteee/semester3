package ankit;

public class stringprgs {
	
    public static void main(String[] args) {
        String x = "Hey, This is Ankit Raj Biswal";
        System.out.println("Replace space: " + space(x));
        System.out.println("Replace tab: " + space(tab(x)));
        System.out.println("Upper Case: " + upper(x));
        System.out.println("Lower Case: " + lower(x));

        System.out.println("Ignore Case: " + upper(x).equalsIgnoreCase(lower(x)));
        System.out.println("Equals: " + upper(x).equals(lower(x)));

        System.out.println("== : " + (upper(x) == lower(x)));

    }

    public static String space(String x) {
        return x.replaceAll(" ", "\t");
    }

    public static String tab(String x) {
        return x.replaceAll("\t", " ");
    }

    public static String upper(String x) {

        return x.toUpperCase();
    }

    public static String lower(String x) {
        return x.toLowerCase();
    }
}
