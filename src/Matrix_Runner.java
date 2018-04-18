// Run this file and it will try to check if you have all things accounted for
import java.util.Random;
public class Matrix_Runner{
  public static void main(String[] args){
		int [][]testa1 = {{77,22,1,33},{5,3,10,4},{66,44,2,55}};
		APMatrix m1 = new APMatrix(testa1);  
		System.out.println("The STUDENT result is: \n" + m1.sumCross(2,3));
		System.out.println("The STUDENT result is: \n" + m1.sumCross(3,4));
	  int[][] m = {{1,2,3},{4,5,6}};
      APMatrix a = new APMatrix(m);
      System.out.println(a);
      int[][] i = {{7,8},{9,10},{11,12}};
      APMatrix b = new APMatrix(i);
      System.out.println(b);
      System.out.println(a.matrixMultiply(b));
      Random random = new Random();
      a = new APMatrix(randomSize(4,4));
      b = new APMatrix(randomSize(6,6));
      int a1 = random.nextInt(4);
      int a2 = random.nextInt(4);
      int b1 = random.nextInt(6);
      int b2 = random.nextInt(6);
      System.out.println();
      a = new APMatrix(randomSize(2,2));
      b = new APMatrix(randomSize(2,2));
      System.out.println( a + "\n\n" + b + "\n\n" + a.matrixMultiply(b));
  }
  public static int[][] randomSize(int r, int c){
      int matrix[][]= new int[r][c];
      for (int[] i: matrix){
        for(int j = 0; j < i.length; j++){
            Random random = new Random();
            i[j] = (random.nextInt(200)-100);
        }
      }
      return matrix;
  }
  public static int[][] randomDim(){
      int r = (int)(Math.random()*10);
      int c = (int)(Math.random()*10);
      int matrix[][]= new int[r][c];
      for (int[] i: matrix){
        for(int j = 0; j < i.length; j++){
          Random random = new Random();
          i[j] = (random.nextInt(200)-100);
        }
      }
      return matrix;
  }    
  public static int[][] randomSq(){
      int a = (int)(Math.random()*10);
      int matrix[][]= new int[a][a];
      for (int[] i: matrix){
        for(int j = 0; j < i.length; j++){
          Random random = new Random();
          i[j] = (random.nextInt(200)-100);
        }
      }
      return matrix;
  }
}