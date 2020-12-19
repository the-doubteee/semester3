package ankit;

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Scanner;

	public class biodata {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        List<Bio> data = new ArrayList<Bio>();

	        data.add(new Bio("Ankit", 20, 'm'));
	        data.add(new Bio("Anki", 19, 'f'));
	        data.add(new Bio("Ank", 18, 'f'));
	        data.add(new Bio("An", 17, 'f'));
	        data.add(new Bio("Ankit Raj Biswal", 20, 'm'));
	        // for (int i = 0; i < 5; i++) {
	        // Bio bio = new Bio();
	        // System.out.println("Enter Bio data of person " + (i + 1) + ":");
	        // System.out.print("Name: ");

	        // bio.setName(sc.next());
	        // System.out.print("Age: ");
	        // bio.setAge(sc.nextInt());
	        // System.out.print("Gender(m/f): ");
	        // bio.setGender(sc.next().toLowerCase().charAt(0));

	        // data.add(bio);
	        // }

	        System.out.println();
	        System.out.println("List of Bio-Data:");
	        for (Bio bio : data) {
	            System.out.println(bio.toString());
	        }

	        data.remove(new Bio("An", 18, 'm'));
	        System.out.println("Removed an element");
	        System.out.println(data.contains(new Bio("An", 18, 'm')));
	        System.out.println(data.toArray().length);
	        // Bio[] arr = (Bio[]) data.toArray();
	        // for (Bio bio : arr) {
	        // System.out.println(bio.toString());
	        // }
	    }
	}

	class Bio {
	    private String name;
	    private int age;
	    private char gender;

	    Bio(String n, int a, char g) {
	        this.name = n;
	        this.age = a;
	        this.gender = g;
	    }

	    // public void addAll(String n, int a, char g) {
	    // this.name = n;
	    // this.age = a;
	    // this.gender = g;
	    // }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public char getGender() {
	        return gender;
	    }

	    public void setGender(char gender) {
	        this.gender = gender;
	    }

	    public String toString() {
	        return "Name: " + name + "\t\t Age: " + age + " Gender: " + gender;
	    }
	}


