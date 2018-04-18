// Jay Patel
// AnimalList
// Creates a linked-list-like class



public class AnimalList {
	// private variables
	private ListNode head;
	private int numAddRemove;
	
	
	
	// constructor:
	public AnimalList(){
		head = null;
		numAddRemove = 0;
	}
	


	// public methods:
	
	
	
	// adds an animal alphabetically
	public void addAnimal(Comparable addValue){
					// 2 portions:
					// find the alphabetical location you want addValue to be:
		ListNode current = head;
		ListNode previous = null;
		// consider the head = null
		if (head == null){
			head = new ListNode(addValue, null);
			numAddRemove ++;
			return;
		}
		// if you are adding to the beggning of the list,
		if (addValue.compareTo(current.getValue()) < 0){
			head = new ListNode(addValue, head);
			numAddRemove ++;
			return;
		}
		// else iterate through the list to find the location
		while(current != null){
			if (addValue.compareTo(current.getValue()) < 0){
				// if current's compareTo value < 0 then you know to insert addValue in between previous and current
				break;
			}
			previous = current;
			current = current.getNext();
		}
		// insert addValue into the proper location:
		previous.setNext(new ListNode(addValue, current));
		numAddRemove++;
	}
	
	

	// removes the first instance of the animal searchValue
	public boolean removeAnimal(Comparable searchValue){
		// if there is no list then there is nothing to remove
		if (head == null){
			return false;
		}
		ListNode current = head;
		ListNode previous = head;
		while (current != null){
			if (current.getValue() == searchValue){
				// remove that node of the list
				// if head is the only node
				if (head.getNext() == null){
					head = null;
					numAddRemove ++;
					return true;
				}
				// if this the first node is one you have to remove:
				if (head == current){ // checks if they both have the memory address/are the same object
					head = current.getNext();
					numAddRemove ++;
					return true;
				}
				previous.setNext(current.getNext());
				numAddRemove++;
				return true;
			}
			previous = current;
			current = current.getNext();
		}
		return false;
	}



	// attractively displays the list of animal names
	public void displayList(){
		System.out.println(generateString()); // uses the output from the helper method to
	}



	// returns the number of successful additions/removals
	public int getnumAddRemove(){
		return numAddRemove;
	}
	
	
	
	// private helper methods:
	
	
	
	// creates a string of all of the values in the list and returns it
	private String generateString() {
		String res = "";
		ListNode current = head;
		// while you are not on the last one, keep iterating over the list
		while(current != null){
			res += current.getValue() + "\n";
			current = current.getNext();
		}
		return res;
	}
}