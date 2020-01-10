import java.io.*;

public class Prelimact02
{
	public static void main (String [] args) throws IOException {
	 		try{
				BufferedReader in = new BufferedReader (new FileReader("phonebook.txt"));
				String xdata = "", firstname = "", lastname = "", cpn = "";
				int ascii = 0 , colon = 0;
				Boolean hasFound = false;

				while (((ascii = in.read())!= -1)) {
						String x = String.valueOf((char)ascii);
						xdata += String.valueOf((char)ascii);

						if(ascii == '\n') {
							xdata = "";
							colon = 0;
						}
						if(ascii == ':') {
							colon++;
						}
						if(xdata.equals("1001-11")) {
							System.out.println("We've have found a record!!!");
							hasFound = true;
						}
						if(hasFound == true && xdata != ":") {
							if(colon == 1) firstname += String.valueOf (((char)ascii));
							if(colon == 2) lastname += String.valueOf (((char)ascii));
							if(colon == 3) cpn += String.valueOf (((char)ascii));
						}
						if(hasFound == true && ascii == '\n') hasFound = false;
				}
				in.close();

				System.out.println("Firstname " + firstname);
				System.out.println("Lastname " + lastname);
				System.out.println("Cpn " + cpn);
				
			} catch (IOException e) {
				System.out.println(e);
		}
		}
}
