package edu.neu.ccs.cs5004.assignment4.Problem1;

import static edu.neu.ccs.cs5004.assignment4.Problem1.VehicleSize.DISABLEDVEHICLE;

/**
 * An concrete class of an disabled vehicle that contains the function to
 * return the vehicle size, which helps in organizing the entire parking lot
 * (see parking lot class).
 */

public class DisabledVehicle extends AbstractVehicle {

  public final VehicleSize size = DISABLEDVEHICLE;

  /** A constructor of the disabled vehicle object that contains information
   * about the vehicle's size.
   * @param size
   */

  DisabledVehicle(VehicleSize size) {
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
