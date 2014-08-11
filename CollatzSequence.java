import java.util.Scanner;

	public class CollatzSequence
	{
	
		public static void main( String[] args )
		
		{
		
			Scanner keyboard = new Scanner(System.in);
			
			int number, steps = 0, largest = 0;
			
			System.out.print("Please provide me with a number: ");
			number = keyboard.nextInt();
			
			do
			{
				steps++;
				if( number %2 == 0 )
			{
				
				number = number / 2;
				System.out.print( + number );
				
			}
			
			else
			{
				number = (number * 3) + 1;

				System.out.print( number );
			}
				
				System.out.print( number + "\t" );
				
				if( number > largest )
				largest = number;	

			} while (number != 1 );
			
				System.out.println("\nTerminated after " + steps + " steps. The largest value was " + largest + ".");
		}
}


