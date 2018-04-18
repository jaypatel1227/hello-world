//Money.java
//Jay Patel
//This simple class consists of only 2 instance variables, containing dollars and cents values.
//It is both incomplete and incorrect.
//Your task:  Complete and fix it.
import java.util.Scanner;
public class Money             
{
// private instance variables
	private int myDollars;
	private int myCents;
	
	//  default constructor method -- no parameters
	public Money()
	{
		myDollars = 0;
		myCents = 0;
	}
	//  constructor method to input dollars and cents
	public Money(int newDollars, int newCents)
	{
		myDollars = newDollars;
		myCents = newCents;
		normalize();
	}

	//  Accessor methods -- return the private variable values
	public int getDollars()
	{
		return myDollars;
	}
	
	public int getCents()
	{
		return myCents;
	}
	
	//  One Money parameter add method
	//  This method combines the totals in this and the parameter amount

	public Money add(Money amount)
	{
		Money result = new Money();
		result.myCents = this.myCents + amount.myCents;
		result.myDollars = this.myDollars + amount.myDollars;
		result.normalize();
		return result;
	}
	
	// 	Two int parameter add method  
	//  This method gets passed dollars and cents instead of a Money object
  
	public Money add(int dollar, int cent)
	{
	    Money result = new Money();
	    result.myCents = this.myCents + cent;
	    result.myDollars = this.myDollars + dollar;
	    result.normalize();
	    return result;
	}
  
	//  One Money parameter subtract method
	//  This method combines the totals in this and the parameter amount
	
	public Money subtract(Money amount)
	{
	  	Money result = new Money();
		result.myCents = this.myCents - amount.myCents;
		result.myDollars = this.myDollars - amount.myDollars;
		result.normalize();
		return result;
	}

    // 	Two int parameter subtract method  
	//  This method gets passed dollars and cents instead of a Money object
	public Money subtract(int dollar, int cent)
	{
	    Money result = new Money();
	    result.myCents = this.myCents - cent;
	    result.myDollars = this.myDollars - dollar;
	    result.normalize();
	    return result;
	}

	//  This method should fix the problem of myCents > 99 or myCents < 0
	//  Think carefully about which methods should call normalize()
	
	public Money multiply(int val)
	{
		Money result = new Money();
		result.myCents = this.myCents * val;
		result.myDollars = this.myDollars * val;
		result.normalize();
		return result;
	}
	
	//  This method fixes the issue(s) that come with the input of the money in that if the cents are greater than 100 or less than 0 then a problem
	//  can arise with the 
	
	private void normalize()
	{
		// System.out.println("Inside the Normalize method");  // this display is only for testing purposes
		int cents = this.getCents();
		int doll = this.getDollars();
		// if cents > 100 then you get the cents down to < 100 and add to the dollars each time
		if (cents >= 100)
		{
		  while (!(cents < 100))
		  {
		    doll += 1;
		    cents -= 100;
		  }
		}
		// if cents < 0 then you get the cents up to < 0 and subtract a dollar each time
		else if (cents < 0)
		{
		  while (!(cents >= 0))
		  {
		    doll -= 1;
		    cents += 100;
		  }
		}
		// fixes negative money after fixing the cents and dollars
		if (doll < 0)
		{
		  this.myCents = 0;
		  this.myDollars = 0;
		}
		// otherwise is sets the fixed money
		else
		{
		  this.myCents = cents;
		  this.myDollars = doll;
		}
	}

	//  This method (incorrectly) displays the values attractively to the screen 
	public void print()
	{
		System.out.println(this);	
	}

	
	//  This method (incorrectly) overwrites the automatic toString() method	
	public String toString()
	{
		String s1;
		if (myCents < 10)
		{
		  s1 = "$" + myDollars + ".0" + myCents;
		}
		else
		{
		  s1 = "$" + myDollars + "." + myCents;
		}
		return s1;
	}
	public double val(){
	  double cents = ((double)this.myCents)/100;
	  double value = this.myDollars + cents;
	  return value;
	}
	public static void SortMoney(){
		Scanner input = new Scanner(System.in);
		int count = 0;
		int doll = 0;
		int cents = 0;
	  Money[] muns = new Money[101];
	  System.out.print("What is the dollar value you want for the money #" + (count + 1) + ": ");
	  doll = input.nextInt();
	  System.out.print("What is the cent value you want for the money #" + (count + 1) + ": ");
	  cents = input.nextInt();
	  muns[count] = new Money(doll, cents);
	  count++;
    for (int i = 0; i<muns.length; i++){
	      System.out.print("What is the dollar value you want for the money #" + (count + 1) + ": ");
		    doll = input.nextInt();
		    System.out.print("What is the cent value you want for the money #" + (count + 1) + ": ");
		    cents = input.nextInt();
		    muns[count] = new Money(doll, cents);
		    if (muns[count].val() == 0){
		      break;
		    }
		    count++;
		  
	  }
	  Money emp = new Money();
	  for (int u = 0; u<muns.length; u++){
			if (muns[u] == null){
			  muns[u] = emp;
			}
		}
		for (int i = 0; i < muns.length-1; i++){      
        for (int j = 0; j < muns.length-i-1; j++){ 
           if (muns[j].val() <= muns[j+1].val()){
              Money temp = muns[j + 1];
              muns[j+1] = muns[j];
              muns[j] = temp;
           }
	      }
    }
    System.out.println("____Largest____");
		for (int u = 0; u<muns.length; u++){
		
			if (muns[u].val() != 0.0){
			  System.out.println(muns[u]);
			}
		}
		System.out.println("____Smallest____");
	}
}