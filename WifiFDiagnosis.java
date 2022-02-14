/*
 * Class: CMSC203 
 * Instructor:
 * Description: 
 * Due: 2/14/2022
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Geronimo Restrepo
*/

import java.util.Scanner;
public class WifiFDiagnosis {

	public static void main(String[] args) {
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
		
//Input string for "yes" or "no. Step int for the number of the step (First step, Second step, etc.)		
		String input;
		int step = 0;
		
		Scanner keyboard = new Scanner(System.in);
/*1*/	System.out.println("\nFirst step: reboot your computer\n" + "Are you able to connect with the internet? (yes or no)");
		input = keyboard.next();
		
		if (input.equals("yes")) 
		{
		step = 1;
		}
		
/*2*/	if (input.equals("no"))
		{
			System.out.println("Second step: reboot your router\n" + "Now are you able to connect with the internet? (yes or no)");
			input = keyboard.next();
			step = 2;
		}

/*3*/	if(input.equals("no"))
		{
			System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power\n" + "Now are you able to connect with the internet? (yes or no)");
			input = keyboard.next();
			step = 3;
		}

/*4*/	if(input.equals("no"))
		{
			System.out.println("Fourth step: move your computer closer to yoour router\n" + "Now are you able to connect with the internet? (yes or no)");
			input = keyboard.next();	
			step = 4;
		}
			
/*5*/	if (input.equals("no"))
		{
			System.out.println("Fifth step: contact your ISP\n" + "Make sure your ISP is hooked up to your router.");	
		}

//switch for any "yes" inputs
		switch(step)
		{
		case 1:
		
			System.out.println("Rebooting your computer seemed to work.");
			break;
			
		case 2:
			System.out.println("Rebooting your router seemed to work.");
			break;
			
		case 3:
			System.out.println("Checking the router's cables seemed to work.");
			break;
		case 4:
			System.out.println("Moving your computer closer to your router seemed to work.");
			break;
			
		}	
		System.out.println("Geronimo Restrepo");
	}

}
