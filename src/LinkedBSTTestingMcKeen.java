//Client/runner file for LinkedBST 
  
import java.util.ArrayList;
import java.util.List;

// *****************************************************************
// IMPORTANT
// The KeyboardReader.class file must be in the same folder as this file
//

public class LinkedBSTTestingMcKeen
{
	public static void main(String[]args)
	{
		KeyboardReader reader = new KeyboardReader();
		LinkedBST tree;
		int selection;
		int casenum;
		boolean result = false; // records addNode return
		boolean result1 = false;
		boolean result2 = false;
		List answerTree;
		
		do
		{	
			// These options are for Part III -- delete and recursive methods		
			System.out.println("Welcome to the LinkedBST Test Cases Menu");
			System.out.println("\n1.) Test Group A -- Removing leaves"+
			"\n2.) Test Group B -- Removing root node from small trees"+
			"\n3.) Test Group C -- More complex trees"+
			"\n0.) Exit ");
			selection = reader.readInt("Enter a selection: ");
			
			//Test Cases -- Group A				
			if (selection == 1)
			{
				tree = new LinkedBST();
				casenum = 1;  //used to increment the case number
				//Test Cases -- Group A				
				System.out.println("Test Group A\n\n");
								
				System.out.println("\nCASE " + casenum + ": ");
				System.out.println("*** Add 10, 5, 15, 3, 6, 12, 20 to an empty tree and delete 3 ***\n");
				tree.addNode(new Integer(10));
				tree.addNode(new Integer(5));
				tree.addNode(new Integer(15));
				tree.addNode(new Integer(3));
				tree.addNode(new Integer(6));
				tree.addNode(new Integer(12));
				tree.addNode(new Integer(20));
				tree.deleteNode(new Integer(3));

				System.out.println("The CORRECT display is: \n[5, 6, 10, 12, 15, 20]\n");
				System.out.println("The STUDENT's display is: \n" + tree.inOrder()+"\n");

				System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
									+ "give .5/.5 point.\n\n");
				reader.pause();
				casenum++;
				
				//2
				System.out.println("\nCASE " + casenum + ": ");
				System.out.println("*** delete 6 from the same tree ***\n");
				tree.deleteNode(new Integer(6));

				System.out.println("The CORRECT display is: \n[5, 10, 12, 15, 20]\n");
				System.out.println("The STUDENT's display is: \n" + tree.inOrder()+"\n");

				System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
									+ "give .5/.5 point.\n\n");
				reader.pause();
				casenum++;
				
				//3
				System.out.println("\nCASE " + casenum + ": ");
				System.out.println("*** delete 12 from the same tree ***\n");
				tree.deleteNode(new Integer(12));

				System.out.println("The CORRECT display is: \n[5, 10, 15, 20]\n");
				System.out.println("The STUDENT's display is: \n" + tree.inOrder()+"\n");

				System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
									+ "give .5/.5 point.\n\n");
				reader.pause();
				casenum++;

				//4
				System.out.println("\nCASE " + casenum + ": ");
				System.out.println("*** delete 20 from the same tree ***\n");
				tree.deleteNode(new Integer(20));

				System.out.println("The CORRECT display is: \n[5, 10, 15]\n");
				System.out.println("The STUDENT's display is: \n" + tree.inOrder()+"\n");

