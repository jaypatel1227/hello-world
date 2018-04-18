// Fraction
// Jay Patel
// This file creates a fraction Object that allows you to do things with fractions
public class Fraction {
	private int numer;
	private int denom;
    // default constructor
	public Fraction(){
    		numer = 0;
    		denom = 1;
	}
    // constructor that needs the numerator and denominator to be passed in
	public Fraction(int num, int den){
    		numer = num;
    		denom = den;
    		simplify();
	}
    // constructor that takes a double and convert it to a fraction
 	public Fraction(double num){
 		 double frac = num;
 		 if (frac != 0){
         int count = 1;
         while (frac != Math.floor(frac)){
             frac *= 10;
             count ++;
         }
         numer = (int)frac;
         denom = 1;
         for (int i = 1; i < count; i++){
             denom *= 10;
         }
         simplify();
 		 }
 		 else{
 		    numer = 0;
 		    denom = 1;
 		 }
         
 	}
    // simplifies the fraction to the simplest form
    private void simplify(){
		int nu = numer;
		int de = denom;
		boolean isNeg;
        if (nu == 0){
            de = 1;
        }
        // if the denominator is negative than you move the negative sign up to the numerator
        if (de < 0){
            de *= -1;
            nu *= -1;
        }
        // if the deonominator is 0 then you set it to 1 and display a error message
        if (de == 0){
            nu = 0;
            de = 1;
            System.out.println("Your fraction was trying to divide by 0 \n"
            		+ "I have set its denominator to one so that the world doesn't end");
        }
        // mark if the number is negative and make it positive
        if (nu < 0){
            isNeg = true;
            nu *= -1;
        }
        else{
            isNeg = false;
        }
        int gcd;
        // finds gcd using a while loop
        if (nu != 0){
            if (nu > de){ // if numerator is greater than denominator then initializes gcd to denominator
                gcd = de;
            }
            else if (nu < de){ // if denominator is greater than numerator then initializes gcd to numerator
                gcd = nu;
            }
            else{ // catches any nu = de cases
                gcd = nu;
            }
        }
        else{
          gcd = 1;
        }
        // finds the gcd through a while loop
        while (nu % gcd != 0 || de % gcd != 0){
            gcd --;
        }
        // sets the numerator and denominator
        numer = nu/gcd;
        denom = de/gcd;
        // if the number was negative make it negative
        if (isNeg){
        	numer *= -1;
        }
	}
    // will add two fractions and return a fraction
	public Fraction add(Fraction b){
		    Fraction result = new Fraction();
		    result.numer = numer*b.denom + denom*b.numer;
		    result.denom = denom*b.denom;
		    result.simplify();
		    return result;
	}
    // will subtract two fractions and return a fraction
    public Fraction subtract(Fraction b){
        Fraction result = new Fraction();
        result.numer = numer*b.denom - denom*b.numer;
		    result.denom = denom*b.denom;
        result.simplify();
		    return result;
    }
    // will multiply two fractions and return a fraction
    public Fraction multiply(Fraction b){
        Fraction result = new Fraction();
        result.numer = numer*b.numer;
        result.denom = denom*b.denom;
        result.simplify();
		    return result;
    }
    // will divide two fractions and return a fraction
    public Fraction divide(Fraction b){
        Fraction result = new Fraction();
        result.numer = numer*b.denom;
        result.denom = denom*b.numer;
        result.simplify();
		return result;
    }
    // returns a double version of the fraction
    public double toDouble(){
        return ((double)numer)/denom;
    }
    // checks whether this is bigger or if Fraction f is bigger
    // returns 1 if this is bigger than f
    // returns 0 if this and f are equal
    // returns -1 if f is bigger than this
    public int compareTo(Fraction f){
        if (toDouble() > f.toDouble()){
            return 1;
        }
        else if (toDouble() < f.toDouble()){
            return -1;
        }
        else if (toDouble() == f.toDouble()){
            return 0;
        }
        else{
            return 0;
        }
    }
    // checks if 2 fractions are equal
    public boolean equals(Fraction f){
        if (numer == f.numer && denom == f.denom){
            return true;
        }
        else{
            return false;
        }
    }
    // checks if the double passed in is equal to this
    public boolean equals(double dd){
        if (toDouble() == dd){
            return true;
        }
        else{
            return false;
        }
    }
    // checks if the parameters(numerator and denominator) are equal to this
    public boolean equals(int num, int den){
        if (numer == num && denom == den){
            return true;
        }
        else{
            return false;
        }
    }
    // returns the numerator of this
    public int getNumerator(){
        return numer;
    }
    // returns the denominator of this
    public int getDenominator(){
        return denom;
    }
    // prints this
    public void print(){
        System.out.println(toString());
    }
    // converts this into a string
    public String toString(){
        return "" + numer + "/" + denom;
    }
    public Fraction FractionList(char[] operators, Fraction[] list){
        Fraction result = new Fraction(numer, denom);
        for(int i = 0; i<list.length; i++){
            if (operators[i] == '+'){
                result = result.add(list[i]);
            }
            else if (operators[i] == '-'){
                result = result.subtract(list[i]);
            }
            else if (operators[i] == '*'){
                result = result.multiply(list[i]);
            }
            else if (operators[i] == '/'){
                result = result.divide(list[i]);
            }
        }
        return result;
    }
}