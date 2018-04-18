// Ractangles
// Jay Patel
// Lets you create a Rectangles objects
public class Rectangles extends Polygons {
	private boolean isSquare;
	public Rectangles(int width, int height){
		super(width, height);
        if (width == height){
            isSquare = true;
        }
        else{
            isSquare = false;
        }
	}
    public boolean getIsSquare(){
        return isSquare;
    }
	public double getArea() {
		return (double)getWidth() * getHeight();
	}
    public void displayInfo(){
        System.out.println("\n\nSHAPE INFO:");
		    System.out.println("The figure is a rectangle.");
        super.displayInfo();
        System.out.println("Area: " + getArea());
        if (isSquare){
            System.out.println("This rectangle is a square");
        }
        else{
            System.out.println("This rectangle is not a square");
        }
    }
    

}
