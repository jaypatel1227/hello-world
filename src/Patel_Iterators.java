import java.util.LinkedList;
import java.util.ListIterator;
public class Patel_Iterators {
	public static void main(String[] args){
		// 1
		LinkedList<String> assignment = new LinkedList<String>();
		// 2
		assignment.addFirst("two");
		assignment.addFirst("one");
		assignment.addLast("three");
		assignment.addLast("four");
		// 3
		ListIterator iter = assignment.listIterator();
		// 4
		iter.next();
		iter.next();
		iter.next();
		iter.next();
		iter.add("five");
		iter.add("six");
		iter.add("seven");
		// 5
		for (String a: assignment){
			System.out.println(a);
		}
		// 6 
		iter = assignment.listIterator();
		while (iter.hasNext()){
			System.out.println(iter.next());
			iter.remove();
		}
	}
}
