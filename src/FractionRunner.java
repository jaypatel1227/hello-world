public class FractionRunner{
    public static void main(String [] args){
        Fraction a = new Fraction(-3,10);
        a.print();
        Fraction b = new Fraction();
        b.print();
        Fraction c = new Fraction(1.123);
        c.print();
        Fraction d = new Fraction(0.0);
        d.print();
        Fraction e = new Fraction(1.5);
        e.print();
        Fraction f = new Fraction(4,0);
        System.out.println(f);
        System.out.println(a.add(b) + " == " + b.add(a));
        System.out.println(a.subtract(b) + " == " + b.subtract(a));
        System.out.println(a.divide(b) + " == " + b.divide(a));
        System.out.println(a.multiply(b) + " == " + b.multiply(a));
        System.out.println(a.equals(b) + " == " + b.equals(a.getNumerator(), b.getDenominator()));
        System.out.println("Also, " + a.equals(b.toDouble()) + "?");
        System.out.println(a.compareTo(b) + " =/= " + b.compareTo(a));
    }
}