				System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
									+ "give .5/.5 point.\n\n");
				reader.pause();
				casenum++;


				//5
				System.out.println("\nCASE " + casenum + ": ");
				System.out.println("*** delete 5 from the same tree ***\n");
				tree.deleteNode(new Integer(5));

				System.out.println("The CORRECT display is: \n[10, 15]\n");
				System.out.println("The STUDENT's display is: \n" + tree.inOrder()+"\n");

				System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
									+ "give .5/.5 point.\n\n");
				reader.pause();
				casenum++;

				//6
				System.out.println("\nCASE " + casenum + ": ");
				System.out.println("*** delete 15 from the same tree ***\n");
				tree.deleteNode(new Integer(15));

				System.out.println("The CORRECT display is: \n[10]\n");
				System.out.println("The STUDENT's display is: \n" + tree.inOrder()+"\n");

				System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
									+ "give .5/.5 point.\n\n");
				reader.pause();
				casenum++;

				//7
				System.out.println("\nCASE " + casenum + ": ");
				System.out.println("*** delete 10 from the same tree ***\n");
				tree.deleteNode(new Integer(10));

				System.out.println("The CORRECT display is: \n[]\n");
				System.out.println("The STUDENT's display is: \n" + tree.inOrder()+"\n");

				System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
									+ "give .5/.5 point.\n\n");
				reader.pause();
				casenum++;
			}
			//Test Cases -- Group B				
			else if (selection == 2)
			{
				tree = new LinkedBST();
				casenum = 1;  //used to increment the case number
				//Test Cases -- Group B				
				System.out.println("Test Group B\n\n");
								
				System.out.println("\nCASE " + casenum + ": ");
				System.out.println("*** Add 10 to an empty tree and delete 10 ***\n");
				result1 = tree.addNode(new Integer(10));
				result2 = tree.deleteNode(new Integer(10));

				System.out.println("The CORRECT display is: \ntrue true []\n");
				System.out.println("The STUDENT's display is: \n" + result1 + " " + result2 + " " + tree.inOrder()+"\n");

				System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
									+ "give .5/.5 point.\n\n");
				reader.pause();
				casenum++;
				
				//2
				System.out.println("\nCASE " + casenum + ": ");
				System.out.println("*** Adding 10, 5, 15 to the tree and deleting 5***\n");
				tree = new LinkedBST();
				tree.addNode(new Integer(10));
				tree.addNode(new Integer(5));
				tree.addNode(new Integer(15));
				tree.deleteNode(new Integer(5));
				answerTree = tree.inOrder();

				System.out.println("The CORRECT display is:   \t[10, 15]\n");
				System.out.println("The STUDENT's display is: \t" + answerTree + "\n");
				System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
									+ "give .5/.5 point.\n\n");
				reader.pause();
				casenum++;
				
				//3
				System.out.println("\nCASE " + casenum + ": ");
				System.out.println("*** Adding 10, 5, 15 to the tree and deleting 15***\n");
				tree = new LinkedBST();
				tree.addNode(new Integer(10));
				tree.addNode(new Integer(5));
				tree.addNode(new Integer(15));
				tree.deleteNode(new Integer(15));
				answerTree = tree.inOrder();

				System.out.println("The CORRECT display is:   \t[5, 10]\n");
				System.out.println("The STUDENT's display is: \t" + answerTree + "\n");
				System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "

									+ "give .5/.5 point.\n\n");
				reader.pause();
				casenum++;

				//4
				System.out.println("\nCASE " + casenum + ": ");
				System.out.println("*** Adding 10, 5, 15 to the tree and deleting 10***\n");
				tree = new LinkedBST();
				tree.addNode(new Integer(10));
				tree.addNode(new Integer(5));
				tree.addNode(new Integer(15));
				tree.deleteNode(new Integer(10));
				answerTree = tree.inOrder();

				System.out.println("The CORRECT display is:   \t[5, 15]\n");
				System.out.println("The STUDENT's display is: \t" + answerTree + "\n");
				System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
									+ "give .5/.5 point.\n\n");
				reader.pause();
				casenum++;
				//5
				System.out.println("\nCASE " + casenum + ": ");
				System.out.println("*** Adding 10, 5, to the tree and deleting 10***\n");
				tree = new LinkedBST();
				tree.addNode(new Integer(10));
				tree.addNode(new Integer(5));
				tree.deleteNode(new Integer(10));
				answerTree = tree.inOrder();

				System.out.println("The CORRECT display is:   \t[5]\n");
				System.out.println("The STUDENT's display is: \t" + answerTree + "\n");
				System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
									+ "give .5/.5 point.\n\n");
				reader.pause();
				casenum++;
				//6
				System.out.println("\nCASE " + casenum + ": ");
				System.out.println("*** Adding 10, 5, to the tree and deleting 5***\n");
				tree = new LinkedBST();
				tree.addNode(new Integer(10));
				tree.addNode(new Integer(5));
				tree.deleteNode(new Integer(5));
				answerTree = tree.inOrder();

				System.out.println("The CORRECT display is:   \t[10]\n");
				System.out.println("The STUDENT's display is: \t" + answerTree + "\n");
				System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
									+ "give .5/.5 point.\n\n");
				reader.pause();
				casenum++;
				//7
				System.out.println("\nCASE " + casenum + ": ");
				System.out.println("*** Adding 10, 15, to the tree and deleting 10***\n");
				tree = new LinkedBST();
				tree.addNode(new Integer(10));
				tree.addNode(new Integer(15));
				tree.deleteNode(new Integer(10));
				answerTree = tree.inOrder();

				System.out.println("The CORRECT display is:   \t[15]\n");
				System.out.println("The STUDENT's display is: \t" + answerTree + "\n");
				System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
									+ "give .5/.5 point.\n\n");
				reader.pause();
				casenum++;
				//8
				System.out.println("\nCASE " + casenum + ": ");
				System.out.println("*** Adding 10, 15, to the tree and deleting 15***\n");
				tree = new LinkedBST();
				tree.addNode(new Integer(10));
				tree.addNode(new Integer(15));
				tree.deleteNode(new Integer(15));
				answerTree = tree.inOrder();

				System.out.println("The CORRECT display is:   \t[10]\n");
				System.out.println("The STUDENT's display is: \t" + answerTree + "\n");
				System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
									+ "give .5/.5 point.\n\n");
				reader.pause();
				casenum++;
				//2  When done
				System.out.print("\nThis program will terminate when you ");
				reader.pause();
				System.exit(0);
				casenum++;

			}
			//Test Cases -- Group C				
			else if (selection == 3)
			{
				tree = new LinkedBST();
				casenum = 1;  //used to increment the case number
				//Test Cases -- Group C				
				System.out.println("Test Group C\n\n");
								
				System.out.println("\nCASE " + casenum + ": ");
				System.out.println("*** Nasty test cases ***\n");
				System.out.println("*** Add 1, 0, 9, 7, 3, 8, 2, 4, 6, 5 to an empty tree and countLeaf ***\n");
				tree.addNode(new Integer(1));
				tree.addNode(new Integer(0));
				tree.addNode(new Integer(9));
				tree.addNode(new Integer(7));
				tree.addNode(new Integer(3));
				tree.addNode(new Integer(8));
				tree.addNode(new Integer(2));
				tree.addNode(new Integer(4));
				tree.addNode(new Integer(6));
				tree.addNode(new Integer(5));

				System.out.println("The CORRECT display is: \n4\n");
				System.out.println("The STUDENT's display is: \n" + tree.countLeaf()+"\n");

				System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
									+ "give 1/1 point.\n\n");
				reader.pause();
				casenum++;
				
				//2
				System.out.println("\nCASE " + casenum + ": ");
				System.out.println("*** Nasty test cases ***\n");
				System.out.println("*** Add 1, 0, 9, 7, 3, 8, 2, 4, 6, 5 to an empty tree and delete 7 ***\n");
				tree.deleteNode(new Integer(7));

				System.out.println("The CORRECT display is: \n[0, 1, 2, 3, 4, 5, 6, 8, 9]\n");
				System.out.println("The STUDENT's display is: \n" + tree.inOrder()+"\n");

				System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
									+ "give 1/1 point.\n\n");
				reader.pause();
				casenum++;
				
				//3
				System.out.println("\nCASE " + casenum + ": ");
				System.out.println("*** Nasty test cases ***\n");
				System.out.println("*** delete 9 ***\n");

				tree.deleteNode(new Integer(9));

				System.out.println("The CORRECT display is: \n[0, 1, 2, 3, 4, 5, 6, 8]\n");
				System.out.println("The STUDENT's display is: \n" + tree.inOrder()+"\n");

				System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
									+ "give 1/1 point.\n\n");
				reader.pause();
				casenum++;

				//4
				System.out.println("\nCASE " + casenum + ": ");
				System.out.println("*** Nasty test cases ***\n");
				System.out.println("*** delete 3 ***\n");

				tree.deleteNode(new Integer(3));

				System.out.println("The CORRECT display is: \n[0, 1, 2, 4, 5, 6, 8]\n");
				System.out.println("The STUDENT's display is: \n" + tree.inOrder()+"\n");

				System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
									+ "give 1/1 point.\n\n");
				reader.pause();
				casenum++;
			}
			//Test Cases -- Old Group A
			//Part I and II
			else if (selection == 11)
			{
				tree = new LinkedBST();
				casenum = 1;  //used to increment the case number
				//Test Cases -- Group A				
				System.out.println("Test Group A\n\n");
								
				System.out.println("\nCASE " + casenum + ": ");
				System.out.println("*** Adding 5 to an empty tree ***\n");
				result = tree.addNode(new Integer(5));

				System.out.println("The CORRECT display is: \ntrue\n");
				System.out.println("The STUDENT's display is: \n" + result + "\n");

				System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
									+ "give 1/1 point.\n\n");
				reader.pause();
				casenum++;
				
				//2
				System.out.println("\nCASE " + casenum + ": ");
				System.out.println("*** Adding 3, 4, 2, and 7 to the tree ***\n");
				if(tree.addNode(new Integer(3)))
					System.out.println("3 was successfully added.");
				if(tree.addNode(new Integer(4)))
					System.out.println("4 was successfully added.");
				if(tree.addNode(new Integer(2)))
					System.out.println("2 was successfully added.");
				if(tree.addNode(new Integer(7)))
					System.out.println("7 was successfully added.");

				System.out.println("\nCase " + casenum + ": If 3, 4, 2, and 7 were successfully added, "
									+ "give 1/1 point.\n\n");
				reader.pause();
				casenum++;
				
				//3
				System.out.println("\nCASE " + casenum + ": ");
				System.out.println("*** Displaying preOrder ***\n");
				answerTree = tree.preOrder();

				System.out.println("The CORRECT display is:   \t[5, 3, 2, 4, 7]\n");
				System.out.println("The STUDENT's display is: \t" + answerTree + "\n");

				System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
									+ "give 1/1 point.\n\n");
				reader.pause();
				casenum++;
				
				//4
				System.out.println("\nCASE " + casenum + ": ");
				System.out.println("*** Displaying inOrder ***\n");
				answerTree = tree.inOrder();

				System.out.println("The CORRECT display is:   \t[2, 3, 4, 5, 7]\n");
				System.out.println("The STUDENT's display is: \t" + answerTree + "\n");

				System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
									+ "give 1/1 point.\n\n");
				reader.pause();
				casenum++;

				//5
				System.out.println("\nCASE " + casenum + ": ");
				System.out.println("*** Displaying postOrder ***\n");
				answerTree = tree.postOrder();

				System.out.println("The CORRECT display is:   \t[2, 4, 3, 7, 5]\n");
				System.out.println("The STUDENT's display is: \t" + answerTree + "\n");

				System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
									+ "give 1/1 point.\n\n");
				reader.pause();
				casenum++;

			}
			else if (selection == 0)
			{
				//When done
				System.out.print("\nI hope that this has been a pleasant testing experience.\n");
				System.out.print("\nThis program will terminate when you ");
				reader.pause();
				System.exit(0);

				
			}			
		}while (selection != 0);
	}

}