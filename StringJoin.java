package ankit;


public class StringJoin {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        concatWithString();

        System.out.println("Time for String : " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        concatWithBuffer();
        System.out.println("Time for StringBuffer : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static String concatWithString() {
        String t = "iter";
        for (int i = 0; i < 10000; i++)
            t = t + "SOADU";
        return t;
    }

    public static StringBuffer concatWithBuffer() {
        StringBuffer s = new StringBuffer("ITER");
        for (int i = 0; i < 10000; i++)
            s.append("SOADU");
        return s;
    }

}

// StringTokenizer a = new StringTokenizer("I am learning String Tokenizer",
// "");

// while (a.hasMoreTokens()) {
// System.out.println(a.nextToken());
// }

// StringTokenizer b = new StringTokenizer("java:python:javascript:c++", ":",
// false);

// while (b.hasMoreTokens()) {
// System.out.println(b.nextToken());
// }

// StringTokenizer c = new StringTokenizer("Flutter .Android .IOS .React ", ".",
// true);

// while (c.hasMoreElements()) {
// System.out.println(c.nextElement());
// }

// StringBuffer s1 = new StringBuffer("Welcome to ITER");
// s1.append("-AIO");
// System.out.println(s1);

// s1.insert(0, "Hey, ");
// System.out.println(s1);

// s1.reverse();
// System.out.println(s1);

// s1.reverse();
// s1.replace(0, 4, "Hello,");
// System.out.println(s1);

// s1.delete(0, 7);
// System.out.println(s1);

// s1.append("\nhttps://tiny.cc/iteraio");
// System.out.println(s1);
