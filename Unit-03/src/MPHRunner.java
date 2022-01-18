//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Daniel Egorov
//Date - 18 Jan 2022
//Class - APCSA
//Lab  - Unit 3 MPH

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();
		
		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		test.calcMPH();
		System.out.println(test.toString());
		
		System.out.println("\nOther Test Cases:");
		test = new MilesPerHour(197, 2, 20);
		test.calcMPH();
		System.out.println(test.toString());
		
		test = new MilesPerHour(365, 3, 47);
		test.calcMPH();
		System.out.println(test.toString());
		
		test = new MilesPerHour(23, 17, 30);
		test.calcMPH();
		System.out.println(test.toString());
	}
}