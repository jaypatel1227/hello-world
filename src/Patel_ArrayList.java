// ArrayList
// Jay Patel
// uses arraylists to do thing with a looping menu
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Patel_ArrayList {
	public static void main(String[] args){
		ArrayList<Fraction> client = new ArrayList<Fraction>();
		Scanner input = new Scanner(System.in);
		KeyboardReader reader = new KeyboardReader();
		String inp;
		int u;
		do{
			System.out.println("Menu: " + 
					"\n\t1. Display the list of fractions" + 
					"\n\t2. Adds a fraction to the end of the list" + 
					"\n\t3. Insert a fraction at a specfic location" + 
					"\n\t4. Remove a fraction from a specfic location" + 
					"\n\t5. Remove a fraction by value" + 
					"\n\t6. Replace a fraction at a specfic location" + 
					"\n\t0. To exit the loop");
			System.out.print("\nEnter a selection: \t\t");
			inp = input.next();
			try{
				u = Integer.parseInt(inp);
			}
			catch(java.lang.NumberFormatException id1){
				System.out.println("Opps you did not enter an int! Please try again\n");
				u = 7;
			}
			catch(Exception e){
				System.out.println("Something went horribly wrong! Please try again\n");
				u = 7;
			}
			switch(u){
    			case 1: {one(client);break;}
          		case 2: {try{client = two(client);} catch(Exception e){System.out.println("Opps you entered something invalid!");}break;}
          		case 3: {try{client = three(client);} catch(Exception e){System.out.println("Opps you entered something invalid!");}break;}
         		case 4: {try{client = four(client);} catch(Exception e){System.out.println("Opps you entered something invalid!");}break;}
          		case 5: {try{client = five(client);} catch(Exception e){System.out.println("Opps you entered something invalid!");}break;}
          		case 6: {try{client = six(client);} catch(Exception e){System.out.println("Opps you entered something invalid!");}break;}
          		case 10: {client = test(client);break;}
          		case 0 : {break;}
            default: {System.out.println("You entry was invalid, try again");}
            }
			reader.pause();
		}while(u != 0);
	}
	private static void one(ArrayList<Fraction> f) {
		if (f.size() > 0){
			System.out.println("\n\tThe list currently contains:");
			for (int i = 0; i < f.size(); i++){
				System.out.println("\t\t" + (i+1) + ".\t" + f.get(i));
			}
            System.out.println();
		}
		else{
			System.out.println("\n\tThe list currently contains:\n\t\tNothing\n");
		}
	}
	private static ArrayList<Fraction> two(ArrayList<Fraction> f) {
		Scanner input = new Scanner(System.in);
		System.out.print("\n\tEnter the numerator of the fraction to add:    ");
		int inp = input.nextInt();
		System.out.print("\tEnter the denominator of the fraction to add:    ");
		int inp1 = input.nextInt();
        Fraction a = new Fraction(inp,inp1);
        f.add(a);
        System.out.println("\n\tThe fraction " + a + " has been successfully added to the end of the list.\n");
        return f;
  }
	private static ArrayList<Fraction> three(ArrayList<Fraction> f) {
		Scanner input = new Scanner(System.in);
		System.out.print("\n\tEnter the location where you would like to insert the fraction:\t");
		int loc = input.nextInt();
    	System.out.print("\n\tEnter the numerator of the new fraction:      ");
		int inp = input.nextInt();
		System.out.print("\tEnter the denominator of the new fraction:      ");
		int inp1 = input.nextInt();
        Fraction a = new Fraction(inp,inp1);
        try{
            f.add(loc, a);
            System.out.println("\n\tThe fraction " + a + " has been inserted in the list at location " + loc + ".\n");
        }
        catch(Exception e){
            System.out.println("You can't add the fraction to index" + loc  + " because there are only " + f.size() + " elements.\n");
        }
        return f;
	}
	private static ArrayList<Fraction> four(ArrayList<Fraction> f) {
		Scanner input = new Scanner(System.in);
        System.out.print("\n\tEnter the location where you would like to remove the fraction:\t");
        int loc = input.nextInt();
        try{
            f.remove(loc);
            System.out.println("The fraction at index " + loc + " was successfully removed.\n");
        }
        catch (Exception e){
            System.out.println("There was no fraction to remove at index " + loc + "!\n"); 
        }
        return f;
	}
	private static ArrayList<Fraction> five(ArrayList<Fraction> f) {
		Scanner input = new Scanner(System.in);
		boolean remov = false;
        System.out.print("\n\tEnter the numerator of the fraction to remove:    ");
		int inp = input.nextInt();
		System.out.print("\tEnter the denominator of the fraction to remove:    ");
		int inp1 = input.nextInt();
        Fraction a = new Fraction(inp,inp1);
        for (int i = 0; i <= f.size() - 1; i++){
            if (a.equals(f.get(i))){
                f.remove(i);
                remov = true;
                System.out.println("The fraction at index " + i + ", with a value of " + a + ", was successfully removed.\n");
                break;
            }
        }
        if (!remov){
            System.out.println("Error: The fraction " + a + " is not in the list.\n");
        } 
        return f;
	}
	private static ArrayList<Fraction> six(ArrayList<Fraction> f) {
		Scanner input = new Scanner(System.in);
    	System.out.print("\n\tEnter the location of the fraction to replace:\t");
    	int loc = input.nextInt();
    	System.out.print("\tEnter the numerator of the new fraction:        ");
		int inp = input.nextInt();
		System.out.print("\tEnter the denominator of the new fraction:      ");
		int inp1 = input.nextInt();
   		Fraction a = new Fraction(inp,inp1);
        try{
            Fraction old = f.set(loc, a);
            System.out.println("The fraction " + old + " was replaced with the fraciton " + a + ".\n");
        }
        catch (Exception e){
            System.out.println("There was no fraction to replace at the index" + loc + "!\n"); 
        }
        return f;
	}
	private static ArrayList<Fraction> test(ArrayList<Fraction> f){
	  	f.add(new Fraction(3,0)); 
	  	f.add(new Fraction(-3,-3)); 
	  	f.add(new Fraction(-3,4)); 
	  	f.add(new Fraction(2,3)); 
	  	f.add(new Fraction(4,7)); 
	  	f.add(new Fraction(123,125)); 
	  	return f;
	}
}
