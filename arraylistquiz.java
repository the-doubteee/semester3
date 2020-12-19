package ankit;
	import java.util.ArrayList;
	import java.util.List;

	public class arraylistquiz {
	    public static void main(String[] args) {
	        List<Integer> list = new ArrayList<Integer>();
	        list.add(1);
	        list.add(4);
	        list.add(3);
	        list.add(5);
	        list.add(2);

	        int size = list.size();
	        for (int i = 0; i < size - 1; i++) {
	            for (int j = i + 1; j < size; j++) {
	                if (list.get(i) > list.get(j)) {
	                    int temp = list.get(i);

	                    list.set(i, list.get(j));
	                    list.set(j, temp);
	                }
	            }
	        }

	        System.out.println("Maximum element is " + list.get(list.size() - 1));

	        for (int s : list)
	            System.out.println(s);
	    }
	}

