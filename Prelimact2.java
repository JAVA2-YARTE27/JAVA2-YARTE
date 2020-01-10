import java.io.*;

public class Prelimact2
{
	public static void main (String [] args){
			BufferedReader in = new BufferedReader (new FileReader("phonebook.txt"));
			String data ="";
			while ((data=in.readLine())!=null){
				if(data.toString().equal("1001-11"))
				{
				System.out.println("We're found the record!");
				data = in.read();
				System.out.println("First:"+data.toString());
				data = in.read();
				System.out.println("Lastname:"+data.toString());
				data = in.read();
				System.out.println("CP#:"+data.toString());
				}
				in.close();
				System.out.println("Exception");
			}
		}
} 
