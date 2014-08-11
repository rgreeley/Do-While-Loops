import java.util.Scanner;
import java.util.Random;

public class AgainwiththeNumberGuessing
{

		public static void main( String[] args )
		{
		
			Scanner keyboard = new Scanner(System.in);
			Random r = new Random();
			
					int number = 1 + r.nextInt(10);
					int tries = 0;
					int guess;

					System.out.print( "I am thinking of a number between 1-10. Try and guess and you shall earn a chocolate. " );
					System.out.print( "Your number is...." );
					guess = keyboard.nextInt();
					
					do
					{
						tries++;
						if ( guess != number );
						{
							System.out.println( "Sorry not right. How about another guess?" );
							System.out.print( "New number..." );
							guess = keyboard.nextInt();
						}	
					}while ( guess != number );

						System.out.println( "Looks like you get a chocolate." );
						System.out.println( "It only took about " + tries + " this time!" );
			}
						
}


