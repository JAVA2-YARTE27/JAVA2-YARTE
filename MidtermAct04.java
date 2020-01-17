import java.io.File; 
import java.util.Scanner; 
import java.io.*;

public class MidtermAct04
{
	public static void main(String[] args) {
		try {
			File infile = new File("Phonebook.txt");
			Scanner input = new Scanner(infile);
			String data = "";

			while (input.hasNext()){
				data = input.next();
				if(data.equals("1001-11")) {
					System.out.print("We've Found the Record!");
					break;
				}
			}
			input.close();

			PrintWriter out = new PrintWriter ("Record_found.txt");
			Scanner in = new Scanner(infile);
			while (in.hasNext()){
				String str = in.next();
				if(str.equals("1001-11")) {
					out.println("Code: " + str);
					out.println("First_Name: " + in.next());
					out.println("Last_Name: " + in.next());
					out.println("CP #: " + in.next());
					break;
				}
			}
			out.close();
			in.close();

		} catch (IOException e) {
            System.out.println("Exception");
        }
	}
}
