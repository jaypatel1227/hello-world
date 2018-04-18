import java.util.Arrays;
import java.util.Scanner;

public class Heap_Runner {
   public static void main(String[] args){
       HeapPriorityQueue h = new HeapPriorityQueue(100);
       int selection = 25;
       Scanner scanner = new Scanner(System.in);
       do {
           System.out.println("\n\n\n\n\n1. Add\n2. isEmpty\n3. Remove\n4. Peek\n5. Print\n6. isFull\n7. getCount\n8. Random test\n0. Finish");
           System.out.print("What would you like to do: ");
           try {
               selection = scanner.nextInt();
           } catch (Exception e) {
               continue;
           }
           if (selection == 1) {
               System.out.print("What do you want to add: ");
               String a = scanner.next();
               h.add(a);
           }
           if (selection == 2) {
               System.out.println(h.isEmpty());
           }
           if (selection == 3) {
               System.out.println(h.removeMax());
           }
           if (selection == 4) {
               System.out.println(h.peekMax());
           }
           if (selection == 5) {
               System.out.println(h);
           }
           if (selection == 6) {
               System.out.println(h.isFull());
           }
           if (selection == 7) {
               System.out.println(h.getCount());
           }
           if (selection == 8) {
               System.out.print("What size do you want the heap to be: ");
               int a = scanner.nextInt();
               HeapPriorityQueue hpq = new HeapPriorityQueue(a);
               int[] rand = new int[a];
               int[] ress = new int[a];
               for (int i : rand) {
                   i = (int) (a * Math.random() + 1);
               }
               for (int i : rand) {
                   hpq.add(i);
               }
               int i = 0;
               while (!hpq.isEmpty()) {
                   ress[i] = (int) hpq.removeMax();
                   i++;
               }
               System.out.println(Arrays.equals(rand, ress));
           }
           if (selection == 42){
               h.add("5");
               h.add("8");
               h.add("1");
               h.add("7");
               h.add("4");
               h.add("6");
               h.add("9");
               h.add("2");
               h.add("0");
               h.add("3");
           }
       }while (selection != 0);
   }
}
