import java.util.Random;
import java.util.Scanner;

public class ShorterDoubleDice
{
		public static void main( String[] args )
		{
		
			Random r = new Random();
			Scanner keyboard = new Scanner(System.in);

			System.out.println( "Press ENTER to see the roll of the dice!" );
			keyboard.nextLine();
			System.out.println();

			int dice1 = 1 + r.nextInt(6);
			int dice2 = 1 + r.nextInt(6);
			
				System.out.println( "Your first roll is " + dice1 );
				System.out.print( "Press enter for your next one..." );
				keyboard.nextLine();
				System.out.println( "Your second roll is " + dice2 );
				System.out.println( "The total is " + (dice1 + dice2) );
							
			do 
			{
				dice1 = 1 + r.nextInt(6);
				dice2 = 1 + r.nextInt(6);
				
				System.out.println( "\nRoll #1: " + dice1 );
				System.out.println( "Roll #2: " + dice2 );
				System.out.println( "The total is " + (dice1 + dice2) + "!" );
				
			} while ( dice1 != dice2 );
		}
}




