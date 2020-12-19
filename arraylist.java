package ankit;
import java.util.*;
public class arraylist {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        // List<Integer> al = new ArrayList<Integer>();
	        // al.add(1);
	        // al.add(1);
	        // al.add(1);
	        // al.add(1);
	        // al.add(1);
	        // Integer add = 0;
	        // for (int i = 0; i < al.size(); i++)
	        // add += al.get(i);
	        // // add += new Integer(al.get(i).toString());
	        // System.out.println(add);

	        /// WAP to add 5 double values into a list and display the elements those are
	        /// greater than 5.5

	        // List<Double> list = new ArrayList<Double>();
	        // list.add(4.2);
	        // list.add(7.8);
	        // list.add(2.6);
	        // list.add(9.2);
	        // list.add(5.5);

	        // for (int i = 0; i < list.size(); i++)
	        // if (list.get(i) > 5.5)
	        // System.out.println(list.get(i));

	        /// WAP to take 5 names and display them in sorted order (alphabetic)

	        List<String> list = new ArrayList<String>();
	        list.add("Ankit Raj");
	        list.add("Joy");
	        list.add("Ayush");
	        list.add("Shivum");
	        list.add("Uma");

	        list = SortList(list);
	        System.out.println(list.get(0));

	        // for (String s : list)
	        // System.out.println(s);
	    }

	    private static List<String> SortList(List<String> list) {
	        int size = list.size();
	        for (int i = 0; i < size - 1; i++) {
	            for (int j = i + 1; j < size; j++) {
	                if (list.get(i).compareTo(list.get(j)) > 0) {
	                    String temp = list.get(i);

	                    list.set(i, list.get(j));
	                    list.set(j, temp);
	                }
	            }
	        }
	        return list;

	    }
	}


