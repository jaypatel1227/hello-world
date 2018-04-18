import java.util.LinkedList;
public class StackList <E>{
	private LinkedList<E> list;
	public StackList(){
		list = new LinkedList<E>();
	}
	public void push(E x){
		list.addFirst(x);
	}
	public E pop(){
		return list.removeFirst();
	}
	public E peek(){
		return list.getFirst();
	}
	// works
	public boolean isEmpty(){
		return list.size() == 0;
	}
}