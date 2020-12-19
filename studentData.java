package ankit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class studentData {
    public static void main(String[] args) {

        LinkedList<Student> data = new LinkedList<Student>();

        // List<Student> data = new ArrayList<Student>();

        data.add(new Student("Ankit", 19, "cse"));
        data.add(new Student("Joy", 19, "csit"));
        data.add(new Student("Shivum", 18, "cse"));
        data.add(new Student("Uma", 17, "csit"));
        data.add(new Student("Purru", 20, "cse"));

        System.out.println("List of Student-Data:");
        for (Student student : data) {
            System.out.println(student.toString());
        }
        System.out.println();
        data = AgeSortList(data);
        System.out.println("Sorted List of Student-Data:");
        for (Student student : data) {
            System.out.println(student.toString());
        }
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

    private static LinkedList<Student> AgeSortList(LinkedList<Student> list) {
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (list.get(i).getAge() > list.get(j).getAge()) {
                    Student temp = list.get(i);

                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }
}

class Student {
    private String name;
    private int age;
    private String branch;

    Student(String n, int a, String g) {
        this.name = n;
        this.age = a;
        this.branch = g;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBranch() {
        return branch;
    }

    public String toString() {
        return "Name: " + name + "\t\t Age: " + age + " Branch: " + branch;
    }
}
