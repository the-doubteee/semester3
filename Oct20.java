package ankit;

import java.util.StringTokenizer;

public class Oct20 {
    public static String reverseWord(String s) {
        StringTokenizer st = new StringTokenizer(s, " ");
        StringBuffer x = new StringBuffer();
        while (st.hasMoreTokens()) {
            StringBuffer sb = new StringBuffer(st.nextToken());
            x.append(sb.reverse() + " ");
        }
        return x.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWord("Hi this is Ayush Kejariwal"));
        // String name1 = "beer";
        // String name2 = "bear";
        // String name3 = "bearer";

        // System.out.println(Soundex.getGode(name1));
        // System.out.println(Soundex.getGode(name2));
        // System.out.println(Soundex.getGode(name3));
    }
}

// 1. Write a java program to input a string from user and reverse each word of
// the
// string.

// Concept -----> SOUNDEX
