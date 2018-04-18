// APMatrix
// Jay Patel
// Helps you make matrices and stuff
import java.util.Scanner;
public class APMatrix{
    private int[][] mat;
	public APMatrix(int R, int C, boolean enter){
        Scanner input = new Scanner(System.in);
        int val;
        if (enter){
            mat = new int[R][C];
            for(int i = 0; i < R; i++){
                for (int j = 0; j < C; j++){
                    System.out.print("What do you want to be the value in the " + (i+1) + " x " + (j+1) + " cell?");
                    val = input.nextInt();
                    mat [i][j] = val;
                    System.out.println();
                }
            }
        }
        else{
            mat = new int[R][C];
        }
    }
    public APMatrix(int[][] copyMe){
        mat = new int[copyMe.length][copyMe[0].length];
        for(int i = 0; i < copyMe.length; i++){
            for (int j = 0; j < copyMe[0].length; j++){
                mat[i][j] = copyMe[i][j];
            }
        }
    }
    public int getRows(){
        return mat.length;
    }
    public int getColumns(){
        return mat[0].length;
    }
    public String toString(){
        String res = "";
        for(int i = 0; i < getRows(); i++){
            res += "\t";
            for (int j = 0; j < getColumns(); j++){
                res += mat[i][j] + "\t";
            }
            res += "\n";
        }
        return res;
    }
    public APMatrix matrixMultiply(APMatrix m1){
        if (getColumns() == m1.getRows()){
            int[][] res = new int[getRows()][m1.getColumns()];
            for (int r = 0; r < getRows(); r++){
            	for (int a = 0; a < m1.getColumns(); a++){
            		for (int c = 0; c < m1.getRows(); c++){
            			res[r][a] += mat[r][c]*m1.mat[c][a];
            		}
            	}
            }
            return new APMatrix(res);
        }
        else{
        	  System.out.println("These matrices cannot be multiplied!!!");
        }
        return null;
    }
    public int sumCross(int r, int c){
        int sum = 0;
        if (r-1 >= getRows() || c-1 >= getColumns()){
            return -1;
        }
        for (int i = 0; i < getRows(); i++){
            sum += mat[i][c-1];
        }
        for (int i = 0; i < getColumns(); i++){
            sum += mat[r-1][i];
        }
        sum -= mat[r-1][c-1];
        return sum;
    }
    public APMatrix removeCross(int r, int c){
        if (r-1 >= getRows() || c-1 >= getColumns()){ // 
            System.out.println("You can't remove that cross!!!");
            return this;
        }
        int[][] cop = new int[mat.length - 1][mat[0].length - 1];
        int flagr = 0, flagc = flagr; // change what index you are copying into
        for (int i = 0; i < getRows(); i++){
            if(i == r-1){ // if you reach the row you want to remove than you shift everything back one
                flagr = -1;
                continue;        
            }
            for(int j = 0; j < getColumns(); j++){
                if (i != r-1 && j != c-1) // if you reach the column you want to remove than you shift everything back one
                    cop[i+flagr][j+flagc] = mat[i][j];
                else
                    flagc = -1;
            }
            flagc = 0;
        }
        return new APMatrix(cop);
    }
}