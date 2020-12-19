package ankit;

public class array2d {
	 public static void main(String[] args) {
	        int y = 10;
	        int x[][] = new int[y][];
	        for (int i = 0; i < y; i++) {
	            int r = (int) (Math.random() * y / 2) + 1;
	            x[i] = new int[r];
	            for (int j = 0; j < r; j++) {
	                x[i][j] = i * j;
	            }
	        }

	        for (int i = 0; i < y; i++) {
	            for (int j = 0; j < x[i].length; j++) {
	                System.out.print(x[i][j] + "\t");
	            }
	            System.out.println();

	        }
}
}