import java.util.Scanner;

public class MajorOutput01 {
	
	public static void main(String[] args)
	{
		int input =0;
		int total =0;
		double percentage = 0.0;
		Scanner keyboard = new Scanner(System.in);

		for(int i = 0; i <5; i++)
		{
			System.out.println("Please enter a value");
			input = keyboard.nextInt();
			total +=input; //total = total + input;
		}//end for

		percentage = total / 5.0;

		System.out.println("Your percentage is "+percentage);
	}
}