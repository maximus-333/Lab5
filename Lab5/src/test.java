
import java.util.Scanner;



public class test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Part 1 - put number into power");
		System.out.print("Input real number and integer power: ");
		float number = scanFloat(input);
		int power = scanInt(input);
		System.out.println("Result with tail recursion: " + Part1.powerA(number, power));
		System.out.println("Result without tail recursion: " + Part1.powerB(number, power));
		
		System.out.println();
		System.out.println("Part 2 - values with their squares inside of range");
		System.out.print("Input lower and higher end of range(both Integers): ");
		int lowRange = scanInt(input);
		int highRange = scanInt(input);
		System.out.print("Result with tail recursion: ");
		Part2.printResultA(lowRange, highRange);
		System.out.print("Result without tail recursion: ");
		Part2.printResultB(lowRange, highRange);
		
		input.close();
	}
	
	private static float scanFloat(Scanner device)
	{
		while(true)
		{
			if(device.hasNextFloat())
			{
				float val = device.nextFloat();
				//device.next();	//skip '\n' symbol
				return val;
			}
			else
			{
				System.out.println("Failed to find Float value! Try again");
				device.nextLine();
				continue;
			}
		}
	}
	
	private static int scanInt(Scanner device)
	{
		while(true)
		{
			if(device.hasNextInt())
			{
				int val = device.nextInt();
				//device.next();	//skip '\n' symbol
				return val;
			}
			else
			{
				System.out.println("Failed to find Int value! Try again");
				device.nextLine();
				continue;
			}
		}
	}
}
