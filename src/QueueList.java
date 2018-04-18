import java.util.LinkedList;
public class QueueList <E>{
	private LinkedList<E> list;
	public QueueList(){
		list = new LinkedList<E>();
	}
	public boolean add(E x){
		list.add(x);
		return true;
	}
	public E remove(){
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