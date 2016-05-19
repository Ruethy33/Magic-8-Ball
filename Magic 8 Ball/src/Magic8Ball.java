import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Magic8Ball
	{
		public static void main(String[] args)
			{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Give me a full number between 1-8 and I will tell your future.");
				int number = userInput.nextInt();
				switch (number)
					{
					case 1:
					case 2:
						{
						System.out.println("You have good fortune coming yoiur way soon.");
						break;
						}
					case 3:
					case 4:
						{
						System.out.println("Sorry, but i see bad times coming.");	
						break;
						}
					case 5:
					case 6:
						{
						System.out.println("I don't see much excitement in your future.");	
						break;
						}
					case 7:
					case 8:
						{
						System.out.println("You will have a long and prosperous life.");
						break;
						}
					}	
				}
		}
