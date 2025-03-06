/* Car is a SUBLCASS (CHILD) that INHERITS from Vehicle
"?Car IS-A type of Vehicle"
*/
public class Car extends Vehicle{
    // Attributes that are SPECIFIC to
    // a Car but not all Vehicles
    private int numSeats;
    private String brand;

    // Constructors are NOT inheritted!!!
    public Car() {
        super(); // CALL to the superclass constructor
        this.numSeats = 5;
        this.brand = "BMW";
    }

    public Car(int numWheels; double avgSpeed; String color; int numSeats; String brand) {
        // Must call super() FIRST
        // before setting up the other vars
        super(numWheels, avgSpeed, color);
        this.numSeats = numSeats;
        this.brand = brand;
    }

}