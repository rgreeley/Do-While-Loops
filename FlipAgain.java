import java.util.Random;
import java.util.Scanner;

public class FlipAgain
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();

		String again;
		
		System.out.print( "Would you like to flip a coin (y/n)? " );
		again = keyboard.next();

		do
		{
			int flip = rng.nextInt(2);
			String coin;

			if ( flip == 1 )
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println( "You flip a coin and it is... " + coin );

			System.out.print( "Would you like to flip again (y/n)? " );
			again = keyboard.next();
			
		}  while ( again.equals("y") );
		
		//The code does still work. Because the do loop runs as it should the first time
		//the while runs it again afterwards
	}
}
