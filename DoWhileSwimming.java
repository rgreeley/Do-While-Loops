import java.util.Scanner;

public class DoWhileSwimming
{
	public static void main( String[] args ) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);

		String swimmer1 = "GALLANT";
		String swimmer2 = "GOOFUS ";

		double minimumTemperature = 79.0; // degrees Fahrenheit
		double currentTemperature;
		double savedTemperature;
		int swimTime;

		System.out.print("What is the current water temperature? ");
		currentTemperature = keyboard.nextDouble();
		savedTemperature = currentTemperature; // saves a copy of this value so we can get it back later.

		System.out.println( "\nOkay, so the current water temperature is " + currentTemperature + "F." );
		System.out.println( swimmer1 + " approaches the lake...." );

		swimTime = 0;
		while ( currentTemperature >= minimumTemperature )
		{
			System.out.print( "\t" + swimmer1 + " swims for a bit." );
			swimTime++;
			System.out.println( " Swim time: " + swimTime + " min." );
			Thread.sleep(600); // pauses for 600 milliseconds
			currentTemperature -= 0.5; // subtracts 1/2 a degree from the water temperature
			System.out.println( "\tThe current water temperature is now " + currentTemperature + "F." );
		}

		System.out.println( swimmer1 + " stops swimming. Total swim time: " + swimTime + " min." );

		currentTemperature = savedTemperature; // restores original water temperature

		System.out.println( "\nOkay, so the current water temperature is " + currentTemperature + "F." );
		System.out.println( swimmer2 + " approaches the lake...." );

		swimTime = 0;
		do
		{
			System.out.print( "\t" + swimmer2 + " swims for a bit." );
			swimTime++;
			System.out.println( " Swim time: " + swimTime + " min." );
			Thread.sleep(600);
			currentTemperature -= 0.5;
			System.out.println( "\tThe current water temperature is now " + currentTemperature + "F." );

		} while ( currentTemperature >= minimumTemperature );

		System.out.println( swimmer2 + " stops swimming. Total swim time: " + swimTime + " min." );
		
		// At 80.5 both swimmer swim for the exact same amount of time. 
		// Gallant does not swim at all while Goofus swims for 1 min.
		// It seems that Gallant does not test the water. He stops swimming at 0 min.
		// There is no note that Goofus test the water. He just beings to swim and then stops after 1 min.
		// A while loop will check before running. A Do while loop will run at least once.
		// A while loop is a pretest, it checks before the code is ran. A do while lopp is post test as it just runs the code.
		
	}
}

