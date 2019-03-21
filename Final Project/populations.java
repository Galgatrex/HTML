import java.util.Scanner; // Needed for the Scanner class
import javax.swing.JOptionPane;
import java.io.*;

public class populations
{	
	public static void main(String[] args) throws IOException
	{ 
		int[] populations = new int[40];
		int index = 0;
		
	
		// Open the file
		File file = new File("USPopulations.txt");
		Scanner inputFile = new Scanner(file);
		
		// Read the file contents into the array
		while (inputFile.hasNext() && index < populations.length)
		{
			populations[index] = inputFile.nextInt();
			index++;
		}
	
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner (System.in);
				
		int[] change = getArray(populations);
		int avg = getAvg(change);
		int lowest = getLowest(change);
		int highest = getHighest(change);
		
		displayNumbers(avg, highest, lowest);
		//showArray(populations);
		//showArray(change);
	}
		
		// Average annual change in population
		// Year with greatest increase in population
		// Year with smallest increase in population
		
	// possibly create new array to store results of this equation?
	public static int[] getArray(int[] populations)
	{
		int[] change = new int[39];
		int index = 0;
		int windex = 1;
		
		for (index = 0, windex = 1; windex < populations.length; index++, windex++)
		{
			change[index] = populations[windex] - populations[index];
		}
		
		return change;
	}
	
	public static int getAvg(int[] change)
	{
		int total = 0; // initialize accumulator
		int avg = 0;
		
		for (int index = 0; index < change.length; index++)
			total += change[index];
		
		avg = total / 39;
		
		// Return total
		return avg;
	}
	
	public static int getHighest(int[] change)
	{	
		int highest = change[0];
		
		for (int index = 1; index < change.length; index++)
		{
			if (change[index] < highest)
				highest = change[index];
		}
		
		return highest;
	}
		
	public static int getLowest(int[] change)
	{		
		int lowest = change[0];
		
		for (int index = 1; index < change.length; index++)
		{
			if (change[index] > lowest)
				lowest = change[index];
		}
		
		return lowest;
	}

	public static void displayNumbers(int avg, int lowest, int highest)
	{
		System.out.println("The average annual change was " + avg + "000 people.");
		System.out.println("The lowest annual change was " + lowest + "000 people.");
		System.out.println("The highest annual change was " + highest + "000 people.");
	}
		
/*	
	public static void showArray(int[] populations)
	{
		{
			// Display array
			for (int index = 0; index < populations.length; index++)
				System.out.println(populations[index] + " ");
		}
	}
	public static void showArray2(int[] change)
		{
			// Display change
			for (int index = 0; index < change.length; index++)
				System.out.println(change[index] + " "); 
		} 
*/

}	

		
		
		