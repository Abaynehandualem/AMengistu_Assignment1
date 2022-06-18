/*
 * Class: CMSC203 CNR 46622 
 * Instructor: Prof.Grigoriy A. Grinberg
 * Description: (this program use for Wifi diagnosis)
 * Due: 06/19/2022
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: ABAYNEH MENGISTU
*/

/** 
 	
     If you have a problem with internet connectivity,
     this WiFi Diagnosis might work.

 */
 
import java.util.Scanner;

public class WifiDiagnosis
{
	
	
	public static void main(String[] args)
	{
				
		 String WifiDiagnosis;    
		 
		// Create a Scanner object for keyboard input.
		 
		Scanner keyboard = new Scanner(System.in);	
		
	//Step 1
				
		// the first step is to reboot the computer.
		System.out.println("\tIf you have a problem with internet connectivity" +
				                 "this WiFi Diagnosis might work.\n");
		
		System.out.println(">> Reboot the computer and try to connect:\n ");
		System.out.println("Now are you able to connect with the internet? (yes or no)\n ");
		
	// to hold the user input.
		WifiDiagnosis = keyboard.nextLine();
		
		if ( WifiDiagnosis.equalsIgnoreCase("yes"))
		
			{
				System.out.println(" Rebooting your computer seemed to work.\n ");
				return;
			}
		//Step 2 is to reboot the router.
		
		else if (WifiDiagnosis.equalsIgnoreCase("no"))
			{
			System.out.println(">> Reboot your router:\n ");
			System.out.println("Now are you able to connect with the internet? (yes or no)\n");
			}
		
		WifiDiagnosis = keyboard.nextLine();
		
		 if (WifiDiagnosis.equalsIgnoreCase("yes"))
		 
			
			{
				System.out.println("Rebooting your router seemed to work\n");
				return;
			}	
		 
		 //the third step is to make sure cables are connected properly.
			
		 	if (WifiDiagnosis.equalsIgnoreCase("no"))
				{
				System.out.println(">> Make sure the cables to your router are plugged " +
									"in firmly and your router is getting power\n");
				System.out.println("Now are you able to connect with the internet? (yes or no)\n ");
				}
		 
	 		WifiDiagnosis = keyboard.nextLine();
	
	 		if (WifiDiagnosis.equalsIgnoreCase("yes"))
						
				{
					System.out.println(" Checking the router's cables seemed to work\n");
					return;
				}
	 		
	 		//the fourth step to move the computer closer to the router.
	 		
	 		if (WifiDiagnosis.equalsIgnoreCase("no"));
	 			{
	 				System.out.print(">> move your computer closer to your router \n");
	 				System.out.println("Now are you able to connect with the internet? (yes or no)\n");
	 			}
	 			
	 			WifiDiagnosis = keyboard.nextLine();
	 			
	 			if (WifiDiagnosis.equalsIgnoreCase("yes"))
	 			{
	 				System.out.println("moveing your computer closer to your router seemed to work\n ");
	 				return;
	 			}
			// the last step is to contact the ISP.
	 			if (WifiDiagnosis.equalsIgnoreCase("no"))
	 			{
	 				System.out.println("Contact your ISP Make sure your ISP is hooked up to your router.\n");
	 			}
	}


}
