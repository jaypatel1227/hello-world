public class ConversionArray extends TwoDArray {
    // Inherited stuff
    public ConversionArray(int R, int C, boolean enter) {
        super(R, C, enter);
    }
    public ConversionArray(int[][] copyMe) {
        super(copyMe);
    }
    // One.
    // Gets the diagonals and places them in an 2 x n array
    public int[][] getDiagonals() {
        if (isSquare()){
            int[][] res = new int[2][getNumRows()];
            for(int r = 0; r < getNumRows(); r++){
                res[0][r] = get(r,r);
            }
            for(int c = getNumColumns()-1; c > -1; c --){
                res[1][getNumColumns() - 1 - c] = get(getNumColumns() - 1 - c, c);
            }
            return res;
        }
        System.out.println("NOT SQUARE!");
        return new int[][]{{1738}};
    }
    // Checks the diagonalizability of the private matrix
    private boolean isSquare() {
        return getNumRows() == getNumColumns();
    }
    // Two.
    // Takes the value at [r][c] and converts it from old base to base10
    // If r or c are invalid, returns 420; If the value at [r][c] if not in oldBase, returns -1
    public int convertToBase10(int row, int col, int oldBase) {
        if ((row < getNumRows() && row >= 0) && (col < getNumColumns() && col >= 0)){
            if (validBase(get(row,col), oldBase)){
               int val = 0;
               String value = Integer.toString(get(row, col));
               for (int i = value.length()-1; i > -1; i --){
                   val += Integer.parseInt(value.substring(i,i+1)) * Math.pow(oldBase, value.length() - 1 - i);
               }
               return val;
            }
            return -1;
        }
        return 420;
    }
    // Checks if the value is actually of the base
    private boolean validBase(int i, int base) {
        String s = Integer.toString(i);
        if (s.substring(0,1).equals("-")){
            s = s.substring(1);
        }
        for(int b = 0; b < s.length(); b ++){
            if (Integer.parseInt(s.substring(b,b+1)) >= base){
                return false;
            }
        }
        return true;
    }
    // Three.
    // Prints a joke!
    public void makeMeLaugh() {
        System.out.println("\n\"Knock, knock.\"\n" +
                "\n" +
                "\"Who's there?\"\n" +
                "\n" +
                "very long pause...\n" +
                "\n" +
                "\"Java.\"");
    }
    // Four.
    // PlaceHolder
}
