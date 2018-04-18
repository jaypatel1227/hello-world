// MoneyRunner
// Jay Patel
// Testing the Money Class
import java.util.Scanner;
public class MoneyRunner
{
	public static void main(String[] args)
	{
		System.out.println("Every iteration of each method created has been tested to work");
	  Money m1 = new Money(1,120);
		Money m2 = new Money(10,00);
		System.out.println("The next line will be printed version of m1");
		m1.print();
		System.out.println("m2 = " + m2);
		System.out.println("m1 + m2 = ");
		m1 = m1.add(m2);
		System.out.println("m1 = " + m1);
		System.out.println("m2 + (m1.getDollars, m1.getCents) = ");
		m2 = m2.add(m1.getDollars(), m1.getCents());
		System.out.println("m2 = " + m2);
		System.out.println("There were changes to both m1 and m2. 4*m1 and 2*m2");
		m1 = m1.multiply(4);
		m2 = m2.multiply(2);
		System.out.println("m1 = " + m1);
		System.out.println("m2 = " + m2);
		System.out.println("m1 - m2 = ");
		m1 = m1.subtract(m2);
		System.out.println("m1 = " + m1);
		System.out.println("m2 - (1, -120) = ");
		m2 = m2.subtract(1, -120);
		System.out.println("m2 = " + m2);
		Money.SortMoney();
	}
}