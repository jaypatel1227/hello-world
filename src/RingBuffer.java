public class RingBuffer{
	private char[] characters;
	private int front;
	private int rear;
	public RingBuffer(int capacity){
		characters = new char[capacity + 1];
		front = 0;
		rear = 0;
	}
	public int getFront() {
		return front;
	}

	public int getRear() {
		return rear;
	}
	public boolean isEmpty(){
		return rear == front;
	}
	public void flush(){
		rear = front;
	}
	public boolean add(char ch){
		if (!((rear + 1)%characters.length == front)){
			characters[rear] = ch;
			rear = (rear + 1) % characters.length;
			return true;
		}
		return false;
	}
	public char remove(){
		if (!isEmpty()){
			front = (front + 1) % characters.length;
			return characters[front - 1];
		}
		return ' ';
	}
	public char peek(){
		if (!isEmpty()){
			return characters[front];
		}
		return '!';
	}
}