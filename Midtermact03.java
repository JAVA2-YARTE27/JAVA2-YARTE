import java.io.*;
import java.util.*;

public class Midtermact03
{
		public static void main(String[] args) {
		try{
						File infile = new File("phonebook.txt");
						Scanner input = new Scanner(infile);
						String sdata = "";

						while (input.hasNext()){
								sdata = input.next();

								if(sdata.equals("1001-12")) {
										System.out.println("Code Found!");
										System.out.println("Code:" +sdata);
										System.out.println("First Name: " +input.next());
										System.out.println("Last Name: " +input.next());
										System.out.println("CP No: " +input.next());
										continue;
								}
						}
						input.close();
		
		}catch (IOException e) {
		System.out.println(e);
	}
	}
}