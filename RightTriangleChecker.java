import java.util.Scanner;

	public class RightTriangleChecker
	{
	
		public static void main( String[] args )
		
			{
			
				Scanner keyboard = new Scanner(System.in);
				
				int side1, side2, side3;

					System.out.println( "Enter three integers:" );
					System.out.print( "Side 1: " );
					side1 = keyboard.nextInt();
			
				do
				{
					System.out.print( "Side 2: " );
					side2 = keyboard.nextInt();
					
					if ( side1 > side2 )
					System.out.println( "Sorry " + side2 + " is smaller than " + side1 + ". Try again." );
					
				} while ( side1 > side2);

				do
				{
					System.out.print( "Side 3: " );
					side3 = keyboard.nextInt();
					
					if ( side2 > side3 )
						System.out.println( "Sorry " + side3 + " is smaller than " + side2 + ". Try again." );

					} while ( side2 > side3 );


					System.out.println( "The sides you have chosen are... " + side1 + " " + side2 + " " + side3 + " lets see what happens" );
						
						boolean check = side1 * side1 + side2 * side2 == side3 * side3;
						
					if (check == true )
					
						System.out.println( "These sides *do* make a right triangle. Yippy-skippy!" );
						
					else
					
						System.out.println( "NO! These sides do not make a right triangle!" );
			}
}