package ankit;
import java.util.Scanner;

class combineArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a[], b[], r[];

        // 1st Array Input
        System.out.print("Enter length of 1st array: ");
        a = new double[sc.nextInt()];
        System.out.print("Enter elements of 1st array: ");
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextDouble();

        // 2nd Array Input
        System.out.print("Enter length of 2nd array: ");
        b = new double[sc.nextInt()];
        System.out.print("Enter elements of 2nd array: ");
        for (int i = 0; i < b.length; i++)
            b[i] = sc.nextDouble();

        // initailising result array
        r = new double[a.length + b.length];

        int x = 0, y = 0, z = 0; // x,y,z are counters for a,b,r respectively
        while (z < r.length) {
            if (y < b.length && x < a.length) {
                if (a[x] > b[y]) {
                    r[z++] = b[y++];
                } else if (a[x] < b[y]) {
                    r[z++] = a[x++];
                } else {
                    r[z++] = a[x];
                    x++;
                    y++;
                }
            } else if (x >= a.length && y < b.length) {
                for (int i = y; i < b.length; i++)
                    r[z++] = b[i];
                break;
            } else if (x < a.length && y >= b.length) {
                for (int i = x; i < a.length; i++)
                    r[z++] = a[i];
                break;
            } else if (x >= a.length && y >= b.length)
                break;
            else
                z++;
        }

        for (int i = 0; i < r.length; i++) {
            if (r[i] != 0)
                System.out.print(r[i] + " ");
        }
        sc.close();
    }
}