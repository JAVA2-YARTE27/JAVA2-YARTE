import java.io.*;

public class Prelimact01
{
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("phonebook.txt"));
			String data = "";

			while((data = in.readLine()) != null) {
				System.out.println(data.toString());
			}
			in.close();

		} catch (IOException e) {
            System.out.println(e);
        }
	}
}