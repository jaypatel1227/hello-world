public class Fractionrunners{
  public static void main(String[] args){
    Fraction f = new Fraction(.5);
    Fraction c = new Fraction(.5);
    Fraction d = new Fraction(-.5);
    Fraction e = new Fraction(.5);
    Fraction g = new Fraction(-.5);
    Fraction h = new Fraction(.5);
    char[] a = {'+', '+', '+', '+', '+'};
    Fraction[] b = {c,d,e,g,h};
    System.out.println(f.FractionList(a,b));
  }
}