package edu.neu.ccs.cs5004.assignment4.Problem1;

/**
 * An abstract class of a parking spot that implements the IParkingSpot interface,
 * containing the methods to get a parking spot's size, and assign a vehicle to a parking spot.
 */
public abstract class AbstractParkingSpot implements IParkingSpot{
  boolean free;
  private edu.neu.ccs.cs5004.assignment4.Problem1.AbstractVehicle vehicle;
  private final ParkingSlotSize size;

  /** A constructor of the abstract parking spot, which contains the size of the
   * parking spot.
   * @param size
   */
  AbstractParkingSpot(ParkingSlotSize size) {
    this.size = size;
    free = true;
  }

  /** A method that returns the size of the parking spot.
   * @return the parking slot size.
   */
  public ParkingSlotSize getSize() {
    return size;
  }

  /** A method that assigns the vehicle to a parking spot, and indicating that the
   * parking spot is not empty with a boolean.
   * @param vehicle
   * @return false if the parking spot is already taken.
   */
  public boolean assignVehicle(AbstractVehicle vehicle){
    this.vehicle = vehicle;
    free = false;
    return true;
  }
  
}
