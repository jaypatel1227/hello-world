// Jay Patel
// StackQueueTester
// Tests Stacks and queues
public class StackQueueTester{
	public String toString(QueueList<String> ql){
		String s = "";
		while (!ql.isEmpty()){
			String temp = ql.remove();
			if (ql.isEmpty()){
				s += temp;
			}
			else{
				s += temp + " ";
			}
			
		}
		return s;
	}
	public String toString(StackList<String> sl){
		String s = "";
		while (!sl.isEmpty()){
			String temp = sl.pop();
			if (sl.isEmpty()){
				s += temp;
			}
			else{
				s += temp + " ";
			}
		}
		return s;
	}
	public void removeName(QueueList<String> q, String name){
		// temp storage
		QueueList<String> sl = new QueueList<String>();
		// mechnism for iteration is:
		//    sl.push(q.remove())
		// first generate the Stack of only non-name elements
		while(!q.isEmpty()){
			if (q.peek().equals(name)){
				q.remove();
			}
			else{
				sl.add(q.remove());
			}
		}
		// now backfill
		while (!sl.isEmpty()){
			q.add(sl.remove());
		}
	}
	public boolean stackSearch(StackList<String> s, String name){
		boolean flag = false;
		// temp storage
		StackList<String> sl = new StackList<String>();
		// empty everything out and check for the name
		while(!s.isEmpty()){
			if (s.peek().equals(name)){
				flag = true;
			}
			sl.push(s.pop());
		}
		// now backfill
		while (!sl.isEmpty()){
			s.push(sl.pop());
		}
		return flag;
	}
	public QueueList<String> splitString(String s){
		QueueList<String> ql = new QueueList<String>();
		for (int i = 0; i < s.length(); i ++){
			if (s.substring(i, i+1).equals(" ") || s.substring(i, i+1).equals("."))
			{
				ql.add(s.substring(0, i));
				s = s.substring(i+1);
				i = -1;
			}
		}
		return ql;
	}
	public QueueList<String> longestWords(QueueList<String> q){
		// find the longest length of words in the QueueList
		int len = 0;
		QueueList<String> sl = new QueueList<String>();
		// empty everything out and check for length
		while(!q.isEmpty()){
			if (q.peek().length() > len){
				len = q.peek().length();
			}
			sl.add(q.remove());
		}
		// now backfill
		while (!sl.isEmpty()){
			q.add(sl.remove());
		}
		// now empty everything out but add into the queue at the same time
		QueueList<String> res = new QueueList<String>();
		while(!q.isEmpty()){
			if (q.peek().length() == len){
				res.add(q.peek());
			}
			sl.add(q.remove());
		}
		// now backfill
		while (!sl.isEmpty()){
			q.add(sl.remove());
		}
		return res;
	}
	public StackList <String> findDuplicates(StackList<String> s, QueueList<String> q){
		// holders for both the stack and queue
		StackList<String> a = new StackList<String>();
		QueueList<String> b = new QueueList<String>();
		// nested loops for searching
		StackList<String> intersection = new StackList<String>();
		while (!s.isEmpty()){
			// search through the queue
			while(!q.isEmpty()){
				if (s.peek().equals(q.peek())){
					intersection.push(q.peek());
				}
				b.add(q.remove());
			}
			// reset the queue
			while (!b.isEmpty()){
				q.add(b.remove());
			}
			// go to the next element of the stack
			a.push(s.pop());
		}
		// reset the stack
		while (!a.isEmpty()){
			s.push(a.pop());
		}
		return intersection;
	}
//	private QueueList<String> 
}