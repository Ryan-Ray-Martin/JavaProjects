package edu.neu.ccs.cs5004.assignment4.Problem1;

import static edu.neu.ccs.cs5004.assignment4.Problem1.VehicleSize.LARGEVEHICLE;
/**
 * An concrete class of an large vehicle that contains the function to
 * return the vehicle size, which helps in organizing the entire parking lot
 * (see parking lot class).
 */

public class LargeVehicle extends AbstractVehicle {

  public final VehicleSize size = LARGEVEHICLE;

  /** A constructor of the large vehicle object that contains information
   * about the vehicle's size.
   * @param size
   */

  LargeVehicle(VehicleSize size) {
    super(size);
  }

  /** A method that returns the vehicle size.
   * @return the size of the vehicle.
   */

  @Override
  public VehicleSize getSize() {
    return super.getSize();
  }

}
