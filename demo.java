import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import javax.swing.plaf.synth.SynthSplitPaneUI;
public class demo{

		    // public static void main(String[] args) throws IOException {
		    //     InputStreamReader r = new InputStreamReader(System.in);
		    //     BufferedReader br = new BufferedReader(r);
		    //     String n = br.readLine();
		    //     System.out.println("Hello "+n);
		    // }

		    public static void main(String[] args) throws IOException {
		        String str ;
		        Console con = System.console();
		        if(con==null){
		            System.out.println("no console available");

		        }
		        str = con.readLine("Enter your name");
		        con.printf("Name %s\n ",str);

		        System.out.println("Enter the password");
		        char[] chh = con.readPassword();

		        String pass = String.valueOf(chh);
		        // String pass = con.readPassword(); // we cannot do this as the return type of readPassword is the arry of characters
		        System.out.println("Provided password is = "+pass);
		    }
		

	}

