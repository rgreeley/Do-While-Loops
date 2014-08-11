import java.util.Scanner;

public class SafeSquareRoot
{

		public static void main( String[] args )
		{
			Scanner keyboard = new Scanner(System.in);
			
			double n, x;
			
			System.out.println( "SQUARE ROOT!" );
			System.out.print( "Enter a number. Please remember no negatives..." );
			n = keyboard.nextDouble();
			
			while (n < 0)
			{
				System.out.println( "Remember when I said no negatives. Let's try this again." );
				System.out.print( "New number please:" );
				n = keyboard.nextDouble();
			}
			
			x = Math.sqrt(n);
			
				System.out.println("The square root of the number you have chosen " + n + " is " + x + "!" );
				System.out.println("Thanks for playing!!!");
		}
}