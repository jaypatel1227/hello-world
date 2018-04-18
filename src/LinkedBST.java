import java.util.ArrayList;
import java.util.List;

// Jay Patel
// LinkedBST
// create a binary search tree
public class LinkedBST {
	private TreeNode root;
	public LinkedBST(){
		root = null;
	}
	public boolean addNode(Comparable a){
		return insert(root, root, a, "");
	}
	private boolean insert(TreeNode roo, TreeNode prev, Comparable a, String s) { // blame the bad semantics on java's scoping errors
		if (root == null){
			root = new TreeNode(a);
			return true;
		}
		if (roo == null){
			if (s.equals("l")){ // if its marked for left, set it to the left
				prev.setLeft(new TreeNode(a));
			}
			else if (s.equals("r")){ // if its marked for right, set it to the right
				prev.setRight(new TreeNode(a));
			}
			return true;
		}
		if (a.equals(roo.getValue())){ // if the current value is the same as the comparable
			return false;
		}
		if (a.compareTo(roo.getValue()) < 0){ // if the current value is higher than a then you go to the left
			return insert(roo.getLeft(), roo, a, "l");
		}
		else{ // else you go to the right
			return insert(roo.getRight(), roo, a, "r");
		}
	}
	public List preOrder(){
		ArrayList<Comparable> res = new ArrayList<Comparable>();
		preOrderTraverse(root, res);
		return res;
	}
	public List inOrder(){
		ArrayList<Comparable> res = new ArrayList<Comparable>();
		inOrderTraverse(root, res);
		return res;
	}
	public List postOrder(){
		ArrayList<Comparable> res = new ArrayList<Comparable>();
		postOrderTraverse(root, res);
		return res;
	}
	private void preOrderTraverse(TreeNode current, List list){
		if (current == null){
			return;
		}
		// root -> left -> right
		list.add(current.getValue());
		preOrderTraverse(current.getLeft(), list);
		preOrderTraverse(current.getRight(), list);
	}
	private void inOrderTraverse(TreeNode current, List list){
		if (current == null){
			return;
		}
		// left -> root -> right
		inOrderTraverse(current.getLeft(), list);
		list.add(current.getValue());
		inOrderTraverse(current.getRight(), list);
	}
	private void postOrderTraverse(TreeNode current, List list){
		if (current == null){
			return;
		}
		// left -> right -> root
		postOrderTraverse(current.getLeft(), list);
		postOrderTraverse(current.getRight(), list);
		list.add(current.getValue());
	}
	public boolean search(Comparable key){
		return search(root, key);
	}
	private boolean search(TreeNode root, Comparable key) {
		if (root == null){ // if you reach the end the value is not there
			return false;
		}
		if (key.equals(root.getValue())){ // else if you found it return true
			return true;
		}
		if (key.compareTo(root.getValue()) < 0){ // else call yourself to the right or left based on the value of the node
			return search(root.getLeft(), key);
		}
		else{
			return search(root.getRight(), key);
		}
	}
	public int countLeaf(){
		return countLeaf(root);
	}
	private int countLeaf(TreeNode root) {
		if (root == null){ // if you reach the end you don't count that node
			return 0;
		}
		if (root.getLeft() == null && root.getRight() == null){ // if you are at a leaf return one and count the leaf
			return 1;
		}
		else{ // else if it is a parent, don't count it and keep going down the line
			return 0 + countLeaf(root.getLeft()) + countLeaf(root.getRight());
		}
	}
	public int findPath(Comparable find){
		if (search(find)){ // if its in the tree then you call the helper
			return findPath(root, find);
		}
		return -1; // if you can't find it return -1
	}
	private int findPath(TreeNode root, Comparable find) {
		if (root.getValue().equals(find)){ // if you reach the value don't count that as a length
			return 0;
		}
		if (find.compareTo(root.getValue()) < 0){ // else keep traversing down and counting it as length
			return 1 + findPath(root.getLeft(), find);
		}
		else{
			return 1 + findPath(root.getRight(), find);
		}
	}
	public int countNode(){
		return countNode(root);
	}
	private int countNode(TreeNode root) {
		if (root == null){ // if you get to the end don't count it as a node
			return 0;
		}
		else{ // else count it as a node and count all of its leaves
			return 1 + countNode(root.getLeft()) + countNode(root.getRight());
		}
	}
	public boolean deleteNode(Comparable del){
        if (search(del)) { // if the value is in the tree
            TreeNode del1 = findDel(root, del);
            TreeNode prevdel = findparent(root, del1);
            TreeNode prev = del1.getLeft();
            if (del1.getRight() == null && del1.getLeft() == null) { // del is a leaf
                if (prevdel.getRight() == null && prevdel.getLeft().getValue().equals(del1.getValue())){ // if del is on the right set the right side to null
                    prevdel.setLeft(null);
                }
                else{ // else set the left side to null
                    prevdel.setRight(null);
                }
                return true;
            }
            prevdel = findPrevdel(root, del);
            if ((del1.getRight() == null && del1.getLeft() != null) || (del1.getLeft() == null && del1.getRight() != null)){ // if del have one child
                if (del1.getLeft() != null) // if the child is on the left, set prev's left to del's left
                    prevdel.setLeft(del1.getLeft());
                if (del1.getRight() != null) // same thing as above but with the right side
                    prevdel.setRight(del1.getRight());
                return true;
            }
            // start the multiple children
            while (prev.getRight().getRight() != null) { // find the node before the largest value in the left subtree
                prev = prev.getRight();
            }
            del1.setValue(prev.getRight().getValue()); // replace del with the largest value
            prev.setRight(prev.getRight().getLeft()); // repace the node before the largest's right to the right of del
            return true;
        }
        return false;
	}
    private TreeNode findDel(TreeNode root, Comparable del){ // finds the node of del
	    if (del.equals(root.getValue()))
	        return root;
        if (del.compareTo(root.getValue()) < 0)
            return findDel(root.getLeft(), del);
        else
	        return findDel(root.getRight(), del);
	}
	private TreeNode findPrevdel(TreeNode root, Comparable del) { // finds the node before del
        if (root.getLeft().getValue().equals(del) || root.getRight().getValue().equals(del))
            return root;
        if (del.compareTo(root.getValue()) < 0)
            return findPrevdel(root.getLeft(), del);
        else
            return findPrevdel(root.getRight(), del);
    }
    private TreeNode findparent(TreeNode root, TreeNode del){
	    Comparable a = (Comparable) root.getValue();
	    if (root.getLeft() == del || root.getRight() == del){
	        return root;
        }
        if (a.compareTo(del.getValue()) > 0){
	        return findparent(root.getLeft(), del);
        }
        else{
	        return findparent(root.getRight(), del);
        }
    }
}