
/*Question 4: You are required to write classes for student details (name, registration number,
   \fathers name), address (current address, permanent address, contact number, email Id)
   using inheritance concept where address is child class.*/
package ankit;
import java.util.*;
public class Q4_Test {
    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = an.nextLine();
        System.out.print("Enter Your Father's Name: ");
        String fname = an.nextLine();
        System.out.print("Enter Your Regd No.: ");
        String regd = an.nextLine();

        System.out.print("Enter Your Current Address: ");
        String caddress = an.nextLine();
        System.out.print("Enter Your Parent's Address: ");
        String paddress = an.nextLine();
        System.out.print("Enter email: ");
        String email = an.nextLine();
        System.out.print("Enter Your Phone No.: ");
        String phone = an.nextLine();

        MyAddress ad = new MyAddress(caddress, paddress, phone, email, name, fname, regd);
        ad.show();

    }
}

class MyInfo {
    String name, regNum, fatherName = "";

    MyInfo(String n, String r, String fn) {
        name = n;
        regNum = r;
        fatherName = fn;
    }

    void show() {
        System.out.println("Name : " + name);
        System.out.println("Registration num  : " + regNum);
        System.out.println("Father's name : " + fatherName);

    }

}

class MyAddress extends MyInfo {

    String tempAdr, permAdr, contactNum, email = "";

    MyAddress(String tempAdr, String permAdr, String contactNum, String email, String n, String r, String fn) {
        super(n, r, fn);
        this.tempAdr = tempAdr;
        this.permAdr = permAdr;
        this.contactNum = contactNum;
        this.email = email;
    }

}

// Ankit Raj Biswal
// 1941012238 CSE-D