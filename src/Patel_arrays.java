// Jay Patel
// Patel_arrays
// Array practice
import java.util.Scanner;
public class Patel_arrays {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String inp;
		do{
			System.out.println("Enter 1 for maxMinAvg: " + "\n" + "Enter 2 for highValues: " + "\n" + "Enter Z to exit this loop");
			inp  = input.next();
			if (inp.equals("1")){
				maxMinAvg();
			}
			else if (inp.equals("2")){
				highValues();
			}
			else if (inp.equals("Z")){
				break;
			}
			else{
				System.out.println("You input was invald! Please try again.");
				inp = "1";
				System.out.println();
				System.out.println();
				System.out.println();
				continue;
			}
			System.out.println();
			System.out.println();
			System.out.println();
		}while (!inp.equals("Z"));
		
	}
	
	
	
	public static void maxMinAvg(){ 
		Scanner input = new Scanner(System.in);
		//Part 1
		int[] practice1 = new int[10];
		// Stores the values into the array
		for (int i = 0; i<practice1.length; i++){
			System.out.print("Enter value #" + (i + 1) + ": ");
			practice1[i] = input.nextInt();
			System.out.println();
		}
		// initialize min, max, and sum
		int min, max;
		double sum, avg;
		min = practice1[0];
		max = practice1[0];
		sum = practice1[0];
		// finds the maxes and the mins and keeps track of a sum
		for (int i = 1; i<practice1.length; i++){
			if (practice1[i] < min){
				min = practice1[i];
			}
			if (practice1[i] > max){
				max = practice1[i];
			}
			sum += practice1[i];
		}
		// computes an average
		avg = sum / practice1.length;
		// prints the min, max, and the avg, also the for loop prints all of the entries in the array
		System.out.println("Max: " + max +"\n" + "Min: " + min + "\n" + "Avg: " + avg);
		for (int i = 0; i<practice1.length; i++){
			System.out.println(practice1[i]);
		}
	}
	public static void highValues(){
		Scanner input = new Scanner(System.in);
		// Ask for the length of the array
		System.out.print("How many numbers would you like to enter? ");
		int len = input.nextInt();
		System.out.println();
		int[] p2 = new int[len];
		// Stores the values into the array
		for (int i = 0; i<p2.length; i++){
			System.out.print("Enter value #" + (i + 1) + ": ");
			p2[i] = input.nextInt();
			System.out.println();
		}
		// initializes new max variables based on the first 3 entries 
		int max1 , max2, max3;
		// initializes the location(s) of the 3 highest nembers and sorts them
		int m1l;
		int m2l;
		int m3l;
		// the following if else ladder will sort the code based on the highest and also store the locations of said highest numbers
		if (p2[0] > p2[1] && p2[0] > p2[2]){
			max1 = p2[0];
			m1l = 0;
            if (p2[1] > p2[2]){
                max2 = p2[1];
				m2l = 1;
				max3 = p2[2];
				m3l = 2;
            }
            else if (p2[2] > p2[1]){
                max2 = p2[2];
                m2l = 2;
                max3 = p2[1];
                m3l = 1;
            }
            else{
                max2 = p2[1];
                m2l = 1;
                max3 = p2[1];
                m3l = 1;
            }
		}
		else if (p2[2] > p2[1] && p2[2] > p2[0]){
			max1 = p2[2];
			m1l = 2;
            if (p2[1] > p2[0]){
                max2 = p2[1];
				m2l = 1;
				max3 = p2[0];
				m3l = 0;
            }
            else if (p2[0] > p2[1]){
                max2 = p2[0];
                m2l = 0;
                max3 = p2[1];
                m3l = 1;
            }
            else{
                max2 = p2[1];
                m2l = 1;
                max3 = p2[1];
                m3l = 1;
            }
		}
        else if (p2[1] > p2[0] && p2[1] > p2[0]){
		    max1 = p2[1];
			m1l = 1;
            if (p2[0] > p2[2]){
                max2 = p2[0];
				m2l = 0;
				max3 = p2[2];
				m3l = 2;
            }
            else if (p2[2] > p2[0]){
                max2 = p2[2];
                m2l = 2;
                max3 = p2[0];
                m3l = 0;
            }
            else{
                max2 = p2[0];
                m2l = 0;
                max3 = p2[0];
                m3l = 0;
            }
		}
		else{
			max1 = p2[0];
			m1l = 0;
			max2 = p2[0];
			m2l = 0;
			max3 = p2[0];
			m3l = 0;
		}
		
		// starts the testing of the numbers
		for (int i = 3; i < p2.length; i++){
			// if the current number is greater than max1 than it shifts the order of the largest numbers down
			if (p2[i] > max1){
				max3 = max2;
				m3l = m2l;
				max2 = max1;
                m2l = m1l;
				max1 = p2[i];
                m1l = i;
			}
			// if the current number is greater than max2 and smaller than max1 than it shifts the order of the largest numbers down
			else if (p2[i] > max2){
				max3 = max2;
                m3l = m2l;
				max2 = p2[i];
                m2l = i;
			}
			// if the current number is greater than max3 but smaller than max1 and max2 than it changes max3
			else if (p2[i] > max3){
				max3 = p2[i];
                m3l = i;
			}
		}
        // done testing the numbers
        System.out.print("List of values:");
        for (int i = 0; i < p2.length; i++){
            if (i + 1 < p2.length){
                System.out.print(" " + p2[i] + ",");
            }
            else{
                System.out.print(" " + p2[i]);
            }
        }
        System.out.println();
        System.out.println("There were a total of " + len + " entries.");
        System.out.println();
        System.out.println("The highest number was in sequence # " + (m1l + 1));
        System.out.println("The second highest number was in sequence # " + (m2l + 1));
        System.out.println("The third highest number was in sequence # " + (m3l + 1));
        
		
	}
}
