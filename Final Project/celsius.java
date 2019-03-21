import java.util.Scanner; // Needed for the Scanner class
import javax.swing.JOptionPane;

public class celsius
{
	
	public static void main(String[] args) 
	{ 
	
		// Declared variables
		double getLength;
		double getWidth;
		double getArea;
		double ctemp;
		double ftemp;
	
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner (System.in);
		
		// User input temperature
		System.out.println(" Enter fahrenheit temp: ");
		ftemp = keyboard.nextDouble();
		
		// Table format
		System.out.println("Temp in C\t\t\tTemp in F"); 
		System.out.println("-------------------------------------------");
		
		celsius(ftemp);
		System.exit(0);
	}
	
	public static double celsius(double ftemp)
	{
		
		double ctemp = 0;
					
		for (ftemp = 0; ftemp<= 20; ftemp++)
		{ 
			ctemp = 5.0/9.0 * (ftemp - 32.0);
			
			System.out.printf(" %.2f ", ctemp);
			System.out.printf("\t\t %.2f .\n", ftemp);

		}
		
		return ctemp;
	}
}
	

		
		
		
		
		
		
		
		
		