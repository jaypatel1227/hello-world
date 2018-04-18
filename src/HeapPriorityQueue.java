import java.util.ArrayList;
// Jay Patel
// Heaps of FUN
// Creates a badly functioning HeapPPPP
public class HeapPriorityQueue implements MaxPriorityQueue{
    // Private Variables:
    private Comparable[] arr; //  stores the values
    private int count; // amount of filled nodes in the heap
    private int maxSize; // the max amount of nodes possible


    // Public Methods:
    public HeapPriorityQueue(int max) { // constructor
        arr = new Comparable[max + 1]; // this is true because you want the 0th index to be unfilled in an heap
        count = 0;
        maxSize = max;
    }
    public boolean add(Comparable val){ // adds a node into the tree
        if (!isFull()){
            arr[count+1] = val; // add it at the end
            count++; // increase the count
            reconcile(count); // move it up to the appropriate place
            return true;
        }
        // if the heap is full the you raise and error message and return false
        System.out.println("You were just trying to add into a full heap, you are lucky I accounted for that " +
                "or you would have lost all of your stuff!");
        return false;
    }
    private void reconcile(int ind) { // moves the added thing into the appropriate place
		if (ind/2 == 0 || ind == 0){ // if you are at the top, stop
		    return;
        }
        if (arr[ind/2].compareTo(arr[ind]) > 0){ // if the parent above you is bigger than you, stop
			return;
		}
		swap(ind/2, ind); // else swap with your parent
		reconcile(ind/2); // call you self again
	}
    public boolean isEmpty(){ // return whether or not the tree is empty
        return count == 0;
    }
    public Comparable removeMax() { // removes the value at the front of the list (if any)
        if (!isEmpty()){
            Comparable rem = arr[1]; //keep track of what was removed
            arr[1] = arr[count]; // bring the last thing up to the top
            reheap(1); // bring it back down to it appropriate place
            count--; // reduce count
            return rem;
        }
        // if the heap was empty you display an error and return null
        System.out.println("You were just trying to remove out of an empty heap, you are lucky I accounted for that " +
                "or you would have lost all of your stuff!");
        return null;
    }
    private void reheap(int ind) {
    	// if both indexes are out of bounds or both children are smaller than the current node, then stop
    	if ((2*ind > count && 2*ind + 1 > count) || (arr[2*ind].compareTo(arr[ind]) < 0 && arr[2*ind+1].compareTo(arr[ind]) < 0)){
    		return;
    	}
    	ArrayList<Integer> childs = new ArrayList<Integer>(); // contains the children of the node at ind
    	if (2*ind <= count){ // if the first child is valid add it
    		childs.add(new Integer(2*ind));
    	}
    	if (2*ind + 1 <= count){ // if the second child is valid, then add it as a child
    		childs.add(new Integer(2*ind+1));
    	}
    	int big = count; // intialize the biggest to the end (smallest in the heap)
    	for (Integer child: childs){
    		if (arr[child.intValue()].compareTo(arr[ind]) > 0 && arr[child.intValue()].compareTo(arr[big]) > 0){ 
                // if the child is bigger then big then reset big
    			big = child.intValue();
    		}
    	}
        // now big hold the index of the biggest child
    	swap(ind, big); // swap down
    	reheap(big); // recursive call to itself to keep fixing the order
	}
    public Comparable peekMax(){
        if (isEmpty()) {
            System.out.println("You were trying to peek into a empty heap!");
            return null;
        }
        return arr[1];
    }
    public String toString(){
        String res = "[";
        if (count == 0){
            return "[]"; // if empty print and empty array
        }
        for (int i = 1; i < count; i++){
        	res += arr[i] + ", ";
        }
        res += arr[count];
        return res + "]";
    }
    public boolean isFull(){
        return count == maxSize;
    }
    public int getCount(){
        return count;
    }
    private void swap(int a, int b){
    	Comparable temp = arr[b];
    	arr[b] = arr[a];
    	arr[a] = temp;
    }
}