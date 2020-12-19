package ankit;
import java.util.LinkedList;
// Review Required---Errors
public class linkedlisttest2 {
    public static void main(String[] args) {
        LinkedList<Student> data = new LinkedList<Student>();
        data.add(new Student("Ankit", 20, "cse"));
        data.add(new Student("Joy", 19, "csit"));
        data.add(new Student("Shivum", 20, "eee"));
        data.add(new Student("Uma", 24, "cse"));

        LinkedList<Student> data2 = new LinkedList<Student>();
        data2.add(new Student("Aa", 20, "cse"));
        data2.add(new Student("Bb", 30, "csit"));
        data2.add(new Student("Ee", 22, "eee"));
        data2.add(new Student("Ff", 23, "me"));
        data2.add(new Student("Gg", 20, "cse"));

        System.out.println("List of Student-Data:");
        for (Student student : data)
            System.out.println(student.toString());

        System.out.println();
        System.out.println("Replaced Element " + (1 + 1) + ":\n" + data.get(1).toString());
        data.set(1, new Student("My", 14, "cse"));
        System.out.println("with New Element\n" + data.get(1).toString());

        System.out.println("\nList of Student-Data2:");
        for (Student student : data2)
            System.out.println(student.toString());

        System.out.println("\nAdding both Linked List");
        data.addAll(data2);
        data = NameSortList(data);
        System.out.println("List of all merged Student-Data:");
        for (Student student : data)
            System.out.println(student.toString());

        System.out.println("\nConverting Linked List to array list");
        Student[] arr = data.toArray(new Student[0]);
        System.out.println("Array Length: " + arr.length);
        System.out.println("3rd Element of array is:\n" + arr[2]);
    }

    private static LinkedList<Student> NameSortList(LinkedList<Student> list) {
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (list.get(i).getName().compareTo(list.get(j).getName()) > 0) {
                    Student temp = list.get(i);

                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }
}

