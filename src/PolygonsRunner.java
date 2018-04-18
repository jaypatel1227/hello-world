//Patel Jay
//PolygonsRunner.java 
//An introduction to inheritance in OOP

import java.util.Scanner;

public class PolygonsRunner
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
        int height;
        int width;
        Triangle a = new Triangle(4,3,"right");
        Triangle b = new Triangle(9,3, "acute");
        Rectangles c = new Rectangles(4,4);
        Rectangles d = new Rectangles(6,2);
        Polygons[] ar = {a,b,c,d};
        for (int i = 0; i<ar.length; i++){
            System.out.println("\n\nInfo for figure # " + (i + 1) + ":");
            ar[i].displayInfo();
            if (i<2){
                System.out.println("Area: " + ar[i].getArea());
            }
        }
	}	
}
