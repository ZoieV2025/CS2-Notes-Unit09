/* Vehicle is SUPERCLASS (PARENT)
Put the most GENERAL attributes + behaviors in this class definition!
Java classes can have MULTIPLE CHILDREN, but ONLY ONE PARENT!
*/
public class Vehicle{
    // 1. INSTANCE VARIABLE
    private int numWheels;
    private double avgSpeed;
    private String color;
    // 2. 
    // Methods to INITIALIZE all variables
    public Vehicle() {
        this.numWheels = 4;
        this.avgSpeed = 60;
        this.color = "White";
    }
    // Constructor with formal parameters
    public Vehicle(int numWheels; double avgSpeed; String color) {
        // INITIALIZE to passed arguments
        this.numWheels = numWheels;
        this.avgSpeed = avg.Speed;
        this.color = color;
    }

}