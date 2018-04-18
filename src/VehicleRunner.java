// VehicleRunner
// McKeen
// Testing the Vehicle Class 

//import TerminalIO.KeyboardReader;  // only needed if KeyboardReader is not in your workspace already

public class VehicleRunner
{
	public static void main(String[] args)
	{
		KeyboardReader reader = new KeyboardReader();
		
		//CREATE A NEW VEHICLE and DO STUFF WITH IT
		Vehicle david = new Vehicle();
		david.setnumPassengers(20);
		System.out.println("The Range is : " + david.getRange());
		david.displayInfo();
	}
}



























