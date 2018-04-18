import java.util.Scanner;

public class LinkedBSTRunner {
	public static void main(String[] args){
		LinkedBST q = new LinkedBST();
		Scanner scanner = new Scanner(System.in);
		int inp = 5;
		do{
			System.out.print("1. Add a node\n2. Display PreOrder\n3. Display PostOrder\n4. Display InOrder\n5. Search\n" +
                    "6. Count the number of leaves\n7. Find Path\n8. Count the number of nodes\n9. Delete a Node\n0. Exit\n\nWhat do you want to do?: ");
			inp = scanner.nextInt();
			if (inp == 1){
				System.out.print("What do you want to add?: ");
				String a = scanner.next();
				if (q.addNode(a)){
					System.out.println("The item was successfully added!\n");
				}
				else{
					System.out.println("This item was already in the list!\n");
				}
			}
			if (inp == 2){
				System.out.println(q.preOrder() + "\n");
			}
			if (inp == 3){
				System.out.println(q.postOrder() + "\n");
			}
			if (inp == 4){
				System.out.println(q.inOrder() + "\n");
			}
			if (inp == 5){
			    System.out.print("\nWhat do you want to look for: ");
			    String s = scanner.next();
			    System.out.println("\n\nIt is " + q.search(s) + " that the value was found in the tree.\n\n");
            }
            if (inp == 6){
                System.out.println("\n\nThis tree has " + q.countLeaf() + " leaf/leaves.\n\n");
            }
            if (inp == 7){
                System.out.print("\nWhat do you want to look for: ");
                String s = scanner.next();
                System.out.println("\n\nThe length of the path to \"" + s + "\" is " + q.findPath(s) + " long.\n\n");
            }
            if (inp == 8){
                System.out.println("\n\nThis tree has " + q.countNode() + " node(s).\n\n");
            }
            if (inp == 9){
                System.out.print("\nWhat do you want to look for: ");
                String s = scanner.next();
                if (q.deleteNode(s)){
                    System.out.println("\n\nThis was successfully deleted from the tree.\n\n");
                }
                else {
                    System.out.println("\n\nThis item doesn't seem to be in the tree.\n\n");
                }
            }
            // Secret option
            if (inp == 42){
			    q.addNode("5");
                q.addNode("3");
                q.addNode("7");
                q.addNode("4");
                q.addNode("6");
                q.addNode("2");
                q.addNode("8");
                q.addNode("1");
                q.addNode("9");
                System.out.println();
            }
		}while(inp != 0);
		System.out.println("Thanks for using my runner!!! :)");
	}
}
