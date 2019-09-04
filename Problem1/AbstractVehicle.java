package edu.neu.ccs.cs5004.assignment4.Problem1;

/**
 * An abstract class of an abstract vehicle that contains the function to
 * return the vehicle size, which helps in organizing the entire parking lot
 * (see parking lot class).
 */
public abstract class AbstractVehicle {

  private final VehicleSize size;

  /** A constructor of the abstract vehicle object that contains information
   * about the vehicle's size.
   * @param size
   */
  AbstractVehicle(VehicleSize size) {
    this.size = size;
  }

  /** A method that returns the vehicle size.
   * @return the size of the vehicle.
   */
  public VehicleSize getSize() {
    return size;
  }
}
