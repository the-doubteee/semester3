package ankit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
// import java.util.Scanner;
import java.util.StringTokenizer;

public class countingDivisors {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        HashSet<Integer> bag = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            bag.add(sc.nextInt());
        }
        for (Integer integer : bag) {

            System.out.println(count(integer));
        }
        // System.out.println(bag.size());
        // while (n-- > 0) {
        // int a = sc.nextInt();
        // System.out.println(count(a));
        // }
    }

    public static int count(int x) {
        int cnt = 0;
        for (int i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                if (x / i == i)
                    cnt++;
                else
                    cnt += 2;
            }
        }
        return cnt;
    }

    // Alternative of Scanner Class to get Fast Input
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
