// ProperFraction
// Jay Patel
// Proper fraction objects can be created using this class
public class ProperFraction extends Fraction{
	public ProperFraction(int nu, int de){
        super(nu,de);
	}
    public int getWhole(){
        return (int)getNumerator()/getDenominator();
    }
    public int getRemainder(){
        return getNumerator()%getDenominator();
    }
    public void print(){
        System.out.println(this);
    }
    public String toString(){
        if (getNumerator() == 0){ // if the fraction was supposed to be 0/1 you return a "0"
            return "0";
        }
        if (getWhole() != 0){ // if the fraction has a non-zero whole you thest this part
            String res = "" + getWhole() + " ";
            if (getNumerator() - getWhole()*getDenominator() != 0){ // if there is a non-whole part of the fraction the you add that to your result
                if (getNumerator() - getWhole()*getDenominator() < 0){ // check for the non-whole part to make sure it is positive when it is printed
                  res += -1*(getNumerator() - getWhole()*getDenominator()) + "/" + getDenominator();
                }
                else{
                  res += getNumerator() - getWhole()*getDenominator() + "/" + getDenominator();
                }
                
            }
            return res; // returns the concotnated string
        }
        else{ // if there is no whole part then you you use the super classes' toString()
            return super.toString();
        }
        
    }
}
