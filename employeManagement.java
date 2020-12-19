package ankit;

//Write a program to create an employee database by taking the help of collections framework using java following are the conditions to be taken care of :
//1.you will consider two user 1= administrator and other is the employee 
//the work of demonstrator to add and update the employee database 
//The work of an employee is simply is to access his own database only 
//Database includes employee ID employee name , age , gender , employee departmant and employee sayary 
//Employee Id must be unique for each employee. 
//2.If employee try to access any other  employess database a message will be displayed you are authorised to accessed your database.
//3.To access his or her employee database an employee has to enter an Id and a password that includes first 4 leetter of the first name and the DOB in the following format "subr2503 "
//Author: Ankit Raj Biswal

import java.util.Scanner;
import java.util.TreeMap;

public class employeManagement {
 private static TreeMap<String, Employee> db = new TreeMap<String, Employee>();

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int isExit = 0;

     do {
         System.out.println("Hey Welcome!\n");
         System.out.println("Are you an admin?(Y/N)");
         boolean isAdmin = sc.nextLine().toUpperCase().charAt(0) == 'Y';

         if (isAdmin)
             admin(sc);
         else
             employee(sc);
         System.out.println("Do you want to continue?(Press 0 to exit)");
         isExit = sc.nextInt();
         sc.nextLine();
     } while (isExit != 0);
     sc.close();
 }

 private static void admin(Scanner sc) {
     do {
         System.out.println(
                 "Admin Menu\n1. Add an Employee\n2. Remove an Employee\n3. Update an Employee Details\n4. View an Employee Details\n0. Exit");
         int choice = sc.nextInt();
         switch (choice) {
             case 0:
                 System.out.println("Thanks for using our DBMS");
                 return;
             // break;
             case 1:// add an employee
                 addEmployeeToDB(sc);
                 break;
             case 2:// remove an employee
                 removeEmployee(sc);
                 break;
             case 3:// update an employee
                 updateEmployee(sc);
                 break;
             case 4:// view an employee details
                 System.out.print("Enter Employee ID to View Details: ");
                 sc.nextLine();
                 String id = sc.nextLine();
                 if (db.containsKey(id))
                     System.out.println("Details of Employee:\n" + db.get(id).toString());
                 else
                     System.out.println("No such Employee exist!");
                 break;

             default:
                 break;
         }
     } while (true);
 }

 private static void updateEmployee(Scanner sc) {
     System.out.print("Enter Employee ID to update Details: ");
     sc.nextLine();
     String id = sc.nextLine();
     if (db.containsKey(id)) {
         System.out.println("What do you want to update?\n1.Name\n2.Age\n3.Date of Birth\n4.Department\n5.Salary");
         switch (sc.nextInt()) {
             case 1:// name
                 System.out.println("Enter new Name");
                 String name = sc.nextLine();
                 db.get(id).updateName(name);
                 break;

             case 2:// age
                 System.out.println("Enter new Age");
                 int age = sc.nextInt();
                 db.get(id).updateAge(age);
                 break;
             case 3:// DOB
                 System.out.println("Enter new Date of birth (ddmmyy)");
                 String dob = sc.nextLine();
                 db.get(id).updateDob(dob);
                 break;
             case 4:// Depart.
                 System.out.println("Enter new Department");
                 String d = sc.nextLine();
                 db.get(id).updateDepartment(d);
                 break;
             case 5:
                 System.out.println("Enter new Salary");
                 double s = sc.nextDouble();
                 db.get(id).updateSalary(s);
                 break;

             default:
                 break;
         }
     } else
         System.out.println("No such Employee exist!");
 }

 private static void removeEmployee(Scanner sc) {
     System.out.println("Enter an id to remove from DB");
     sc.nextLine();
     String id = sc.nextLine();
     if (db.containsKey(id))
         db.remove(id);
     else
         System.out.println("No such Employee exist!");
 }

 private static void addEmployeeToDB(Scanner sc) {
     System.out.println("Enter Employee Details to add");
     System.out.print("Id: ");
     sc.nextLine();
     String id = sc.nextLine();
     if (db.containsKey(id)) {
         System.out.println("Employee id already exists!");
         return;
     }

     System.out.print("Name: ");
     String name = sc.nextLine();

     System.out.print("Date of Birth(ddmmyy): ");
     String dob = sc.nextLine();

     System.out.print("Age: ");
     int age = sc.nextInt();

     System.out.print("Gender(M/F): ");
     sc.nextLine();
     char g = sc.nextLine().toUpperCase().charAt(0);

     System.out.print("Department: ");
     String dep = sc.nextLine();

     System.out.print("Salary: ");
     double salary = sc.nextDouble();

     Employee e = new Employee(id, name, dob, age, g, dep, salary);
     db.put(id, e);
 }

 private static void employee(Scanner sc) {
     System.out.print("Enter your id: ");
     String id = sc.nextLine();
     if (!db.containsKey(id)) {
         System.err.println("No such Employee id exists");
         return;
     }
     System.out.print("Enter your password(nameDOB): ");
     String password = sc.nextLine();
     String dbpassowrd = db.get(id).getFirstName().toLowerCase().length() > 4
             ? db.get(id).getFirstName().toLowerCase().substring(0, 4)
             : db.get(id).getFirstName().toLowerCase() + "" + db.get(id).getDOB().substring(0, 4);
     // String dbpassowrd = db.get(id).getFirstName().toLowerCase() + "" +
     // db.get(id).getDOB().substring(0, 4);
     // System.out.println(dbpassowrd);
     if (dbpassowrd.compareTo(password) == 0) {
         System.out.println("Valid Login!");
         System.out.println("\nDetails of Employee:\n" + db.get(id).toString());
     } else
         System.err.println("Incorrect Password");

 }
 // Employee e = new Employee("1941012238", "Ankit Raj Biswal", "120300", 19, 'M',
 // "CSE", 2001);
}

class Employee {
 private String id;
 private String name;
 private String dob;
 private int age;
 private char gender;
 private String department;
 private double salary;

 public Employee(String id, String name, String dob, int age, char gender, String department, double salary) {
     this.id = id;
     this.name = name;
     this.dob = dob;
     this.age = age;
     this.gender = gender;
     this.department = department;
     this.salary = salary;
 }

 public String getId() {
     return id;
 }

 public String getName() {
     return name;
 }

 public String getDOB() {
     return dob;
 }

 public String getFirstName() {
     if (name.contains(" "))
         return name.split(" ")[0];
     else
         return name;
 }

 public void updateName(String n) {
     this.name = n;
 }

 public void updateDob(String dob) {
     this.dob = dob;
 }

 public void updateAge(int a) {
     this.age = a;
 }

 public void updateDepartment(String d) {
     this.department = d;
 }

 public void updateSalary(double sal) {
     this.salary = sal;
 }

 @Override
 public String toString() {
     String s = "Id:\t" + id + "\nName:\t" + name + "\nAge:\t" + age + "\nGender:\t" + gender + "\nDep.:\t"
             + department + "\nSalary:\t" + salary;
     return s;
 }
 // Employee("1941012238", "Ankit Raj Biswal", "120300", 19, 'M', "CSE", 2001y)
}