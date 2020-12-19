package ankit;
import java.util.StringTokenizer;

public class Oct19 {

    public static String ques6(String s1, String ch) {
        return s1.replaceAll(ch, "");
    }

    public static boolean ques5(String s1, String s2) {
        return s1.contains(s2);
    }

    public static String ques4(String s) {
        return s.substring(s.indexOf(".") + 1).trim();
    }

    public static void ques1(String s) {
        StringTokenizer st = new StringTokenizer(s, ":");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }

    public static String ques2(String doc, String target, String rep) {
        return doc.replaceAll(target, rep);
    }

    public static void ques3(String x) {
        for (int i = 0; i < x.length(); i++)
            if (x.indexOf(x.charAt(i)) == x.lastIndexOf(x.charAt(i))) {
                System.out.println("The 1st non repeated char is: " + x.charAt(i));
                break;
            }
    }

    public static void main(String[] args) {
        // String s = "Sam Penn :14 Bridge St. :Hoboken, NJ01881";
        // ques1(s);
        // String s1 = "To be or not to be, that is the question";
        // System.out.println(ques2(s1, "be", "see"));
        // ques3(s);
        // String s = "Mr. Sachin Tendulkar";
        // System.out.println(ques4(s));
        // String s2 = "Sachin";
        // System.out.println(ques5(s, s2));
        String s = "Ankit Raj Biswal";
        System.out.println(ques6(s, "a"));

    }
}

// 1. Write a method that takes a delimited string to store a name and address,
// from
// which you can print a mailing label. For example, if the string contains “Sam
// Penn:14 Bridge St.:Hoboken, NJ 01881,” the method should print the label
// shown
// in the below:
// Sam Penn
// 14 Bridge St.
// Hoboken, NJ 01881

// 2. The global replace function is a string-processing algorithm found in
// every word
// processor. Write a method that takes three String arguments: a document, a
// target
// string, and a replacement string. The method should replace every occurrence
// of the target string in the document with the re- placement string. For
// example,
// if the document is “ To be or not to be, that is the question,” and the
// target
// string is “be,”, and the replacement string is “see,” the result should be,
// “To see
// or not to se...

// 3. Write a Java program to find first non repeating character in a string .
// Example: The given string is: gibblegabbler
// The first non repeated character in String is: i

// 4. Write a java program to remove the title from a name.
// Ex. Input: Mr. Sachin Tendulkar
// Ms. Saina Nehwal
// Output: Sachin Tendulkar
// Saina Nehwal

// 5. Write a java program to read two string as user input and check if first
// contains
// second?

// 6.Write a java code to remove all occurrences of a given character from an
// input
// String?