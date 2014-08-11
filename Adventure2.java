import java.util.Scanner;

	public class Adventure2
	{
	
		public static void main( String[] args )
		{
			
			Scanner keyboard = new Scanner(System.in);
			int nextroom = 0, room = 1;
			String choice = "";
			
			System.out.println("It's Adventure2 Time!");

			do
			{
				if( room == 1);
			{
			
					System.out.println("\nYou are in the kitchen and are bored.");
					System.out.print("Would you like to proceed to the office or go upstairs?");
					choice = keyboard.nextLine();
			}
			
				if( choice.equalsIgnoreCase("upstairs") )
			{
	
				room = 2;

					System.out.println("\nYou walk upstairs, you can go into the bedroom, or the bathroom." );
					System.out.print("Where would you like to go? Or do you go \"back\"?");
					choice = keyboard.nextLine();

				if( choice.equalsIgnoreCase("bedroom") )
			{

					System.out.println("\nYou head into the bedroom to find the ghost of christmas past." );

					room = 0;

			}
					else if (choice.equalsIgnoreCase("bathroom") )
			{

					System.out.println("You go into the bathroom and slip on a puddle of water left by your sister.");
					System.out.println("You hit your head and scream an obscenity.");
					System.out.println("Your mom walks in and yells at you for your profane language." );
			}

					else if (choice.equalsIgnoreCase("back") )
					
			{
					room = 1;
			}
			
					else
			{
					System.out.println("Not a valid entry.");
			}
			
		}
					if( choice.equalsIgnoreCase("office") )
		{

					room = 3;
					System.out.println("\nIn the office, there is a desk or an old \"box\".");
					System.out.print("Which do you open? The desk, the box, or do you go \"back\"?");

					choice = keyboard.nextLine();
			
					if( choice.equalsIgnoreCase("desk") )
			{
					
					System.out.println("\nYou find the plans to build a time machine.");
					System.out.println("Story for another time.....");
			}
			
					else if( choice.equalsIgnoreCase("box") )
					{	
						System.out.println("\nYou open the box and are never seen again....");
					}
					
					else if (choice.equalsIgnoreCase("back") )
					{
						room = 1;
					}
					
					else
					{
						System.out.println("Let's try that again.");
					}
					
			}
				} while ( room != 0 );
				
					System.out.println("\n You have died.");
	}
}