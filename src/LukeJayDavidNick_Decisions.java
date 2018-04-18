import java.util.*;
public class LukeJayDavidNick_Decisions
{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int inp;
		do {
			System.out.println("Enter 1 for the if/else ladder practice");
			System.out.println("Enter 2 for the nested ifs practice");
			System.out.println("Enter 3 for the local variable in loops practice");
			System.out.println("Enter 4 for the complte control expression of boolean");
			System.out.println("Enter 5 for the switch statement practice");
			System.out.println("Enter 0 to exit this loop.");
			inp = reader.nextInt();
			if (inp == 1){
//					if else ladders:
				
				
				
				
				
				
				System.out.print("Enter an integer between 1 and 5 inclusive: "); /*asking the user for an input. 
																				  Multiple possible inputs*/
				int Choice = reader.nextInt();
				if(Choice == 1)
				{
					System.out.println("Your number is 1"); //if your choice is 1, only this part of the loop is executed
				}
				else if(Choice == 2)
				{
					System.out.println("Your number is 2"); //if your choice is 2, only this part of the loop is executed
				}
				else if(Choice == 3)
				{
					System.out.println("Your number is 3"); //if your choice is 3, only this part of the loop is executed
				}
				else if(Choice == 4)
				{
					System.out.println("Your number is 4"); //if your choice is 4, only this part of the loop is executed
				}
				else if(Choice == 5)
				{
					System.out.println("Your number is 5."); //if your choice is 5, only this part of the loop is executed
				}
				else
				{
					System.out.println("You did not enter an integer between 1 and 5 inclusive."); /*if you entered any integer 
																								   that is not one of the listed 
																								   inputs(1-5), this message will 
																								   display*/
				}
				
				
				
				
				
				
			}
			else if (inp == 2){
//					Nested ifs:
				
				
				
				
				
				int num=102;
				if (num > 100) { //Tests if 102 is greater than 100
					if (num%2 == 0) { //Tests if 102 is divisible by 2
						if (num==120) { //Do if the 102 is equal to 120
							System.out.println("102 is greater than 100, "
									+ "divisible by 2, "
									+ "and equal to 120");
						} else { //Do if 102 is not equal to 120
							System.out.println("102 is greater than 100, "
									+ "divisible by 2, "
									+ "and not equal to 120");
						}
					}
				}
				
				
				
				
				
			}
			else if (inp == 3){
//					Variables local to method:
				
				System.out.println("The code here is not runnable please take a look at the code and documentation for your self.");
				// the following code will not work:
				
				//if (true){
				//	int a = 4;
				//}
				//System.out.println(a); // the variable a is local to the if loop so it was initialized and...
				//... removed from memory when the if loop was finished running
				// Note: if a variable is initialized in a higher scope than it is available in all lower scopes 
				
				
			}
			else if (inp == 4){
				// 						Using booleans as the complete control flow expression:
				
				
				
				
				
				boolean a = true; // initialize this boolean to false if you want to test this code
				// look at this if loop below you will notice that there is no expression in the condition of the loop
				if (a){ //you do not need to put a == true. if(a) is enough by itself
					// if the boolean a = true then the if loop's statements will execute
					System.out.println("Look I am in this loop!!!");
				}
				else{
					// if a = false than the if statement will not run and the else statement's code will run
					System.out.println("Oh man, a = false so I could'nt get into the if's statements.");
				}
				
				
				
				
				
				
				
			}
			else if (inp == 5){
				// 											Switch statements:
				
				
				
				
				
				
				//Use a switch statement to comment on each voting choice they might make
				System.out.print("Press 1 to vote for Donald Trump, 2 for Hillary Clinton, or 3 for Bernie Sanders: ");
				int input = reader.nextInt();  //This stores their answer in a variable
				
				switch (input){//The switch statement will examine the variable
				case 1://Case 1: means if they enter a 1, every line of code under case 1 will run.
					System.out.println("Are you serious dude?");
					break;//If this break statement wasn't here, the case 2 code would start running even if they only entered a 1.
				case 2: //This code runs if they enter 2
					System.out.println("At least you didn't vote for the Donald.");
					break;// This prevents it from going to the third case
				case 3: 
					System.out.println("Huh? He didn't even make it past the primary.");
					break;
				default: //The default case will always run unless they reach a previous case with a break statement.
					System.out.println("You have voted illegally.");
					break; //Technically, this break isn't needed since there's no case after the default case.
				}
				
			
				
				
			}
			else {
				System.out.println("Sorry, Your input was invalid.");
				inp = 1;
				continue;
			}
		}while (inp != 0);
	}
}

