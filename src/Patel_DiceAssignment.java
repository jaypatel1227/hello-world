// Jay Patel
// Dice Assignment
// Use the pre-made dice class and use the dice object to do things
import java.util.Scanner;
public class Patel_DiceAssignment{
  public static void main(String[] args){
    String inp;
    Scanner input = new Scanner(System.in);
    do{
    	System.out.println("Enter 1 to roll the dice n times \nEnter 2 for 10000 roll statistics \nEnter 3 to play craps \nEnter B for the bouns \nEnter Z to end the loop");
    	System.out.print("What do you want to do? ");
    	inp = input.next();
    	if (inp.equals("1")){
    		practice1();
    	}
    	else if (inp.equals("2")){
    		practice2();
    	}
    	else if (inp.equals("3")){
    		practice3();
    	}
    	else if (inp.equals("Z")){
    		break;
    	}
    	else if (inp.equals("B")){
    		crapsStats();
    	}
    	else{
    		inp = "Invalid Input";
    		System.out.println();
    		System.out.println("Opps, you input was invalid try again loser");
    		System.out.println();
    		continue;
    	}
    }while(true); 
  }
  public static void practice1(){
    Scanner input = new Scanner(System.in);
    int rollTimes, count;
    String inp;
    do {
      System.out.print("How many times would you like to roll the dice? ");
      rollTimes = input.nextInt();
      System.out.println();
      roller1(rollTimes);
      System.out.println();
      System.out.print("Would you like to play again? (Y/N)   ");
      inp = input.next();
      System.out.println();
    } while (!inp.equals("N"));
  }
    // roller is a useful method to do the first problem where it rolls the dice and prints the result n times and does the press enter to continue thing
  public static void roller1(int rollTimes){
    int count = 1;
    int r1, r2;
    KeyboardReader reader = new KeyboardReader();
    Dice d1 = new Dice(6);
    Dice d2 = new Dice(6);
    if (rollTimes > 0){
    	do{
      		r1 = d1.roll();
      		r2 = d2.roll();
      		System.out.println("Roll #" + count + ":    " + r1 + " + " + r2 + " = " + (r1 + r2));
      		reader.pause();
      		System.out.println();
      		count += 1;
    	}while (count <= rollTimes);
    }
    else {
    	System.out.println("You can't roll less than 1 time!");
    }
  }
  // 10000 roll stats
  public static void practice2(){
    Dice d = new Dice(6);
    int res;
    int[] counter = new int[6];
    // rolls the dice 10000 times and put probablities in the proper places
    for(int count = 1; count <= 10000; count ++){
      counter[d.roll() - 1] += 1;
    }
    System.out.println();
    // prints out the numer of times each of the faces were rolled
    for (int i = 0; i<6; i++){
     System.out.println("Number of times " + (i + 1) + " was rolled:  " + counter[i]); 
    }
    System.out.println();
  }
  // uses the craps method and properly organizes the the results and promts to play again
  public static void practice3(){
  	System.out.println();
    Scanner input = new Scanner(System.in);
    String inp = "Y";
    do {
      if (inp.equals("Y")){
      	craps();
      }
      System.out.println();
      System.out.print("Would you like to play again? (Y/N)  ");
      inp = input.next();
      System.out.println();
      System.out.println();
      System.out.println();
	if (!inp.equals("Y") && !inp.equals("N")){
        System.out.println("Your input is invalid, try again");
        continue;
      }
    }while (!inp.equals("N"));
  }
  // plays all of craps by it self and prints result(s)
  public static void craps(){
    int r1, r2;
    Dice d1 = new Dice(6);
    Dice d2 = new Dice(6);
    r1 = d1.roll();
    r2 = d2.roll();
    System.out.println("Player rolled " + r1 + " + " + r2 + " = " + (r1 +r2) + ".");
    // checks if you won on first roll
    if (r1 + r2 == 7 || r1 + r2 == 11){
      System.out.println("Player wins!");
    }
    // checks if you lost on first roll
    else if (r1 + r2 == 2 || r1 + r2 == 3 || r1 + r2 == 12){
      System.out.println("Player loses.");
    }
    // establishes  a point and starts rolling over and over again
    else {
      System.out.println("Point is " + (r1 + r2) + ".");
      System.out.println();
      int point = r1 + r2;
      boolean again = false;
      do{
        r1 = d1.roll();
        r2 = d2.roll();
        // checks if you won
        if (r1 + r2 == point){
          System.out.println("Player rolled " + r1 + " + " + r2 + " = " + (r1 +r2) + ".");
          System.out.println("Player wins!");
          again = false;
        }
        // checks if you lost
        else if (r1 + r2 == 7){
          System.out.println("Player rolled " + r1 + " + " + r2 + " = " + (r1 +r2) + ".");
          System.out.println("Player loses.");
          again = false;
        }
        // rolls again if you didn't win or lose
        else{
          again = true;
          System.out.println("Player rolled " + r1 + " + " + r2 + " = " + (r1 +r2) + ".");
          continue;
        }
      }while(again);
    }
    
  }
  public static void crapsStats(){
  	// old craps code with changes to create a counter array
  	int r1, r2;
    Dice d1 = new Dice(6);
    Dice d2 = new Dice(6);
    
    int[] Stats = new int[5]; // new
    // the for loop plays craps 100000 times and find the probablities for each outcome
    for (int i = 0; i < 100000; i++){
    	r1 = d1.roll();
    	r2 = d2.roll();
	    //System.out.println("Player rolled " + r1 + " + " + r2 + " = " + (r1 +r2) + ".");
	    if (r1 + r2 == 7 || r1 + r2 == 11){
	      //System.out.println("Player wins!");
	      Stats[1] += 1; // new
	    }
	    else if (r1 + r2 == 2 || r1 + r2 == 3 || r1 + r2 == 12){
	      //System.out.println("Player loses.");
	      Stats[3] += 1; // new
	    }
	    else {
	      //System.out.println("Point is " + (r1 + r2) + ".");
	      int point = r1 + r2;
	      boolean again = false;
	      do{
	        r1 = d1.roll();
	        r2 = d2.roll();
	        //System.out.println("Player rolled " + r1 + " + " + r2 + " = " + (r1 +r2) + ".");
	        if (r1 + r2 == point){
	          //System.out.println("Player wins!");
	          Stats[2] += 1; // new
	          again = false;
	        }
	        else if (r1 + r2 == 7){
	          //System.out.println("Player rolled " + r1 + " + " + r2 + " = " + (r1 +r2) + ".");
	          //System.out.println("Player loses.");
	          Stats[4] += 1; // new
	          again = false;
	        }
	        else{
	          again = true;
	          //System.out.println("Player rolled " + r1 + " + " + r2 + " = " + (r1 +r2) + ".");
	          continue;
	        }
	      }while(again);
    	}
    }
    // these print out the result(s) of the simulation
    System.out.println();
    System.out.printf("The chances of winning are %.4f%%\n", (100.0 * (((double) Stats[1] + Stats[2])/(Stats[1] + Stats[2] + Stats[3] + Stats[4]))));
    System.out.printf("The chances of losing are %.4f%%\n", (100.0 * (((double) Stats[3] + Stats[4])/(Stats[1] + Stats[2] + Stats[3] + Stats[4]))));
    System.out.println();
    System.out.printf("The chances of winning on first roll was %.4f%%\n", (100.0*(((double) Stats[1] / (Stats[1] + Stats[2] + Stats[3] + Stats[4])))));
    System.out.printf("The chances of losing on first roll was %.4f%%\n", (100.0*(((double) Stats[3] / (Stats[1] + Stats[2] + Stats[3] + Stats[4])))));
    System.out.printf("The chances of winning by making a point was %.4f%%\n", (100.0*(((double) Stats[2] / (Stats[1] + Stats[2] + Stats[3] + Stats[4])))));
    System.out.printf("The chances of losing by not making a point was %.4f%%\n", (100.0*(((double) Stats[4] / (Stats[1] + Stats[2] + Stats[3] + Stats[4])))));
    System.out.println();
  }
}