// TwoDArray.java
// A super smart student named: Jay Patel
// Using 2D Arrays again

abstract class TwoDArray
{
	KeyboardReader reader = new KeyboardReader();
	
	// Private variable 2D array
	private int[][] matrix;
	
	// Constructor 1: creates a matrix of size R x C and allows the user to enter values if enter == true
	public TwoDArray(int R, int C, boolean enter){
		if(enter == true)
		{
			matrix = new int[R][C];
			for(int i = 0; i < matrix.length; i++)
				for(int j = 0; j < matrix[0].length; j++)
					matrix[i][j] = reader.readInt("Enter the value in row " + (i+1) + ", column " + (j+1) + ": ");
		}
		else
		{
			matrix = new int[R][C];
		}
	}
	
	// Constructor 2: creates a 2D array that is a copy of copyMe
	public TwoDArray(int[][] copyMe)
	{
		matrix = new int[copyMe.length][copyMe[0].length];
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix[0].length; j++)
			{
				matrix[i][j] = copyMe[i][j];
			}
		}	
	}
	
	// Accessor methods
	// Allows access to a value in the private array
	public int get(int r, int c)
	{
		return matrix[r][c];
	}
	
	
	// Returns number of rows
	public int getNumRows()
	{
		return matrix.length;
	}
	
	// Returns number of columns
	public int getNumColumns()
	{
		return matrix[0].length;
	}
	
	// Returns row r
	public int[] getRow(int r)
	{
		return matrix[r];
	}
	
	// Overwrites toString method to display the contents of the 2D array
	public String toString(){
		String s1 = "";
		for(int i = 0; i < this.matrix.length; i++){
			for(int j = 0; j < this.matrix[0].length; j++){
				s1 += (this.matrix[i][j] + "\t");
			}
			s1 += "\n";
		}
		return s1;
	}
	
	// Any child class will not build unless it contains a completed version
	// of the the following abstract methods:
	
	abstract int[][] getDiagonals();
	
	abstract int convertToBase10(int row, int col, int oldBase);
	
	abstract void makeMeLaugh();
	
}