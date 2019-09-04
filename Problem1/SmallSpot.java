package edu.neu.ccs.cs5004.assignment4.Problem1;

/**
 * A concrete class of a Small parking spot, which extends the abstract parking spot, and
 * contains all the method therein, including the methods to get a parking spot's size, to remove
 * a vehicle from a parking spot, and assign a vehicle to a parking spot.
 */


public class SmallSpot extends AbstractParkingSpot {

  /** A constructor of the Small parking spot, which contains the size of the
   * parking spot.
   * @param size
   */

  public SmallSpot(ParkingSlotSize size) {
    super(size);
  }

  /** A method that returns the size of the parking spot.
   * @return the parking slot size.
   */

  @Override
  public ParkingSlotSize getSize() {
    return super.getSize();
  }

  /** A method that assigns the vehicle to a parking spot, and indicating that the
   * parking spot is not empty with a boolean.
   * @param vehicle
   * @return false if the parking spot is already taken.
   */

  @Override
  public boolean assignVehicle(AbstractVehicle vehicle) {
    return super.assignVehicle(vehicle);
  }
}
